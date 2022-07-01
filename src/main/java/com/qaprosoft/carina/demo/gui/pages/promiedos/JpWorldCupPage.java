package com.qaprosoft.carina.demo.gui.pages.promiedos;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class JpWorldCupPage extends AbstractPage {
    @FindBy(xpath = "//*[@id=\"for_60_6\"]/a/i")
    private ExtendedWebElement plusButton;
    @FindBy(xpath = "//*[@id=\"botoneraliga\"]/a[2]/div")
    private ExtendedWebElement championsButton;
    @FindBy(xpath = "//*[@id=\"tabranking\"]/tbody/tr[9]/td[5]/a/i")
    private ExtendedWebElement miniPlusButton;

    public JpWorldCupPage(WebDriver driver) {
        super(driver);
    }
    public void PlusButtonClick(){
        plusButton.click();
    }
    public void ChampíonsButtonClick(){
        championsButton.click();
    }
    public void MiniPlusButtonClick(){
        miniPlusButton.click();
    }

}
