package test;

import Model.User;
import Page.CabinetPage;
import Page.MainPage;
import Service.UserCreator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends CommonConditions {
    @Test
    private void CheckIfAddedTest(){
        User user= UserCreator.createUser();
        CabinetPage cabinetPage = new MainPage(driver)
                .openPage()
                .openLoginPage()
                .inputLogin(user.Login)
                .inputPassword(user.Password)
                .loginButtonClick();
            Assert.assertEquals(cabinetPage.getClass(),CabinetPage.class);
    }
}
