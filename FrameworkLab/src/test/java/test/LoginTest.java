package test;

import Model.User;
import Page.CabinetPage;
import Page.MainPage;
import Service.UserCreator;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;
public class LoginTest extends CommonConditions {
    @Test
    private void CheckLoginTest(){
        User user= UserCreator.createUser();
        CabinetPage cabinetPage = new MainPage(driver)
                .openPage()
                .openLoginPage()
                .inputLogin(user.Login)
                .inputPassword(user.Password)
                .loginButtonClick();
        assertThat(cabinetPage.getClass()).isEqualTo(CabinetPage.class);
    }
}
