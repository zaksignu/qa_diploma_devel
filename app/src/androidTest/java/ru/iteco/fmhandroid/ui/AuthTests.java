package ru.iteco.fmhandroid.ui;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withHint;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import androidx.test.espresso.ViewInteraction;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import ru.iteco.fmhandroid.R;



//login2
//password2
@RunWith(AndroidJUnit4.class)
public class AuthTests {

    @Rule
    public ActivityTestRule<AppActivity> activityTestRule=new ActivityTestRule<>(AppActivity.class);

    @Test
    public void authWithWrongPass() {

        ViewInteraction loginView = onView(
                allOf(
                        withHint("Login"),
                        withParent(withParent(withId(R.id.login_text_input_layout))),
                        isDisplayed()
                )
        );
        loginView.perform(replaceText("login2"));

        ViewInteraction passView = onView(
                allOf(
                        withHint("Password"),
                        withParent(withParent(withId(R.id.password_text_input_layout))),
                        isDisplayed()
                )
        );

        passView.perform(replaceText("qpassword2we"));

        ViewInteraction materialButton = onView(
                allOf(
                        withId(R.id.enter_button), withText("Sign in"), withContentDescription("Save"),
                     isDisplayed()
            )
        );
        materialButton.perform(click());
        //TO DO:Assertions
        ViewInteraction textView = onView(
                allOf(
                        withText("Authorization"),
                        withParent(withParent(withId(R.id.nav_host_fragment))),
                        isDisplayed()
                )
        );

    }
    @Test
    public void authWithWrongLogin() {

        ViewInteraction loginView = onView(
                allOf(
                        withHint("Login"),
                        withParent(withParent(withId(R.id.login_text_input_layout))),
                        isDisplayed()
                )
        );
        loginView.perform(replaceText("qwe"));

        ViewInteraction passView = onView(
                allOf(
                        withHint("Password"),
                        withParent(withParent(withId(R.id.password_text_input_layout))),
                        isDisplayed()
                )
        );

        passView.perform(replaceText("password2"));

        ViewInteraction materialButton = onView(
                allOf(
                        withId(R.id.enter_button), withText("Sign in"), withContentDescription("Save"),
                        isDisplayed()
                )
        );
        materialButton.perform(click());
        //TO DO:Assertions


    }
    @Test
    public void authSucces() {

        ViewInteraction loginView = onView(
                allOf(
                        withHint("Login"),
                        withParent(withParent(withId(R.id.login_text_input_layout))),
                        isDisplayed()
                 )
        );
        loginView.perform(replaceText("login2"));

        ViewInteraction passView = onView(
                allOf(
                        withHint("Password"),
                        withParent(withParent(withId(R.id.password_text_input_layout))),
                        isDisplayed()
                )
        );

        passView.perform(replaceText("password2"));

        ViewInteraction materialButton = onView(
                allOf(
                        withId(R.id.enter_button),
                        withText("Sign in"),
                        withContentDescription("Save"),
                        isDisplayed()
                )
        );
        materialButton.perform(click());
        //TO DO:Assertions


    }
    @Test
    public void logOutSu() {

        ViewInteraction loginView = onView(
                allOf(
                        withHint("Login"),
                        withParent(withParent(withId(R.id.login_text_input_layout))),
                        isDisplayed()
                )
        );
        loginView.perform(replaceText("login2"));

        ViewInteraction passView = onView(
                allOf(
                        withHint("Password"),
                        withParent(withParent(withId(R.id.password_text_input_layout))),
                        isDisplayed()
                )
        );

        passView.perform(replaceText("password2"));

        ViewInteraction materialButton = onView(
                allOf(
                        withId(R.id.enter_button), withText("Sign in"), withContentDescription("Save"),
                        isDisplayed()
                )
        );
        materialButton.perform(click());

        //------------------------------------
                ViewInteraction logOut = onView(
                allOf(
                       withId(R.id.authorization_image_button),
                        withContentDescription("Authorization"),
                        isDisplayed()

                )
        );
        logOut.perform(click());

    }
}
