package com.qaprosoft.carina.demo.gui.pages.promiedos;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ContactPage extends AbstractPage {
    @FindBy(xpath = "//select[@name='razon']")
    private ExtendedWebElement select;
    @FindBy(xpath = "//input[@id='nombre']")
    private ExtendedWebElement name;
    @FindBy(xpath = "//input[@id='email']")
    private ExtendedWebElement email;
    @FindBy(xpath = "//textarea[@id='coment']")
    private ExtendedWebElement comment;
    @FindBy(xpath = "//div[@class='recaptcha-checkbox-border']")
    private ExtendedWebElement captcha;
    @FindBy(xpath = "//input[@value='Enviar']")
    private ExtendedWebElement send;


    public ContactPage(WebDriver driver) {
        super(driver);
    }
    public void contactTest(String name1, String email1, String comment1){
        name.click();
        name.type(name1);
        email.click();
        email.type(email1);
        comment.click();
        comment.type(comment1);
        captcha.click();
        send.click();
    }
}
