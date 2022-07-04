package com.payback.appiumtest.stepdefenitions

import com.payback.appiumtest.base.AppiumApplication
import com.payback.appiumtest.page.CouponPage
import com.payback.appiumtest.page.LoginPage
import io.appium.java_client.AppiumDriver
import io.cucumber.java.Before
import io.cucumber.java.en.And
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.junit.After

class CouponFeatureStepDefinitions {

    private val application = AppiumApplication()
    private lateinit var couponPage: CouponPage
    private lateinit var loginPage: LoginPage
    @Before
    fun setup() {
        application.initialiseAppium()
        couponPage = CouponPage(application.driver as AppiumDriver)
        loginPage = LoginPage(application.driver as AppiumDriver)
    }

    // We are using existing session as can login into app via automation due to security
    // below step will be skipped for now.
   @Given("login into app using username as (.*) and password as (.*)")
    fun `login into app using username and password`(userid: String,password: String) {
        loginPage.loginIntoApp(userid, password)
    }

    // launch existing login session
    @Given("launch existing login app")
    fun `launch existing login ap`() {
        couponPage.launchAppByName()
    }
    @Then("User should navigate to the home page")
    fun `user should navigate to the home page`() {
        couponPage.verifyHomePage()
    }
    @When("User click on coupon")
    fun `user click on coupon`() {
        couponPage.clickOnCoupon()
    }

    @Then("User should navigate to coupon filter page")
    fun `user should navigate to coupon filter page`() {
        couponPage.verifyCouponPageWithFilterButton()
    }
    @And("User click on filter button")
    fun `user click on filter button`() {
        couponPage.clickOnFilter()
    }

    @Then("User should see all available coupons")
    fun `User should see all avialble coupons`() {
        couponPage.verifyFilterPageWithAllCoupon()
    }
    @And("User filter coupon by REWE")
    fun `user filter coupon by name`() {
        couponPage.selectFilterByName()
    }
    @Then("User should see that coupon with activate button")
    fun `user should see that coupon with activate button`() {
        couponPage.verifySelectedCouponWithActivateButtonIsShown()
    }

    @And("User click on activate coupon button")
    fun `user click on activate coupon button`() {
        couponPage.activateCoupon()
    }
    @Then("User should see that coupon is activated")
    fun `user should see that coupon is activated`() {
        couponPage.verifyCouponActivated()
    }
    @After
    fun tearDown() {
        application.shutDown()
    }
}