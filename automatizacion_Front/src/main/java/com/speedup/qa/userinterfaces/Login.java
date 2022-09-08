package com.speedup.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login {
    public static final Target ENTER_LOGIN_SCREEN = Target
            .the("Select the button to login in")
            .located(By.className("nav__button-secondary"));

    public static final Target USER_NAME = Target
            .the("The user is entered")
            .located(By.id("username"));

    public static final Target USER_PASSWORD = Target
            .the("The password is entered")
            .located(By.name("session_password"));
    public static final Target VALIDATE_LOGIN = Target
            .the("We validate user")
            .located(By.xpath("(//*[@class='t-16 t-black t-bold'])[1]"));
    public static final Target LOGIN = Target
            .the("The password is entered")
            .located(By.className("btn__primary--large"));

}
