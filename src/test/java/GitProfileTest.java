import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;

public class GitProfileTest extends BaseTest {
    private final static String URL = "https://github.com/EvgenyTreskin";

    private Map<String, Object> getExpectedAttributes() {
        return new HashMap<>(){{
            put(GitProfilePage.GENDER, "Male");
            put(GitProfilePage.POSITIVE_NUMBER_OF_REPOSITORIES, true);
            put(GitProfilePage.LOCATION_CITY, "Nizhny Novgorod");
            put(GitProfilePage.POSITIVE_NUMBER_OF_CONTRIBUTION, true);
            put(GitProfilePage.READY_YO_RELOCATE, true);
        }};
    }
    @Test
    public void checkAttributesHashMap() throws InterruptedException {
        GitProfilePage gitProfilePage = new GitProfilePage(URL);
        Map<String, Object> expectedAttributes = getExpectedAttributes();
        Map<String, Object> actualAttributes = gitProfilePage.getActualAttributes();
        Assertions.assertEquals(expectedAttributes, actualAttributes);
    }
    @Test
    public void checkAttributesClass(){
        GitProfilePage gitProfilePage = new GitProfilePage(URL);

        Profile expectedAttributes = new Profile("Male", true, "Nizhny Novgorod",
                true, true);

        Profile actualAttributes = new Profile(gitProfilePage.getGender(), gitProfilePage.getNumberOfRepositories(),
                gitProfilePage.getLocationCity(), gitProfilePage.getNumberOfContribution(),
                gitProfilePage.getReadyToRelocate());

        Assertions.assertTrue(EqualsBuilder.reflectionEquals(expectedAttributes, actualAttributes));

        Assertions.assertEquals(expectedAttributes.getGender(),
                actualAttributes.getGender());
        Assertions.assertEquals(expectedAttributes.getNumberOfRepositories(),
                actualAttributes.getNumberOfRepositories());
        Assertions.assertEquals(expectedAttributes.getLocationCity(),
                actualAttributes.getLocationCity());
        Assertions.assertEquals(expectedAttributes.getNumberOfContribution(),
                actualAttributes.getNumberOfContribution());
        Assertions.assertEquals(expectedAttributes.getReadyToRelocate(),
                actualAttributes.getReadyToRelocate());

    }

}
