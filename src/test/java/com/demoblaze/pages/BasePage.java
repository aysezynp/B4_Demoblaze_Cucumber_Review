package com.demoblaze.pages;

import com.demoblaze.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(id = "nameofuser")
    public WebElement nameofuser;

    @FindBy(xpath = "(//a[@class='nav-link'])[1]")
    public WebElement homeModule;

    @FindBy(xpath = "//a[.='Cart']")
    public  WebElement cartModule;

}
