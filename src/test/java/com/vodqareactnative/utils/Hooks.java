package com.vodqareactnative.utils;

import com.vodqareactnative.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import java.net.MalformedURLException;

public class Hooks {

    private DriverFactory driverFactory;

    @Before
    public void setUp() {
        driverFactory = new DriverFactory();
        driverFactory.setUp();
    }

    @After
    public void tearDown() {
        driverFactory.tearDown();
    }
}
