package com.cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		//usage and pretty
		plugin = { "pretty", "html:target/cucumber-reports/rpusage.html"},
		monochrome = true,
		features = {"src/test/resources/features/TC001.feature" },
		glue = "com.stepdefination")

public class CalculatorRunnerTest extends AbstractTestNGCucumberTests{

}
