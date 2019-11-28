package com.tanushree.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.not;

@RunWith(AndroidJUnit4.class)
public class MainActivityBasicTest {
    @Rule public ActivityTestRule<MainActivity> mActivityTestRule
            = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void clickTellJokeButton()
    {
        // Click on the Tell Joke button in the MainActivity.
        onView(withId(R.id.bTellJoke)).perform(click());

        //onView(withId(R.id.tvDisplayJoke)).check(matches(not(withText(""))));

        // The TextView in JokeActivity (in displayJokes library) should match with this string.
        onView(withId(R.id.tvDisplayJoke)).check(matches(withText("This is totally a funny joke")));
    }

}