package com.speedup.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.speedup.qa.userinterfaces.SelectCharge.*;


public class NewCharge implements Task {

    @Override
    public <T extends Actor> void performAs(T actorCharge) {
        actorCharge.attemptsTo(Click.on(CLOSE_CHAT));
        //actorCharge.attemptsTo(Click.on(ENTER_PROFILE));
        actorCharge.attemptsTo(Click.on(ENTER_PROFILE_PART2));
    }

    public static NewCharge newCharger(){
        return Tasks.instrumented(NewCharge.class);
    }
}
