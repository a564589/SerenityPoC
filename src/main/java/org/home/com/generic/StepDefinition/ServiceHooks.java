package org.home.com.generic.StepDefinition;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.AfterClass;

import com.itextpdf.html2pdf.HtmlConverter;

import cucumber.api.java.After;

public class ServiceHooks {

	//@After
	public static void main() throws FileNotFoundException, IOException {

		HtmlConverter.convertToPdf(new FileInputStream("target/site/serenity/index.html"), new FileOutputStream("report.pdf"));

		System.out.println("PDF Created!");

	}

}
