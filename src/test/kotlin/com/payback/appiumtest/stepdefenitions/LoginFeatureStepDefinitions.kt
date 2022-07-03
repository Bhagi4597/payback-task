package com.payback.appiumtest.stepdefenitions

import com.payback.appiumtest.base.AppiumApplication
import io.cucumber.java.Before
import io.cucumber.java.en.Given
import org.junit.After

class LoginFeatureStepDefinitions {

    private val application = AppiumApplication()

    @Before
    fun setup() {
        application.initialiseAppium()
    }

    @After
    fun tearDown() {
        application.shutDown()
    }


    @Given("The login screen is shown")
    fun `the login screen is shown`() {

    }
}