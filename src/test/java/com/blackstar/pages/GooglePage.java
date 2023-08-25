package com.blackstar.pages;

import com.blackstar.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {
    public GooglePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "q")
    public WebElement searchBar;
    @FindBy(id = "L2AGLb")
    public WebElement cookies;
    @FindBy(xpath = "(//h3[.=\"Wikipedia\"])[1]")
    public WebElement wiki;



}
