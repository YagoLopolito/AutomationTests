package com.qaprosoft.carina.demo.gui.pages.promiedos.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class FooterMenuPromiedos extends AbstractPage {
    @FindBy(xpath = "//a[normalize-space()='Contacto']")
    private ExtendedWebElement contactButton;
    @FindBy(xpath = "//a[normalize-space()='Donar']")
    private ExtendedWebElement donationButton;
    @FindBy(xpath = "//a[@id='part1']")
    private ExtendedWebElement twitterButton;
    @FindBy(xpath = "//a[@id='part2']")
    private ExtendedWebElement faceButton;
    @FindBy(xpath = "//a[@id='part3']")
    private ExtendedWebElement instagramButton;

    public FooterMenuPromiedos(WebDriver driver) {
        super(driver);
    }

    public void footerMenuClick() {
        contactButton.click();
        driver.navigate().back();
        donationButton.click();
        driver.navigate().back();
        faceButton.click();
        driver.navigate().back();
        twitterButton.click();
        driver.navigate().back();
        instagramButton.click();
        driver.navigate().back();
    }

    public void contactClick() {
        contactButton.click();
    }
}

