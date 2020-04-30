package edu.quinnipiac.ser210.basiconlineandroid;

import android.provider.BaseColumns;

public final class QuizSourceDB {

    private QuizSourceDB(){}

    public static class quizQuestionsTable implements BaseColumns {
        public static final String TABLE_NAME = "quiz_questions";
        public static final String COLUMN_QUESTIONS = "question";
        public static final String COLUMN_CHOICE1 = "choice1";
        public static final String COLUMN_CHOICE2 = "choice2";
        public static final String COLUMN_CHOICE3 = "choice3";
        public static final String COLUMN_ANSWERNUM = "answer_number";
    }

}
