package com.qaprosoft.carina.demo.gui.pages.promiedos;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.components.FooterMenu;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePagePromiedos extends AbstractPage {

    @FindBy(id = "bayer")
    private ExtendedWebElement leftButton;
    @FindBy(id = "bman")
    private ExtendedWebElement rightButton;
    @FindBy(className = "banner")
    private ExtendedWebElement bannerButton;
    @FindBy(xpath = "//*[@id=\"fixturein\"]/table/tbody/tr[2]")
    private ExtendedWebElement ligueButton;
    @FindBy(xpath = "//*[@id=\"accordian\"]/ul/li[2]/ul/li[1]/a")
    private ExtendedWebElement qtarButton;
    @FindBy(id = "part3")
    private ExtendedWebElement instagramButton;
    @FindBy(xpath = "//*[@id=\"accordian\"]/ul/li[4]/ul/li[2]/a")
    private ExtendedWebElement jpWorldCupButton;


    public HomePagePromiedos(WebDriver driver) {
        super(driver);
    }
    public void LoadPage() {
        getDriver().get("https://www.promiedos.com.ar/");
    }
    public void BannerClick(){
        bannerButton.click();
    }
    public void LeftButtonClick(){
        leftButton.click();
    }
    public void RightButtonClick(){
       rightButton.click();
    }
    public void LigueButtonClick(){
        ligueButton.click();
    }
    public void QtarButtonClick(){
        qtarButton.click();
    }
    public void InstagramCick(){
        instagramButton.click();
    }
    public void JpWorldCupButtonClick(){
        jpWorldCupButton.click();
    }


}
