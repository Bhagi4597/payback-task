import org.openqa.selenium.remote.DesiredCapabilities

class Capabilities {
    companion object {
        fun AndroidBaseCapabilities(): DesiredCapabilities {
            val caps = DesiredCapabilities()
            caps.setCapability("platformName", "Android")
            caps.setCapability("automationName", "UiAutomator2")
            caps.setCapability("deviceName", "Galaxy A32")
            caps.setCapability("udid","RZ8RB1VBAMP")
            caps.setCapability("appActivity", "de.payback.app.deeplinks.StarterActivity")
            caps.setCapability("appPackage", "de.payback.client.android")
            return caps
        }
    }
}