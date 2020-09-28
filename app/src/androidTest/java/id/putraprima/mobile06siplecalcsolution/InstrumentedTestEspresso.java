package id.putraprima.mobile06siplecalcsolution;


import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class InstrumentedTestEspresso {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void instrumentedTestEspresso() {
        onView(withId(R.id.edit_text_angka_pertama)).perform(typeText("7"));
        onView(withId(R.id.edit_text_angka_pertama)).check(matches(withText("7")));
        onView(withId(R.id.edit_text_angka_kedua)).perform(typeText("7"));
        onView(withId(R.id.edit_text_angka_kedua)).check(matches(withText("7")));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.button_tambah)).perform(click());
        onView(withId(R.id.text_hasil)).check(matches(withText("14")));
        onView(withId(R.id.button_bagi)).perform(click());
        onView(withId(R.id.text_hasil)).check(matches(withText("1")));
        onView(withId(R.id.button_kali)).perform(click());
        onView(withId(R.id.text_hasil)).check(matches(withText("49")));
        onView(withId(R.id.button_kurang)).perform(click());
        onView(withId(R.id.text_hasil)).check(matches(withText("0")));
    }
}
