// Responsible only for character
public class Character {
    private String name;
    private CharacterSkins skins;
    private CharacterAchievements achievements;

    public Character(String name) {
        this.name = name;
        this.skins = new CharacterSkins();
        this.achievements = new CharacterAchievements(new Achievements(0));
    }

    public String getName() {
        return name;
    }

    public CharacterSkins getSkins() {
        return skins;
    }

    public CharacterAchievements getAchievements() {
        return achievements;
    }
}
