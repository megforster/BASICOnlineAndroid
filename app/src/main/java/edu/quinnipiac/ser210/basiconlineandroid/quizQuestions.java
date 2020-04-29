package edu.quinnipiac.ser210.basiconlineandroid;

public class quizQuestions {

    private long id;
    private String questions;
    private String answer;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getQuestions() {
        return questions;
    }

    public String getAnswer() {
        return answer;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    // Will  allow for the question to be used by ArrayAdapter in the ListView
    @Override
    public String toString() {
        return questions;

    }

}
