package expedition;

public interface AbilityOfExpedition {
    void addExperience(ExperienceOfPast e);
    String getName();
    void changeLocation(geographic.GeoObject GObj);
    void moveTo(geographic.GeoObject GObj);
    geographic.GeoObject getLocation();
}
