package me.sleepythread.setdef;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by akashmishra on 19/09/2017.
 */
public abstract class Web {

    static {
        System.setProperty("webdriver.chrome.driver", "/Users/akashmishra/work/testing/cucumber-java/driver/chromedriver");
    }
    final protected ChromeDriver driver = new ChromeDriver();

}
