// Responsible only for one data type
public class Character {
    private String name;
    private Skins skins;
    private Achievements achievements;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skins getSkins() {
        return skins;
    }

    public void setSkins(Skins skins) {
        this.skins = skins;
    }

    public Achievements getAchievements() {
        return achievements;
    }

    public void setAchievements(Achievements achievements) {
        this.achievements = achievements;
    }
}
