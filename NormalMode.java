// Open/Closed Principle (OCP)
// This class can be extended (inherited) but not modified
// Interface Segregation Principle (ISP)
// Implements only the necessary interfaces
public class NormalMode implements Percent, AttemptsScore{
    private int percent;
    private int attempts;

    @Override
    public void setPercent(int percent) {
        this.percent = Math.max(this.percent, percent);
    }

    @Override
    public int getPercent() {
        return percent;
    }

    @Override
    public void increaseAttempts() {
        attempts++;
    }

    @Override
    public int getAttempts() {
        return attempts;
    }
}