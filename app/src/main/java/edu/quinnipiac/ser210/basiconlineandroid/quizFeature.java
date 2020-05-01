package edu.quinnipiac.ser210.basiconlineandroid;

import android.app.ListActivity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;
import java.util.Random;



public class quizFeature extends Fragment {
    String[] questions = {"Social Media are...",
            "The sybol on screen that shows the current position of the user, which can be a flashing line, arrow, or uppercase I, is called the...",
            "True or false. The only information online about you are things you have posted.",
            "When you want to save a website you commonly use or want to visit later you add it to your ...",
            "True or false. Social media is much safer then the internet becuase there are little to no scams",
            "The two main types of computers are ... and ...",
            "True or false. The left and right facing arrows near the top of the bwoser page allow you to move through websites you've recently visited. The left arrow takes you back and the right arrow takes you foward.",
            "DM is a acronym for ...", "True or false. The tower is the part of the computer that shows you things.",
            "A ... lets you have multiple web pages open at the same time without having multiple browsers open.",
            "True or false. It is okay to use the same password for everything.",
            "True or false. URLs are like street addresses because they tell your browser where to go on the internet.",
            "The most popular social media groups are FaceBook, Twitter, and ...",
            "True or false. Microsoft Word is an example of an application.",
            "Are seniors, adults, or young adults most at risk online?",
            "What symbol does your cursor turn into when you hove it over a link?",
            "True or false. It is okay to give out bank account information over email.",
            "The ... is what you use to type.", "Which password is the most secure? '12345678', 'password', your spouses name, or 'T1MpFoS!'.",
            "True or false. Concers about heavy social media are depression and online harassment"};
    String[] answers = {"forms of electronic communication through which users create online communities to share information, ideas," +
            " personal messages, and other content", "Cursor or Mouse!",
            "False! Public government records can show if you own a home, vote, or have a criminal record, your family can post infromation about you, and GPS services like Google Maps have an image of your home.",
            "Bookmarks (or favorites depending on the web browser)!",
            "False! Scams still exist on social media sites. Whenever you are online you must be vigilant.",
            "Desktop and Laptop!",
            "True! The arrows are used for foward and backawrd naivgation. If you ever see an arrow going in a circle next to those, that's the refresh button that reloads the webpage!",
            "Direct Message! Direct messages are a social media term for a message you send to only one person and can only be seen by you and the person you sent it to.",
            "False! The tower is part of a desktop computer that stores the computer parts. The monitor or screen is what shows you things.",
            "Tab!",
            "Flase! You should use different passwords for accounts you have.",
            "True! Each website online has a unique address called a URL. URL stands for Uniform Resource Locator.",
            "Instagram! Other popular groups include Pintrist, and YouTube",
            "True! Other examples of applications inclde Google Chrome and your computers calculator.",
            "All of the above! Everyone is at risk if they don't understand the threats.",
            "A hand. That's how you know you've found a link!",
            "False. You should not be required to give any banking information over email.",
            "Keyboard!",
            "T1MpFoS! is the strongest password because it is at least 8 characters along, has both uppercase and lowercase letters, has at least one number, has a special character, and does not contain any dictionary words or personal information.",
            "True! Other concerns include cyberbullying and 'trolling'."};
    View view;
    TextView question;
    TextView answer;
    int questNum = 0;
    //int ansNum = 0;


    public quizFeature() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_quiz_feature, container, false);
        question = view.findViewById(R.id.questionText);
        question.setText(questions[0]);
        //questNum+=1;
        answer=view.findViewById(R.id.answerText);
        answer.setText("Give it your best guess!");
        Button showAnswer = (Button) view.findViewById(R.id.showAnswer);

        showAnswer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(questNum<answers.length){
                    answer.setText(answers[questNum]);
                }

            }
        });

        Button nextQuestion = (Button) view.findViewById(R.id.nextQuestion);

        nextQuestion.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                questNum+=1;
                if(questNum<questions.length){
                    question.setText(questions[questNum]);
                }else{
                    questNum = 0;
                    question.setText(questions[questNum]);
                }
                answer.setText("Give it your best guess!");
            }
        });
        return view;
    }
}


