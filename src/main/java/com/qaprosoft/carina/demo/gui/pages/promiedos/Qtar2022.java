package com.qaprosoft.carina.demo.gui.pages.promiedos;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Qtar2022 extends AbstractPage {

    @FindBy(xpath = "//div[@class='gruposim'][normalize-space()='C:']//img[1]")
    private ExtendedWebElement argentinianFlagButton;
    @FindBy(xpath = "//div[@class='gruposim'][normalize-space()='C:']//img[3]")
    private ExtendedWebElement mexicanFlagButton;
    @FindBy(xpath = "//div[@class='gruposim'][normalize-space()='D:']//img[1]")
    private ExtendedWebElement franceFlagButton;
    @FindBy(xpath = "//div[@class='gruposim'][normalize-space()='D:']//img[3]")
    private ExtendedWebElement holandaFlagButton;
    @FindBy(xpath = "//div[@idb='historialtorneos']")
    private ExtendedWebElement championsButton;


    public Qtar2022(WebDriver driver) {
        super(driver);
    }

    public void ArgetinianClick() {
        argentinianFlagButton.click();
    }

    public void MexicoClick() {
        mexicanFlagButton.click();
    }

    public void FranceClick() {
        franceFlagButton.click();
    }

    public void HolandaClick() {
        holandaFlagButton.click();
    }

    public void ChampionsClick() {
        championsButton.click();
    }

}
