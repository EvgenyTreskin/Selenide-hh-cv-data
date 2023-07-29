import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class GitProfileTest extends BaseTest {
    private final static String URL = "https://github.com/EvgenyTreskin";

    @Test
    public void checkAttributesHashMap() throws InterruptedException {
        GitProfilePage gitProfilePage = new GitProfilePage(URL);
        Map<String, Object> expectedAttributes = getExpectedAttributes();
        Map<String, Object> actualAttributes = gitProfilePage.getActualAttributes();
        Assertions.assertEquals(expectedAttributes, actualAttributes);
    }
    private Map<String, Object> getExpectedAttributes() {
        return new HashMap<>(){{
            put(GitProfilePage.GENDER, "Male");
            put(GitProfilePage.POSITIVE_NUMBER_OF_REPOSITORIES, true);
            put(GitProfilePage.LOCATION_CITY, "Nizhny Novgorod");
            put(GitProfilePage.POSITIVE_NUMBER_OF_CONTRIBUTION, true);
            put(GitProfilePage.READY_YO_RELOCATE, true);
        }};
    }

}
