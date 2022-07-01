package com.qaprosoft.carina.demo.gui.pages.promiedos;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class JpWorldCupPage extends AbstractPage {
    @FindBy(xpath = "//td[@id='for_60_6']//i[@class='material-icons md-18'][normalize-space()='add_box']")
    private ExtendedWebElement plusButton;
    @FindBy(xpath = "//div[@idb='historialtorneos']")
    private ExtendedWebElement championsButton;
    @FindBy(xpath = "//tbody/tr[4]/td[5]/a[1]/i[1]")
    private ExtendedWebElement miniPlusButton;

    public JpWorldCupPage(WebDriver driver) {
        super(driver);
    }

    public void PlusButtonClick() {
        plusButton.click();
    }

    public void ChampíonsButtonClick() {
        championsButton.click();
    }

    public void MiniPlusButtonClick() {
        miniPlusButton.click();
    }

}
