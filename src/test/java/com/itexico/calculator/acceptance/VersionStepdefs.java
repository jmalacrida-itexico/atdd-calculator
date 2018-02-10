package com.itexico.calculator.acceptance;

import cucumber.api.PendingException;
import cucumber.api.java8.En;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class VersionStepdefs extends RestControllerTest implements En {

    private ResultActions callUrl;

    public VersionStepdefs() {
        When("^the user calls \"([^\"]*)\"$", (String arg0) -> {
            MockMvc mock = MockMvcBuilders.webAppContextSetup(webApp).build();
            callUrl = mock.perform(get(arg0));
        });
        Then("^the user receives status code of (\\d+)$", (Integer arg0) -> {
            callUrl.andExpect(status().is(arg0));
        });
        And("^the user receives server version (\\d+)\\.(\\d+)$", (Integer arg0, Integer arg1) -> {
            assertEquals(callUrl.andReturn().getResponse().getContentAsString(), String.format("%d.%d", arg0, arg1));
        });
    }
}
