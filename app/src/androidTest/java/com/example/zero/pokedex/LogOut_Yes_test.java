package com.example.zero.pokedex;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.RootMatchers.isDialog;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class LogOut_Yes_test {
//This test will check when the user see the alert dialog and clicks yes it will take
// the user back to the main screen.
    @Rule
    public ActivityTestRule<Welcome> mActivityTestRule = new ActivityTestRule<>(Welcome.class);

    @Test
    public void logOut_Yes_test() {
        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.btnStart), withText("Start"), isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.btnCreate), withText("Create a new account"), isDisplayed()));
        appCompatButton2.perform(click());

        ViewInteraction appCompatButton3 = onView(
                allOf(withId(R.id.btnSetPassword), withText("Set Password"), isDisplayed()));
        appCompatButton3.perform(click());

        ViewInteraction appCompatButton4 = onView(
                allOf(withId(R.id.btnSimple), withText("Create a Simple Password"), isDisplayed()));
        appCompatButton4.perform(click());

        ViewInteraction appCompatButton5 = onView(
                allOf(withId(R.id.btn1), withText("1"), isDisplayed()));
        appCompatButton5.perform(click());

        ViewInteraction appCompatButton6 = onView(
                allOf(withId(R.id.btn1), withText("1"), isDisplayed()));
        appCompatButton6.perform(click());

        ViewInteraction appCompatButton7 = onView(
                allOf(withId(R.id.btn1), withText("1"), isDisplayed()));
        appCompatButton7.perform(click());

        ViewInteraction appCompatButton8 = onView(
                allOf(withId(R.id.btn1), withText("1"), isDisplayed()));
        appCompatButton8.perform(click());

        ViewInteraction appCompatButton9 = onView(
                allOf(withId(R.id.btnSubmitInfo), withText("Submit"), isDisplayed()));
        appCompatButton9.perform(click());

        onView(withText("Yes")).perform(click());

        ViewInteraction appCompatButton10 = onView(
                allOf(withId(R.id.logoutButton), withText("Logout"), isDisplayed()));
        appCompatButton10.perform(click());

        ViewInteraction appCompatButton11 = onView(
                allOf(withId(android.R.id.button1), withText("Yes")));
        appCompatButton11.perform(scrollTo(), click());

    }

}
