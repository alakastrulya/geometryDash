// Open/Closed Principle (OCP)
// Interface Segregation Principle (ISP)
public class PractiseMode implements Percent, AttemptsScore, Crystal {
    private int percent;
    private int attempts;
    private boolean hasCrystal;

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

    @Override
    public void addCrystal() {
        hasCrystal = true;
    }

    @Override
    public void removeCrystal() {
        hasCrystal = false;
    }

    @Override
    public boolean hasCrystal() {
        return hasCrystal;
    }
}
