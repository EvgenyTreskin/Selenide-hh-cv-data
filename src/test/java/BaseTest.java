import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.logging.LogType;

import java.util.logging.Level;

public abstract class BaseTest {
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.driverManagerEnabled = true;
        Configuration.browserSize = "960x1080";
        Configuration.headless = false;

    }
    @BeforeEach
    public void init(){
        setUp();
    }
    @AfterEach
    public void tearDown(){
        Selenide.closeWebDriver();
    }
}
