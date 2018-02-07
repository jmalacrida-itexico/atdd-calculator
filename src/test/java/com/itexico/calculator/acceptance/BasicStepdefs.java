package com.itexico.calculator.acceptance;

import com.itexico.calculator.CalculatorApplication;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ContextConfiguration
@SpringBootTest(classes = CalculatorApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@DirtiesContext
public class BasicStepdefs {

    @Autowired
    private WebApplicationContext webApp;

    private ResultActions callUrl;

    @When("^the client calls (/\\w+)$")
    public void the_client_calls_version(String url) throws Exception {
        MockMvc mock = MockMvcBuilders.webAppContextSetup(webApp).build();
        callUrl = mock.perform(get(url));
    }

    @Then("^the client receives status code of (\\d+)$")
    public void the_client_receives_status_code_of(int httpCode) throws Exception {
        callUrl.andExpect(status().is(httpCode));
    }

    @Then("^the client receives server version (\\d+\\.\\d+)$")
    public void the_client_receives_server_version(String arg1) throws Exception {
        assertEquals(callUrl.andReturn().getResponse().getContentAsString(), arg1);
    }

}
