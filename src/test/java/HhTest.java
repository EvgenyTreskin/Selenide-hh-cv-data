import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;


public class HhTest extends BaseTest {
    private final static String URL = "https://github.com/EvgenyTreskin";

    @Test
    public void checkAttributesHashMap() throws InterruptedException {
        HhCvPage hhCvPage = new HhCvPage(URL);
        hhCvPage.getGender();
    }

}
