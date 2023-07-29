public class Profile {
    private String gender;
    private Boolean numberOfRepositories;
    private String locationCity;
    private Boolean numberOfContribution;
    private Boolean readyToRelocate;

    public Profile(String gender, Boolean numberOfRepositories, String locationCity, Boolean numberOfContribution, Boolean readyToRelocate) {
        this.gender = gender;
        this.numberOfRepositories = numberOfRepositories;
        this.locationCity = locationCity;
        this.numberOfContribution = numberOfContribution;
        this.readyToRelocate = readyToRelocate;
    }

    public String getGender() {
        return gender;
    }

    public Boolean getNumberOfRepositories() {
        return numberOfRepositories;
    }

    public String getLocationCity() {
        return locationCity;
    }

    public Boolean getNumberOfContribution() {
        return numberOfContribution;
    }

    public Boolean getReadyToRelocate() {
        return readyToRelocate;
    }
}
