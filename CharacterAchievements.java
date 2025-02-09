import java.util.ArrayList;

public class CharacterAchievements implements AchievementManager {
    private Achievements achievements;

    public CharacterAchievements(Achievements achievements) {
        this.achievements = achievements;
    }

    @Override
    public boolean hasAchievement(String name) {
        for (Achieve achieve : achievements.getAchievements()) {
            if (achieve.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public Achievements getAchievements() {
        return achievements;
    }

    public void setAchievements(Achievements achievements) {
        this.achievements = achievements;
    }
}
