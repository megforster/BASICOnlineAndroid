package edu.quinnipiac.ser210.basiconlineandroid;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class quizQuestionsTest {

    private quizQuestions testQuizQuestions;

    @Before
    public void setUp() throws Exception {

        testQuizQuestions = new quizQuestions();
    }

    @Test
    public void getQuestions() {

        String resQuestion = testQuizQuestions.getQuestions();

        assertEquals("Social Media are",testQuizQuestions.getQuestions());
    }

    @Test
    public void setQuestions() {

        String resQuestion = testQuizQuestions.getQuestions();

        assertEquals("Social Media are",resQuestion,"Social Media are");
    }

//    @Test
//    public void getAnswerNum() {
//        assertEquals(1,testQuizQuestions.getAnswerNum( ));
//    }
//
//    @Test
//    public void setAnswerNum() {
//        assertEquals(1,testQuizQuestions.setAnswerNum());
//    }
//
//    @Test
//    public void getChoice1() {
//        assertEquals("forms of electronic communication through which users create online communities to share information, ideas,\" + personal messages, and other content",testQuizQuestions.getChoice1( ));
//    }
//
//    @Test
//    public void setChoice1() {
//        assertEquals(1,testQuizQuestions.getAnswerNum( ));
//    }
//
//    @Test
//    public void getChoice2() {
//        assertEquals("A form of music. A place to find music and other forms of media.",testQuizQuestions.getChoice2( ));
//    }
//
//    @Test
//    public void setChoice2() {
//    }
//
//    @Test
//    public void getChoice3() {
//        assertEquals("A form of movie media. A place to find movies.",testQuizQuestions.getChoice3( ));
//    }
//
//    @Test
//    public void setChoice3() {
//    }
}