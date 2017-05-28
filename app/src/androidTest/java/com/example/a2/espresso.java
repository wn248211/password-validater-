package com.example.a2;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class espresso {
    private String textToFind;
    private String textToFind2;

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Before
    public void initString()
    {
        textToFind = "xianjian12";
        textToFind2 = "your password must include at least one capital letter.";
    }

    @Test
    public void findText()

    {

        //make sure output textfield has no info
        onView(withId(R.id.textview)).check(matches(withText("")));

        //target a input field and type password into it
        onView(withId(R.id.editText)).perform(typeText(textToFind));

        //target a button that has the ID value of button
        onView(withId(R.id.button)).perform(click());

        //check output textfield has right result message
        onView(withId(R.id.textview)).check(matches(withText(textToFind2)));

    }
}
