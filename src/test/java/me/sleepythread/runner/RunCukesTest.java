package me.sleepythread.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by akashmishra on 19/09/2017.
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber"},glue = {"src/test/java/me/sleepythread/stepdef"}, features = {"src/test/resources"})
public class RunCukesTest {

}