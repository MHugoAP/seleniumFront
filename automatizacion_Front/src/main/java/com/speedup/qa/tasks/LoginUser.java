package com.speedup.qa.tasks;

import com.speedup.qa.models.CredentialsData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.speedup.qa.userinterfaces.Login.ENTER_LOGIN_SCREEN;
import static com.speedup.qa.userinterfaces.Login.USER_NAME;
import static com.speedup.qa.userinterfaces.Login.USER_PASSWORD;

public class LoginUser implements Task {

    private CredentialsData credentialsDataInstance;

    public LoginUser(CredentialsData credentialsData){
        this.credentialsDataInstance = credentialsData;
    }

    @Override
    public <T extends Actor> void performAs(T actorLogin) {
        actorLogin.attemptsTo(Click.on(ENTER_LOGIN_SCREEN));
        actorLogin.attemptsTo(Enter.theValue(credentialsDataInstance.getUser()).into(USER_NAME));
        actorLogin.attemptsTo(Enter.theValue(credentialsDataInstance.getPassword()).into(USER_PASSWORD));

    }
    public static LoginUser withTheData(CredentialsData credentialsData){
        return new LoginUser(credentialsData);
    }
}