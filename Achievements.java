import java.lang.reflect.Array;
import java.util.ArrayList;

public class Achievements {
    private int AchievementsScore;
    private ArrayList<Achieve> achievements;

    Achievements() {}
    Achievements(int AchievementsScore) {
        this.AchievementsScore = AchievementsScore;
    }

    public int getAchievementsScore() {
        return AchievementsScore;
    }

    public void setAchievementsScore(int achievementsScore) {
        AchievementsScore = achievementsScore;
    }

    public ArrayList<Achieve> getAchievements() {
        return achievements;
    }

    public void setAchievements(ArrayList<Achieve> achievements) {
        this.achievements = achievements;
    }
}
