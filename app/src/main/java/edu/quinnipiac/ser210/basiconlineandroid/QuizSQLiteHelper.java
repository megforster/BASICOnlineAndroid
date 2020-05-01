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
    private static final int DATABASE_VERSION = 3;

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


        db.execSQL(SQL_CREATE_QUESTION_TABLE);
        fillQuestionTable();

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + QuizSourceDB.quizQuestionsTable.TABLE_NAME );
        onCreate(db);

    }

    private void fillQuestionTable(){

        quizQuestions quest1 = new quizQuestions("Social Media are _______________",
                "forms of electronic communication through which users create online communities to share information, ideas,\" + personal messages, and other content\", ",
                "A form of music. A place to find music and other forms of media.",
                "A form of movie media. A place to find movies.",
                1);
        addQuizQuestion(quest1);

        quizQuestions quest2 = new quizQuestions("The symbol on screen that shows the current position of the user, which can be a flashing line, arrow, or uppercase I, is called the______",
                "Pointer or Position",
                "Cursor or Mouse",
                "Clicker",
                2);
        addQuizQuestion(quest2);

        quizQuestions quest3 = new quizQuestions("True or False. The only information online about you are things you have posted.",
                "True. The only information online about me is from my social media accounts",
                "I don't know",
                "False. Public government records can show if you own a home, vote, or have a criminal record, your family can post information about you, and GPS services like Google Maps have an image of your home.",3);
        addQuizQuestion(quest3);

        quizQuestions quest4 = new quizQuestions("When you want to save a website you commonly use or want to visit later you add it to your ...",
                "Bookmarks (or favorites depending on the web browser) ",
                "Save For Later",
                "Favorites",
                1);
        addQuizQuestion(quest4);

        quizQuestions quest5 = new quizQuestions("True or False. Social media is much safer than the internet because there are little to no scams",
                "True. More people are on social media today so there is less harm.",
                "False. Scams still exist on social media sites. Whenever you are online you must be vigilant",
                "I don't know",
                2);
        addQuizQuestion(quest5);

        quizQuestions quest6 = new quizQuestions("The two main types of computers are _____and ______",
                "Ipad and Tablet",
                "Iphone and Android",
                "Desktop and Laptop ",
                3);
        addQuizQuestion(quest6);

        quizQuestions quest7 = new quizQuestions("True or False. The left and right facing arrows near the top of the browser page allow you to move through websites you've recently visited. The left arrow takes you back and the right arrow takes you forward.",
                "True. The arrows are used for forward and backward navigation. If you ever see an arrow going in a circle next to those, that's the refresh button that reloads the webpage",
                "False. The arrows are used for moving the application.",
                "I don't know",
                1);
        addQuizQuestion(quest7);

        quizQuestions quest8 = new quizQuestions("DM is an acronym for _____. ",
                "Donate Money! Social media term to ask followers to Donate money to a cause.",
                "Direct Message! Direct messages are a social media term for a message you send to only one person and can only be seen by you and the person you sent it to. ",
                "Down the Middle! To spilt the bill evenly.",
                2);
        addQuizQuestion(quest8);

        quizQuestions quest9 = new quizQuestions("True or False. The tower is the part of the computer that shows you things",
                "True. The tower is what shows you things",
                "I don't know",
                "False. The tower is part of a desktop computer that stores the computer parts. ",
                3);
        addQuizQuestion(quest9);

        quizQuestions quest10 = new quizQuestions("True or False. It is okay to use the same password for everything",
                "Tab ",
                "Browser",
                "Cursor",
                1);
        addQuizQuestion(quest10);

        quizQuestions quest11 = new quizQuestions("True or False. It is okay to use the same password for everything",
                "True. This way you remember.",
                "False. You should use different passwords for accounts you have. ",
                "I don't know.",
                2);
        addQuizQuestion(quest11);

        quizQuestions quest12 = new quizQuestions("True or False. URLs are like street addresses because they tell your browser where to go on the internet.",
                "False. Many websites have them",
                "I don't know.",
                "True. Each website online has a unique address called a URL. URL stands for Uniform Resource Locator",
                3);
        addQuizQuestion(quest12);

        quizQuestions quest13 = new quizQuestions("The most popular social media groups are Facebook, Twitter, and .",
                "Instagram. Other popular groups include Pinterest, and YouTube",
                "Myspace",
                "PartyHop",
                1);
        addQuizQuestion(quest13);

        quizQuestions quest14 = new quizQuestions("True or false. Microsoft Word is an example of an application.",
                "False. Application only apply to phones.",
                "True. Other examples of applications include Google Chrome and your computers calculator",
                "I don't know.",
                2);
        addQuizQuestion(quest14);

        quizQuestions quest15 = new quizQuestions("Who are the most at risk online? ",
                "seniors and adults",
                "teenagers",
                "All of the above. Everyone is at risk if they don't understand the threats",
                3);
        addQuizQuestion(quest15);

        quizQuestions quest16 = new quizQuestions("What symbol does your cursor turn into when you have it over a link? ",
                " A hand. That's how you know you've found a link! ",
                "A magnifying glass. To see clearer.",
                "A sand timer. To see how long it loads.",
                1);
        addQuizQuestion(quest16);

        quizQuestions quest17 = new quizQuestions("True or False. It is okay to give out bank account information over email.\",",
                "True. They have my email address.",
                "False. You should not be required to give any banking information over email",
                "I don't know",
                2);
        addQuizQuestion(quest17);

        quizQuestions quest18 = new quizQuestions("The ________ is what you use to type ",
                "Mouse",
                "Trackpad",
                "Keyboard ",
                3);
        addQuizQuestion(quest18);

        quizQuestions quest19 = new quizQuestions("Which password is the most secure? '12345678', 'password', your spouse’s name, or 'T1MpFoS!",
                "T1MpFoS (least 8 characters along, has both uppercase and lowercase letters, has at least one number, has a special character)",
                "12345678 (easy to remember)",
                "your spouse's name (easy to remember)",
                1);
        addQuizQuestion(quest19);

        quizQuestions quest20 = new quizQuestions("True or False. Concerns about heavy social media are depression and online harassment",
                "False. social media has no effect on people's mental health.",
                "True. Other concerns include cyberbullying and 'trolling'",
                "I don't know.",
                2);
        addQuizQuestion(quest20);



    }
    private void addQuizQuestion(quizQuestions question){
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
