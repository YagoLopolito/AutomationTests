package com.qaprosoft.carina.demo.gui.pages.promiedos;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.components.FooterMenu;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePagePromiedos extends AbstractPage {

    @FindBy(id = "bayer")
    private By leftButton;
    @FindBy(id = "titulo1")
    private By middleButton;
    @FindBy(id = "bman")
    private By rightButton;
    @FindBy(className = "banner")
    private By bannerButton;

    public HomePagePromiedos(WebDriver driver) {
        super(driver);
    }
    public void LoadPage(){
        getDriver().get("https://www.promiedos.com.ar/");
    }
    public void MiddleButtonClick(){
        getDriver().findElement(middleButton).click();
    }
    public void BannerClick(){
        getDriver().findElement(bannerButton).click();
    }
}
