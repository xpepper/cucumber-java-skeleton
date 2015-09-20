package shouty;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class Stepdefs {

    private Person lucy;
    private Person sean;
    private String messageFromSean;

    @Given("^Lucy is (\\d+)m from Sean$")
    public void lucy_is_m_from_Sean(int distance) throws Throwable {
        lucy = new Person();
        sean = new Person();

        lucy.setPosition(15);
        sean.setPosition(0);
    }

    @When("^Sean shouts \"(.*?)\"$")
    public void sean_shouts(String message) throws Throwable {
        sean.shouts(message);
        messageFromSean = message;
    }

    @Then("^Lucy should hear Sean's message$")
    public void lucy_should_hear_Sean_s_message() throws Throwable {
        assertEquals(asList(messageFromSean), lucy.getMessagesHeard());
    }
}
