import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Character player = new Character("Ақмаржан");

        Skins firstSkin = new Skins(1, "Blue");
        Skins unlockSkin = new Skins(2, "Purple");
        player.getSkins().addSkin(firstSkin);
        player.getSkins().setCurrentSkin(firstSkin);

        // Create Achievements
        Achievements achievements = new Achievements(0);
        ArrayList<Achieve> achieveList = new ArrayList<>();
        Achieve firstAchieve = new Achieve("First Jump");
        Achieve secondAchieve = new Achieve("Strong Player");
        Achieve thirdAchieve = new Achieve("Daily Game");
        Achieve fourthAchieve = new Achieve("Supporter");
        Achieve fifthAchieve = new Achieve("Loyal user");
        achieveList.add(firstAchieve);
        achieveList.add(secondAchieve);
        achieveList.add(thirdAchieve);
        achieveList.add(fourthAchieve);
        achieveList.add(fifthAchieve);
        achievements.setAchievements(achieveList);
        player.getAchievements().setAchievements(achievements);

        if (player.getAchievements().hasAchievement("Strong Player")) {
            player.getSkins().addSkin(unlockSkin);
        }

        System.out.println();

        // Information about character
        System.out.println("Player: " + player.getName());
        System.out.println("Skin's ID: " + player.getSkins().getCurrentSkin().getSkinID() +
                ", Color: " + player.getSkins().getCurrentSkin().getColor());

        System.out.println("Availaable skins:");
        for (Skins skin : player.getSkins().getAvailableSkins()) {
            System.out.println(" - Skin's ID: " + skin.getSkinID() + ", Color: " + skin.getColor());
        }

        System.out.println("Achievements:");
        for (Achieve achieve : player.getAchievements().getAchievements().getAchievements()) {
            System.out.println(" - " + achieve.getName());
        }
        System.out.println();

        GameProgress gameProgress = new GameProgress();
        Level level1 = gameProgress.getLevel(1);
        Level level2 = gameProgress.getLevel(2);
        Level level3 = gameProgress.getLevel(3);
        Level level4 = gameProgress.getLevel(4);
        Level level5 = gameProgress.getLevel(5);
        Level level6 = gameProgress.getLevel(6);
        Level level7 = gameProgress.getLevel(7);
        Level level8 = gameProgress.getLevel(8);
        System.out.println();


        // Simulating the passage of levels
        System.out.println("You started first level!");
        level1.getNormalMode().setPercent(50);
        level1.getNormalMode().increaseAttempts();
        level1.getNormalMode().setPercent(30);
        level1.getNormalMode().increaseAttempts();
        level1.getNormalMode().setPercent(17);
        level1.getNormalMode().increaseAttempts();
        level1.getNormalMode().setPercent(60);
        level1.getNormalMode().increaseAttempts();
        level1.getPractiseMode().setPercent(90);
        level1.getPractiseMode().increaseAttempts();
        level1.getPractiseMode().addCrystal();

        // Output about progress
        CurrentGameScore gameScore = new CurrentGameScore(level1.getNormalMode(), level1.getPractiseMode());
        gameScore.printScore();

        System.out.println();

        // Simulating the passage of levels
        System.out.println("You started second level!");
        level2.getNormalMode().setPercent(10);
        level2.getNormalMode().increaseAttempts();
        level2.getNormalMode().setPercent(30);
        level2.getNormalMode().increaseAttempts();
        level2.getPractiseMode().setPercent(40);
        level2.getPractiseMode().increaseAttempts();
        level2.getPractiseMode().addCrystal();
        level2.getPractiseMode().setPercent(15);
        level2.getPractiseMode().increaseAttempts();
        level2.getPractiseMode().setPercent(5);
        level2.getPractiseMode().increaseAttempts();
        level2.getPractiseMode().removeCrystal();

        // Output about progress
        CurrentGameScore gameScore2 = new CurrentGameScore(level2.getNormalMode(), level2.getPractiseMode());
        gameScore2.printScore();

        System.out.println();

        // Simulating the passage of levels
        System.out.println("You started fifth level!");
        level5.getPractiseMode().setPercent(40);
        level5.getPractiseMode().increaseAttempts();
        level5.getPractiseMode().addCrystal();
        level5.getPractiseMode().setPercent(15);
        level5.getPractiseMode().increaseAttempts();
        level5.getPractiseMode().setPercent(5);
        level5.getPractiseMode().increaseAttempts();
        level5.getPractiseMode().removeCrystal();
        level5.getPractiseMode().setPercent(70);
        level5.getPractiseMode().increaseAttempts();
        level5.getPractiseMode().addCrystal();


        // Output about progress
        CurrentGameScore gamescore5 = new CurrentGameScore(level5.getNormalMode(), level5.getPractiseMode());
        gamescore5.printScore();

        System.out.println();


        LevelsState levelsState = new LevelsState();
        ArrayList<Level> levels = new ArrayList<>();
        levels.add(level1);
        levels.add(level2);
        levels.add(level3);
        levels.add(level4);
        levels.add(level5);
        levels.add(level6);
        levels.add(level7);
        levels.add(level8);
        levelsState.setLevels(levels);

        // Information about all levels
        System.out.println("All levels:");
        for (Level level : levelsState.getLevels()) {
            System.out.println("Level: " + level.getNumber() + ", Normal mode: " + level.getNormalMode().getPercent() + "%");
        }
    }
}