package com.cucumber.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber-html-report"},
		features = "Features",
		glue ="com.step_definition",
		tags = {"@tag1"
				
		}
		
		)
public class CucumberRunner {

}


