package com.blackstar.pages;

import com.blackstar.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GunvorPages {

    public GunvorPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public WebElement header(String header){

        WebElement result = Driver.getDriver().findElement(By.xpath("//a[@title='" + header + "']"));
        return result;
    }

    public WebElement subheader(String subheader){
        WebElement result = Driver.getDriver().findElement(By.xpath("//a[@title='" + subheader + "']"));
        return result;

    }

    public WebElement sortingForTheTitle(String navBar){
        if(navBar.equalsIgnoreCase("a global business") || navBar.equalsIgnoreCase("Leadership")
        || navBar.equalsIgnoreCase("our history")){
            WebElement result = Driver.getDriver().findElement(By.tagName("h1"));
            return result;
        }
        else{
            WebElement result = Driver.getDriver().findElement(By.xpath("//div[@class=\"page-title\"]/div"));
            return result;
        }
    }
//    @FindBy(xpath = "//div[@class=\"page-title\"]/div")
//    public WebElement title;

    @FindBy(id = "ccc-notify-accept")
    public WebElement cookies;


}
