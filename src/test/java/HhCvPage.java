import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class HhCvPage {
    private final SelenideElement gender = $x("//span[@class='p-nickname vcard-username d-block']");
    public HhCvPage(String URL) {
        Selenide.open(URL);
    }
    public String getGender(){
        return gender.getText().equals("EvgenyTreskin") ? "М" : null;
    }
}
