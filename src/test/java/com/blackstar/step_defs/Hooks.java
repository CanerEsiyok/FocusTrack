package com.blackstar.step_defs;


import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.blackstar.utilities.Driver;

/*
In this class we will pass pre-& post-conditions to each scenario and each step
*/
public class Hooks {
   /* @Before(order = 0)
    public void setupScenario(){
        System.out.println("====Setting up browser using cucumber @Before");
    }
    @Before(value = "@login",order = 1)
    public void setupScenarioForLogins(){
        System.out.println("===this will only apply to scenarios with @login tag");
    }
    @Before(value = "@db",order = -1)
    public void setupScenarioForDatabase(){
        System.out.println("===this will only apply to scenarios with @db tag");
    }*/
    @After
    public void teardownScenario(Scenario scenario){

        if(scenario.isFailed()){
            byte[] screenshot= ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",scenario.getName());
        }

        Driver.closeDriver();
    }
   /* @BeforeStep
    public void setupStep(){
        System.out.println("-----applying setup using @BeforeStep");
    }
    @AfterStep
    public void afterStep(){
        System.out.println("-----applying teardown using @AfterStep ");
    }
*/

}
