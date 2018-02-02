package br.com.financiamento.BB.acceptance;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import io.openbdt.cucumber.CucumberWithOpenBdt;

@RunWith(CucumberWithOpenBdt.class)
@CucumberOptions(features = {"src/test/resources/bdd/features"}, glue = {"br.com.financiamento.BB.steps.definition"})

public class DefaultAcceptanceTestRunner {

}
