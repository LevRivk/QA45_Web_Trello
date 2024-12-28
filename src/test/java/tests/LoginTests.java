package tests;

import dto.User;
import manager.AppManager;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTests extends AppManager {
    @Test
    public void loginPositiveTest(){
        User user = User.builder()
                .email("shendonlevka@gmail.com")
                .password("Kakashka1!")
                .build();

        new HomePage(getDriver()).clickBtnLogin();
        new LoginPage(getDriver()).login(user);

    }
}
