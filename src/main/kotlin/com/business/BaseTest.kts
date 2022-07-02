import io.appium.java_client.MobileElement
import io.appium.java_client.android.AndroidDriver
import org.junit.After
import org.junit.Before
import org.openqa.selenium.remote.DesiredCapabilities
import java.lang.Exception
import java.net.URL

open class BaseTest {
    var driver: AndroidDriver<MobileElement>? = null

    @Before
    fun setUp() {
        val webDriverURL: URL = URL("http://127.0.0.1:4723/wd/hub")
        var caps: DesiredCapabilities? = Capabilities.AndroidBaseCapabilities()
        driver = AndroidDriver(webDriverURL, caps)
    }

    @After
    fun tearDown() {
        driver?.quit() ?: throw Exception("Driver instance was unable to quit.")
    }

}