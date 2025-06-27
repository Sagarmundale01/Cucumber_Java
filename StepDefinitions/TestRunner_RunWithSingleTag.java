package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureWithTags.feature", 
glue = {"StepDefinitions"},
tags= "@All",   //("@smoke and @regression and @important"),

publish = true,
monochrome = true,
plugin = {"pretty","junit:target/JUnitReports/report.xml",
		           "json:target/JSONReports/report.json",
		           "html:target/HtmlReports/report.html"}
)	

public class TestRunner_RunWithSingleTag {



}
