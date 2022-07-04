import org.openqa.selenium.remote.DesiredCapabilities

class Capabilities {
    companion object {
        fun AndroidBaseCapabilities(): DesiredCapabilities {
            val caps = DesiredCapabilities()
            caps.setCapability("platformName", "Android")
            caps.setCapability("automationName", "UiAutomator2")
            caps.setCapability("deviceName", "Galaxy A32")
            caps.setCapability("udid","")
            // Commented below  as we are going to use existing login session, we will use when we install fresh app
            //caps.setCapability("appPackage", "de.payback.client.android")
            //caps.setCapability("appActivity", "de.payback.app.deeplinks.StarterActivity")
            return caps
        }
    }
}