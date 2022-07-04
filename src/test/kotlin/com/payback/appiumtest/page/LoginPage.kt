package com.payback.appiumtest.page

import com.payback.appiumtest.base.BasePage
import com.payback.appiumtest.base.Constants
import io.appium.java_client.AppiumDriver
import org.openqa.selenium.By

class LoginPage(driver: AppiumDriver) : BasePage(driver) {

    ///////Action///////

    fun loginIntoApp(userId:String,password:String)
    {
        driver.findElement(By.id(Constants.LOGIN_BUTTON)).sendKeys(userId)
        driver.findElement(By.id(Constants.USERNAME_FIELD)).sendKeys(userId)
        driver.findElement(By.id(Constants.PASSWORD_FIELD)).sendKeys(password)
    }




}