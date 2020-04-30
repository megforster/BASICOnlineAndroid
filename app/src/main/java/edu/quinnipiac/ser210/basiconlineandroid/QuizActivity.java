package edu.quinnipiac.ser210.basiconlineandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class QuizActivity extends AppCompatActivity {

    private TextView tvQuestion, tvQuestCount;
    private RadioGroup radioButtonGroup;
    private RadioButton radioButton1, radioButton2, radioButton3;
    private Button enterNextButton;


    private ColorStateList defaultTextColorRB;

    private List<quizQuestions> questionsList;
    private quizQuestions currentQuestion;
    private int questionCount, questionTotal;
    private boolean questAnswered;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        tvQuestion = findViewById(R.id.question_view);
        tvQuestCount = findViewById(R.id.question_count);
        radioButtonGroup = findViewById(R.id.group_radio);
        radioButton1 = findViewById(R.id.button_radio1);
        radioButton2 = findViewById(R.id.button_radio2);
        radioButton3 = findViewById(R.id.button_radio3);
        enterNextButton = findViewById(R.id.enter_button_next);

        defaultTextColorRB = radioButton1.getTextColors();

        QuizSQLiteHelper quizHelper = new QuizSQLiteHelper(this);
        questionsList = quizHelper.getAllQuestions();

        questionTotal = questionsList.size();
        Collections.shuffle(questionsList);

        showNexTQuestion();

        enterNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!questAnswered) {
                    if (radioButton1.isChecked() || radioButton2.isChecked() || radioButton3.isChecked()) {
                        checkAnswer();
                    } else {
                        Toast.makeText(QuizActivity.this, "Select an answer you would like to enter", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    showNexTQuestion();
                }
            }
        });

    }
    private void showNexTQuestion(){
        radioButton1.setTextColor(defaultTextColorRB);
        radioButton2.setTextColor(defaultTextColorRB);
        radioButton3.setTextColor(defaultTextColorRB);
        radioButtonGroup.clearCheck();

        if(questionCount < questionTotal) {
            currentQuestion = questionsList.get(questionCount);

            tvQuestion.setText(currentQuestion.getQuestions());
            radioButton1.setText(currentQuestion.getChoice1());
            radioButton2.setText(currentQuestion.getChoice2());
            radioButton3.setText(currentQuestion.getChoice3());

            questionCount++;
            tvQuestCount.setText("Questions: " + questionCount + "/" + questionTotal);
            questAnswered = false;
            enterNextButton.setText("Enter");

        }else{
            finishQuiz();

        }

    }
    private void checkAnswer() {
        questAnswered = true;

        RadioButton radioButtonSelected = findViewById(radioButtonGroup.getCheckedRadioButtonId());
        int answerNumber = radioButtonGroup.indexOfChild(radioButtonSelected) + 1;

        showSolution();
    }

    private void showSolution() {
        radioButton1.setTextColor(Color.RED);
        radioButton2.setTextColor(Color.RED);
        radioButton3.setTextColor(Color.RED);

        switch (currentQuestion.getAnswerNum()) {
            case 1:
                radioButton1.setTextColor(Color.GREEN);
                tvQuestion.setText("Answer 1 is correct");
                break;
            case 2:
                radioButton2.setTextColor(Color.GREEN);
                tvQuestion.setText("Answer 2 is correct");
                break;
            case 3:
                radioButton3.setTextColor(Color.GREEN);
                tvQuestion.setText("Answer 3 is correct");
                break;
        }

        if (questionCount < questionTotal) {
            enterNextButton.setText("Next Question");
        } else {
            enterNextButton.setText("Complete Quiz");
        }
    }


    private void finishQuiz(){
        finish();
    }
}
