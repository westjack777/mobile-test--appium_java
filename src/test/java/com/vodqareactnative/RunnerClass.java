package com.vodqareactnative;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.net.MalformedURLException;
import java.util.concurrent.ExecutionException;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = {"com.vodqareactnative.steps"}
)
public class RunnerClass {

    @BeforeClass
    public static void initialize() throws MalformedURLException {
        new DriverFactory().setUp();
    }

    @AfterClass
    public static void quit(){
        DriverFactory df = new DriverFactory();
        if(df.getDriver() != null){
            df.getDriver().quit();
        }
    }
}