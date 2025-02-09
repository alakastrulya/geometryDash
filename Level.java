// Responsible only for storing level data
// Open for extension
public class Level {
    private int number;
    private NormalMode normalMode;
    private PractiseMode practiseMode;

    Level(){}

    Level(int number){
        this.number = number;
        this.normalMode = new NormalMode();
        this.practiseMode = new PractiseMode();
    }

    Level(int number, NormalMode normalMode, PractiseMode practiseMode) {
        this.number = number;
        this.normalMode = normalMode;
        this.practiseMode = practiseMode;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setNormalMode(NormalMode normalMode) {
        this.normalMode = normalMode;
    }

    public void setPractiseMode(PractiseMode practiseMode) {
        this.practiseMode = practiseMode;
    }

    public NormalMode getNormalMode() {
        return normalMode;
    }

    public PractiseMode getPractiseMode() {
        return practiseMode;
    }
}
