package edu.quinnipiac.ser210.basiconlineandroid;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

//@RunWith(AndroidJUnit4.class)

//public class UserNameTest {
//
//    @Rule
//    public ActivityTestRule <HomeScreen> homeScreenTestRule =
//            new ActivityTestRule<>(HomeScreen.class);
//
//
//
//    @Test
//    public void getUserName() {
//       // onView(withId(R.id.welcomeName)).perform(Type)
//
//        //onView(withId(R.id.enterName)).perform(typeText("Ellsworth"), ViewActions.closeSoftKeyboard());
//
//
//        Espresso.onView(withText("Welcome to BASIC")).perform(click());
//        String expected = "Welcome to BASIC Alexandra";
//
//        onView(withId(R.id.welcomeName)).check(matches(withText(expected)));
//
//    }
//}