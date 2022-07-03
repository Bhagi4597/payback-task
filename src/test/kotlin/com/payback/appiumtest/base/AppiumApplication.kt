package com.payback.appiumtest.base

import io.appium.java_client.AppiumDriver
import io.appium.java_client.remote.AutomationName
import io.appium.java_client.remote.MobileCapabilityType
import org.openqa.selenium.WebDriver
import org.openqa.selenium.remote.DesiredCapabilities
import java.io.File
import java.net.MalformedURLException
import java.net.URL
import java.util.concurrent.TimeUnit

class AppiumApplication {

    val driver: WebDriver
        get() = Companion.driver

    fun initialiseAppium() {
        var capabilities: DesiredCapabilities? = Capabilities.AndroidBaseCapabilities()
        try {
            Companion.driver = AppiumDriver(URL("http://0.0.0.0:4723/wd/hub"), capabilities).apply {
            }
        } catch (e: MalformedURLException) {
            e.printStackTrace()
        }
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS)
    }

    fun shutDown() {
        driver.quit()
    }

    companion object {
        lateinit var driver: WebDriver
            private set
    }
}