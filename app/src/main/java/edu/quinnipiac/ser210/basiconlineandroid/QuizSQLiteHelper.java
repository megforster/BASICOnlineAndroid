package edu.quinnipiac.ser210.basiconlineandroid;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;


public class QuizSQLiteHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "QUIZ.db";
    private static final int DATABASE_VERSION = 1;

    private SQLiteDatabase db;

    public QuizSQLiteHelper(Context context) {
    super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;

        final String SQL_CREATE_QUESTION_TABLE ="CREATE TABLE " +
           QuizSourceDB.quizQuestionsTable.TABLE_NAME + " ( " +
                QuizSourceDB.quizQuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizSourceDB.quizQuestionsTable.COLUMN_QUESTIONS + " TEXT, " +
                QuizSourceDB.quizQuestionsTable.COLUMN_CHOICE1 + " TEXT, " +
                QuizSourceDB.quizQuestionsTable.COLUMN_CHOICE2 + " TEXT, " +
                QuizSourceDB.quizQuestionsTable.COLUMN_CHOICE3 + " TEXT, " +
                QuizSourceDB.quizQuestionsTable.COLUMN_ANSWERNUM + " INTEGER " +
                ")";


        this.db.execSQL(SQL_CREATE_QUESTION_TABLE);
        fillQuestionTable();

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        this.db.execSQL("DROP TABLE IF EXISTS " + QuizSourceDB.quizQuestionsTable.TABLE_NAME );
        onCreate(this.db);

    }

    private void fillQuestionTable(){
        quizQuestions quest1 = new quizQuestions("Social Media are...The sybol on screen that shows the current position of the user, which can be a flashing line, arrow, or uppercase I, is called the...",
                "forms of electronic communication through which users create online communities to share information, ideas", "B", "C",1);
        addQuestion(quest1);

        quizQuestions quest2 = new quizQuestions("True or false. The only information online about you are things you have posted.", "A", "False! Public government records can show if you own a home, vote, or have a criminal record, your family can post infromation about you, and GPS services like Google Maps have an image of your home.",
                "C",2);
        addQuestion(quest2);

        quizQuestions quest3 = new quizQuestions("When you want to save a website you commonly use or want to visit later you add it to your ...", "A", "B",
                "Bookmarks (or favorites depending on the web browser)!",3);
        addQuestion(quest3);

        quizQuestions quest4 = new quizQuestions("True or false. Social media is much safer then the internet because there are little to no scams", "False! Scams still exist on social media sites. Whenever you are online you must be vigilant.",
                "B", "C",1);
        addQuestion(quest4);

        quizQuestions quest5 = new quizQuestions("The two main types of computers are ... and ...", "A", "Desktop and Laptop!", "C",2);
        addQuestion(quest5);

    }
    private void addQuestion(quizQuestions question){
        ContentValues contentvalues = new ContentValues();
        contentvalues.put(QuizSourceDB.quizQuestionsTable.COLUMN_QUESTIONS, question.getQuestions());
        contentvalues.put(QuizSourceDB.quizQuestionsTable.COLUMN_CHOICE1, question.getChoice1());
        contentvalues.put(QuizSourceDB.quizQuestionsTable.COLUMN_CHOICE2, question.getChoice2());
        contentvalues.put(QuizSourceDB.quizQuestionsTable.COLUMN_CHOICE3, question.getChoice3());
        contentvalues.put(QuizSourceDB.quizQuestionsTable.COLUMN_ANSWERNUM, question.getAnswerNum());
        db.insert(QuizSourceDB.quizQuestionsTable.TABLE_NAME, null, contentvalues);
    }

    public List<quizQuestions> getAllQuestions(){
        List<quizQuestions> questionsList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + QuizSourceDB.quizQuestionsTable.TABLE_NAME, null);


        if(cursor.moveToFirst()){
            do{
                quizQuestions question = new quizQuestions();
                question.setQuestions(cursor.getString(cursor.getColumnIndex(QuizSourceDB.quizQuestionsTable.COLUMN_QUESTIONS)));
                question.setChoice1(cursor.getString(cursor.getColumnIndex(QuizSourceDB.quizQuestionsTable.COLUMN_CHOICE1)));
                question.setChoice2(cursor.getString(cursor.getColumnIndex(QuizSourceDB.quizQuestionsTable.COLUMN_CHOICE2)));
                question.setChoice3(cursor.getString(cursor.getColumnIndex(QuizSourceDB.quizQuestionsTable.COLUMN_CHOICE3)));
                question.setAnswerNum(cursor.getInt(cursor.getColumnIndex(QuizSourceDB.quizQuestionsTable.COLUMN_ANSWERNUM)));
                questionsList.add(question);
            }while(cursor.moveToNext());

        }
        cursor.close();
        return questionsList;
    }
}
