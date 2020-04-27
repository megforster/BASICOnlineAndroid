package edu.quinnipiac.ser210.basiconlineandroid;

import androidx.test.espresso.action.ViewActions;
//import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class UserNameSplashScreenTest {

//    @Rule
//    public ActivityTestRule <SplashScreen> splashScreenTestRule =
//           new ActivityTestRule<>(SplashScreen.class);


    @Test
    public void onEnter() {

        onView(withId(R.id.enterName)).perform(typeText("Alexandra"), ViewActions.closeSoftKeyboard());

        String expected = "Alexandra";

        onView(withId(R.id.enterName)).check(matches(withText(expected)));

        //Espresso.onView(withText("Welcome to BASIC")).perform(click());

    }

}