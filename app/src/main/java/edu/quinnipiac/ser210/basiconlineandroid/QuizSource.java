package edu.quinnipiac.ser210.basiconlineandroid;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class QuizSource {

    // Database fields
    private SQLiteDatabase quizDatabase;
    private BasicSQLiteHelper dbHelper;
    private String[] allColumns = { BasicSQLiteHelper.COLUMN_ID,
            BasicSQLiteHelper.COLUMN_QUESTIONS };

    private String[] answerColumns = { BasicSQLiteHelper.COLUMN_ID,
            BasicSQLiteHelper.COLUMN_ANSWERS};

    public QuizSource(Context context) {
        dbHelper = new BasicSQLiteHelper(context);
    }

    public void open() throws SQLException {
        quizDatabase = dbHelper.getWritableDatabase();

    }
    public SQLiteDatabase getQuizDatabase() {return quizDatabase;}
    public void close(){
        dbHelper.close();
    }

    public quizQuestions createQuestion(String question) {
        ContentValues questionValues = new ContentValues();
        questionValues.put(BasicSQLiteHelper.COLUMN_QUESTIONS,question);
        long insertId = quizDatabase.insert(BasicSQLiteHelper.TABLE_QUIZ_QUESTIONS, null, questionValues);
        Cursor cursor = quizDatabase.query(BasicSQLiteHelper.TABLE_QUIZ_QUESTIONS,allColumns, BasicSQLiteHelper.COLUMN_ID + "=" + insertId, null, null, null,null);
        cursor.moveToFirst();
        quizQuestions newQuestion = cursorToQuestion(cursor);
        cursor.close();

        return newQuestion;
    }
    public quizQuestions createAnswers(String answers) {
        ContentValues answerValues = new ContentValues();
        answerValues.put(BasicSQLiteHelper.COLUMN_QUESTIONS, answers);
        long insertId = quizDatabase.insert(BasicSQLiteHelper.TABLE_QUIZ_QUESTIONS, null, answerValues);
        Cursor cursor = quizDatabase.query(BasicSQLiteHelper.TABLE_QUIZ_QUESTIONS, answerColumns, BasicSQLiteHelper.COLUMN_ID + "=" + insertId, null, null, null, null);
        cursor.moveToFirst();
        quizQuestions newQuestion = cursorToQuestion(cursor);
        cursor.close();

        return newQuestion;
    }

    public void deleteQuestion(quizQuestions question) {
        long id = question.getId();
        quizDatabase.delete(BasicSQLiteHelper.TABLE_QUIZ_QUESTIONS, BasicSQLiteHelper.COLUMN_ID + "=" + id, null);

    }

    public List<quizQuestions> getAllComments() {
        List<quizQuestions> comments = new ArrayList<quizQuestions>();
        //Select * from comments (sql);
        Cursor cursor = quizDatabase.query(BasicSQLiteHelper.TABLE_QUIZ_QUESTIONS,allColumns,null,null,null,null,null);
        cursor.moveToFirst();
        while(! cursor.isAfterLast()){
            quizQuestions question = cursorToQuestion(cursor);
            comments.add(question);
            cursor.moveToNext();
        }
        cursor.close();

        return comments;
    }

    private quizQuestions cursorToQuestion(Cursor cursor) {
        quizQuestions question = new quizQuestions();
        question.setId(cursor.getLong(0));
        question.setQuestions(cursor.getString(1));

        return question;
    }
}
