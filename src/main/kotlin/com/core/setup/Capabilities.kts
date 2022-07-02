import org.openqa.selenium.WebDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver
import java.net.URL

class Capabilities {
    companion object {
        fun AndroidBaseCapabilities(): DesiredCapabilities {
            val caps = DesiredCapabilities()
            caps.setCapability("BROWSER_NAME", "Android");
            caps.setCapability("VERSION", "12");
            caps.setCapability("autoAcceptAlerts", true)
            caps.setCapability("platformName", "Android")
            caps.setCapability("automationName", "UiAutomator2")
            caps.setCapability("deviceName", "Galaxy A32")
            caps.setCapability("udid","<<your device id>>")
            caps.setCapability("appActivity", "de.payback.app.deeplinks.StarterActivity")
            caps.setCapability("appPackage", "de.payback.client.android")
            return caps
        }
    }
}