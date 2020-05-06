/*
Authors: Megan Forster and Alexandra Martin
Basic Online for Android
Android Development Final Project
2 May 2020
 */


package edu.quinnipiac.ser210.basiconlineandroid;

public class quizQuestions {

    private long id;
    private String questions;
    private int answerNum;
    private String choice1;
    private String choice2;
    private String choice3;

    public quizQuestions() {

    }

    public quizQuestions(String questions, String choice1, String choice2, String choice3, int answerNum) {
        this.questions = questions;
        this.answerNum = answerNum;
        this.choice1 = choice1;
        this.choice2 = choice2;
        this.choice3 = choice3;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public int getAnswerNum() {
        return answerNum;
    }

    public void setAnswerNum(int answerNum) {
        this.answerNum = answerNum;
    }

    public String getChoice1() {
        return choice1;
    }

    public void setChoice1(String choice1) {
        this.choice1 = choice1;
    }

    public String getChoice2() {
        return choice2;
    }

    public void setChoice2(String choice2) {
        this.choice2 = choice2;
    }

    public String getChoice3() {
        return choice3;
    }

    public void setChoice3(String choice3) {
        this.choice3 = choice3;
    }
}
