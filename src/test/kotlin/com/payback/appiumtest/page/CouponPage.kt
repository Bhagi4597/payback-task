package com.payback.appiumtest.page

import com.payback.appiumtest.base.BasePage
import com.payback.appiumtest.base.Constants
import io.appium.java_client.AppiumDriver
import org.openqa.selenium.By

class CouponPage(driver: AppiumDriver) : BasePage(driver) {

    ///////Action///////
    fun launchAppByName()
    {
        driver.findElement(By.xpath(Constants.APP_NAME)).click()
    }

    fun clickOnCoupon()
    {
        driver.findElement(By.xpath(Constants.COUPON_TAB)).click()
    }

    fun clickOnFilter()
    {
        driver.findElement(By.id(Constants.COUPON_PAGE_FILTER_BUTTON)).click()
    }

    fun selectFilterByName()
    {
            driver.findElements(By.xpath(Constants.ALL_COUPON)).get(2).click()
    }
    fun activateCoupon()
    {
        driver.findElement(By.id(Constants.COUPON_ACTIVATE_BUTTON)).click()
    }


    ///////Assertion///////
    fun verifyHomePage()
    {
        driver.findElement(By.xpath(Constants.COUPON_TAB)).isDisplayed
        driver.findElement(By.xpath(Constants.AKTUELL_TAB)).isDisplayed
        driver.findElement(By.xpath(Constants.SERVICES_TAB)).isDisplayed
        //driver.findElement(By.xpath(Constants.ONLINE_SHOPS_TAB)).isDisplayed
        //driver.findElement(By.xpath(Constants.KARTE_TAB)).isDisplayed
    }

    fun verifyCouponPageWithFilterButton()
    {
        driver.findElement(By.id(Constants.COUPON_PAGE_FILTER_BUTTON)).isDisplayed
        driver.findElement(By.xpath(Constants.COUPON_PAGE_TEXT1)).isDisplayed
        driver.findElement(By.xpath(Constants.COUPON_PAGE_TEXT2)).isDisplayed

    }

    fun verifyFilterPageWithAllCoupon()
    {
        driver.findElement(By.id(Constants.FILTER_PAGE_RESET_BUTTON)).isDisplayed
        driver.findElement(By.id(Constants.FILTER_PAGE_HEADLINE)).isDisplayed
        driver.findElement(By.id(Constants.FILTER_PAGE_DONE_BUTTON)).isDisplayed

    }

    fun verifySelectedCouponWithActivateButtonIsShown()
    {
        driver.findElement(By.xpath(Constants.SELECTED_REWE_COUPON)).isDisplayed
        driver.findElement(By.id(Constants.COUPON_ACTIVATE_BUTTON)).isDisplayed
    }

    fun verifyCouponActivated()
    {
        driver.findElement(By.id(Constants.COUPON_DEACTIVATE_BUTTON)).isDisplayed
    }
}