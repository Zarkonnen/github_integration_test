import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class jam {
    public static void main(String[] args) throws Exception {
        RemoteWebDriver wd;
        DesiredCapabilities caps = DesiredCapabilities.ipad();
    caps.setCapability("name", "jam");
wd = new RemoteWebDriver(
    new URL("http://zarkonnen:273254a4-8ccb-4eb2-b27f-a76d6fd872b8@ondemand.saucelabs.com:80/wd/hub"),
    caps);
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://sebuilder.github.com/se-builder/");
        wd.close();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
