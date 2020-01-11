package org.home.com.generic.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "classpath:features", 
glue="classpath:org/home/com/generic/StepDefinition",
tags = "@Tag")
public class ApiRunner {

}
