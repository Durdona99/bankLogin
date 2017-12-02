package com.bank.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(plugin={"html:target/cucumber_report", "json:target/cucumber.json"},
				glue="com.bank.step_definition",
				features="./src/test/resources/feature/com.bank.feature",
				dryRun=false

	)	
		public class CukesRunner{
	
}
		
		




