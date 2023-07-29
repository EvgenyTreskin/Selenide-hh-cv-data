import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Selenide.$x;

public class GitProfilePage {
    private final SelenideElement gender = $x("//span[@class='p-nickname vcard-username d-block']");
    private final SelenideElement positiveNumberOfRepositories = $x("//span[@title='9']");
    private final SelenideElement locationCity = $x("//span[@class='p-label']");
    private final SelenideElement positiveNumberOfContribution = $x("//h2[@class='f4 text-normal mb-2']");
    private final SelenideElement readyToRelocate = $x("//div[@data-bio-text='Ready to relocate']");

    public final static String GENDER = "Gender";
    public final static String POSITIVE_NUMBER_OF_REPOSITORIES = "Positive Number Of Repositories";
    public final static String LOCATION_CITY = "Location City";
    public final static String POSITIVE_NUMBER_OF_CONTRIBUTION = "Positive Number Of Contribution";
    public final static String READY_YO_RELOCATE = "Ready To Relocate";

    public GitProfilePage(String URL) {
        Selenide.open(URL);
    }

    public Map<String, Object> getActualAttributes() {
        return new HashMap<>() {{
            put(GENDER, getGender());
            put(POSITIVE_NUMBER_OF_REPOSITORIES, getPositiveNumberOfRepositories());
            put(LOCATION_CITY, getLocationCity());
            put(POSITIVE_NUMBER_OF_CONTRIBUTION, getPositiveNumberOfContribution());
            put(READY_YO_RELOCATE, getReadyToRelocate());
        }};
    }

    public String getGender() {
        return gender.getText().equals("EvgenyTreskin") ? "Male" : null;
    }

    public boolean getPositiveNumberOfRepositories() {
        return Integer.parseInt(positiveNumberOfRepositories.getText()) > 0;
    }

    public String getLocationCity() {
        String[] array = locationCity.getText().split(", ");
        return array[0];
    }

    public boolean getPositiveNumberOfContribution() {
        String[] array = positiveNumberOfContribution.getText().split(" ");
        return Integer.parseInt(array[0]) > 0;
    }

    public boolean getReadyToRelocate() {
        return readyToRelocate.getText().equals("Ready to relocate");
    }
}
