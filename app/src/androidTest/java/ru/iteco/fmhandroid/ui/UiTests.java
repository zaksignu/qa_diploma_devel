package ru.iteco.fmhandroid.ui;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;

import androidx.test.espresso.ViewInteraction;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import ru.iteco.fmhandroid.R;

@RunWith(AndroidJUnit4.class)
public class UiTests {
    @Rule
    public ActivityTestRule<AppActivity> activityTestRule=new ActivityTestRule<>(AppActivity.class);

    @Before
    public void init() {
//        ViewInteraction loginView = onView(
//                allOf(
//                        withHint("Login"),
//                        withParent(withParent(withId(R.id.login_text_input_layout))),
//                        isDisplayed()
//                )
//        );
//        loginView.perform(replaceText("login2"));
//
//        ViewInteraction passView = onView(
//                allOf(
//                        withHint("Password"),
//                        withParent(withParent(withId(R.id.password_text_input_layout))),
//                        isDisplayed()
//                )
//        );
//
//        passView.perform(replaceText("password2"));
//
//        ViewInteraction materialButton = onView(
//                allOf(
//                        withId(R.id.enter_button), withText("Sign in"), withContentDescription("Save"),
//                        isDisplayed()
//                )
//        );
//        materialButton.perform(click());
    }
    @After
    public void destruct(){
//        ViewInteraction logOut = onView(
//                allOf(
//                        withHint("Login"),
//                        withParent(withParent(withId(R.id.authorization_image_button))),
//                        isDisplayed()
//                )
//        );
//        logOut.perform(click());
    }

    @Test
    public void leftMenuClaim() {}

    @Test
    public void leftMenuClaimAddComment() {}

    @Test
    public void leftMenuClaimEditComment() {}

    @Test
    public void leftMenuNews() {}

    @Test
    public void leftMenuAbout() {}

    @Test
    public void leftMenuMain() {}

    @Test
    public void claimsAdd() {
        ViewInteraction claimsAdd = onView(
                allOf(
                        withContentDescription("Add new claim button"),
                        withId(R.id.add_new_claim_material_button),
                        isDisplayed()
                )
        );
        claimsAdd.perform(click());
    }
}
