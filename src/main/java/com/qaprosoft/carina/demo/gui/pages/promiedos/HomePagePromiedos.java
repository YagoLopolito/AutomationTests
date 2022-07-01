package com.qaprosoft.carina.demo.gui.pages.promiedos;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePagePromiedos extends AbstractPage {

    @FindBy(id = "bayer")
    private ExtendedWebElement leftButton;
    @FindBy(id = "bman")
    private ExtendedWebElement rightButton;
    @FindBy(className = "banner")
    private ExtendedWebElement bannerButton;
    @FindBy(xpath = "/html[1]/body[1]/div[11]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/a[1]")
    private ExtendedWebElement ligueButton;
    @FindBy(xpath = "/html[1]/body[1]/div[9]/ul[1]/li[2]/ul[1]/li[1]/a[1]")
    private ExtendedWebElement qtarButton;
    @FindBy(id = "part3")
    private ExtendedWebElement instagramButton;
    @FindBy(xpath = "//a[normalize-space()='Mundial Clubes']")
    private ExtendedWebElement jpWorldCupButton;


    public HomePagePromiedos(WebDriver driver) {
        super(driver);
    }

    public void LoadPage() {
        getDriver().get("https://www.promiedos.com.ar/");
    }

    public void BannerClick() {
        bannerButton.click();
    }

    public void LeftButtonClick() {
        leftButton.click();
    }

    public void RightButtonClick() {
        rightButton.click();
    }

    public void LigueButtonClick() {
        ligueButton.click();
    }

    public void QtarButtonClick() {
        qtarButton.click();
    }

    public void InstagramCick() {
        instagramButton.click();
    }

    public void JpWorldCupButtonClick() {
        jpWorldCupButton.click();
    }


}
