package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.GoogleHomePage;
import pageObjects.GoogleSearchResultsPage;
import pageObjects.SeleniumhqHomePage;

public class Search {

    private GoogleHomePage googleHomePage;
    private GoogleSearchResultsPage googleSearchResultsPage;
    private SeleniumhqHomePage seleniumHqHomePage;

    public Search(){
        this.googleHomePage=new GoogleHomePage();
        this.googleSearchResultsPage=new GoogleSearchResultsPage();
        this.seleniumHqHomePage=new SeleniumhqHomePage();
    }


    @Given("^I go to www.google.com$")
    public void iGoToGoogleHomepage() {
        googleHomePage.navigateToUrl();
    }

    @When("^I type \"([^\"]*)\" in the searchbox$")
    public void iTypeInTheSearchbox(String searchTerm) {
        googleHomePage.typeSearchTermInBox(searchTerm);
    }

    @And("^I press ENTER in the searchbox$")
    public void iPressENTERInTheSearchbox() {
        googleHomePage.performSearchByKeyboard();
    }

    @And("^I click on Selenium HQ link$")
    public void iClickOnSeleniumhqLink() {
        googleSearchResultsPage.clickSeleniumhqSearchResultLink();
    }

    @Then("^I'm on Selenium HQ Page$")
    public void imOnSeleniumHQPage() {
        assert(seleniumHqHomePage.getCurrentUrl().equals(seleniumHqHomePage.getUrl()));
    }
}
