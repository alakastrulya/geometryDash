import java.util.HashMap;
import java.util.Map;
//This class is responsible only for managing game progress
//Dependency Inversion Principle (DIP)

public class GameProgress {
    private Map<Integer, Level> levels = new HashMap<>();

    public Level getLevel(int levelNumber) {
        Level level = levels.computeIfAbsent(levelNumber, Level::new);
        if (level == null) {
            System.out.println("Error!");
        }
        return level;
    }

    public void updateLevelProgress(int levelNumber, int normalPercent, int practicePercent) {
        Level level = getLevel(levelNumber);
        level.getNormalMode().setPercent(normalPercent);
        level.getPractiseMode().setPercent(practicePercent);
    }

}
