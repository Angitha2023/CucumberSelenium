package com.example.extendReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feature\\loginHRM.feature", glue = "com.example.extendReport",plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class runnerClass {

}


