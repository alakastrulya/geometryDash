//Responsible only for displaying the current score - S
//Dependency Inversion Principle (DIP)
public class CurrentGameScore {
    private NormalMode normalMode;
    private PractiseMode practiseMode;

    public CurrentGameScore(NormalMode normalMode, PractiseMode practiseMode) {
        this.normalMode = normalMode;
        this.practiseMode = practiseMode;
    }

    public void printScore() {
        System.out.println("Current Game Score:");
        System.out.println("Normal Mode - Percent: " + normalMode.getPercent() + "%, Attempts: " + normalMode.getAttempts());
        System.out.println("Practise Mode - Percent: " + practiseMode.getPercent() + "%, Attempts: " + practiseMode.getAttempts());
        System.out.println("Has Crystal: " + practiseMode.hasCrystal());
    }
}
