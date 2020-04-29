package edu.quinnipiac.ser210.basiconlineandroid;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class BasicSQLiteHelper extends SQLiteOpenHelper {

        public static final String TABLE_QUIZ_QUESTIONS = "quizQuestions";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_QUESTIONS = "questions";
    public static final String COLUMN_ANSWERS = "answers";

        public static final String DATABASE_NAME = "quizQuestions.db";
        private static final int DATABASE_VERSION = 1;

        // Database creation sql statement
        private static final String DATABASE_CREATE = "create table "
                + TABLE_QUIZ_QUESTIONS + "(" + COLUMN_ID
                + " integer primary key autoincrement, " + COLUMN_QUESTIONS
                + " text not null);";

        public BasicSQLiteHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase database) {
            database.execSQL(DATABASE_CREATE);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            Log.w(BasicSQLiteHelper.class.getName(),
                    "Upgrading database from version " + oldVersion + " to "
                            + newVersion + ", which will destroy all old data");
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUIZ_QUESTIONS);
            onCreate(db);
        }

    }




