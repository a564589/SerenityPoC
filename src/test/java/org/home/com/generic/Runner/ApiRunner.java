package org.home.com.generic.Runner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.itextpdf.html2pdf.HtmlConverter;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "classpath:features", 
glue="classpath:org/home/com/generic/StepDefinition",
tags = "@Tag")
public class ApiRunner {

}
