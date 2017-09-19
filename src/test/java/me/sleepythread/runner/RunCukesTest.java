package me.sleepythread.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by akashmishra on 19/09/2017.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber"},
        glue = {"me.sleepythread.stepdef"},
        features = {"src/test/resources/Features"})
public class RunCukesTest {

//    @BeforeClass
//    public void setup(){
//        System.setProperty("webdriver.chrome.driver",
//                "/Users/akashmishra/work/testing/cucumber-java/driver/chromedriver");
//    }
}