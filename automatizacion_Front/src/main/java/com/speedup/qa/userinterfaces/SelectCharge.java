package com.speedup.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectCharge {

    public static final Target CLOSE_CHAT = Target
            .the("")
            .located(By.id("ember134"));

    public static final Target ENTER_PROFILE = Target
            .the("click on the profile")
            .located(By.id("ember16"));
        //.located(By.className("global-nav__primary-link artdeco-dropdown__trigger"));

    public static final Target ENTER_PROFILE_PART2 = Target
            .the("Login to profile")
            .located(By.xpath("(//div[@class='t-16 t-black t-bold'])[1]"));
        //.located(By.id("(//div[@id='ember18'])"));
}
