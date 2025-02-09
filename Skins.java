// Responsible only for one data
public class Skins {
    private int skinID;
    private String color;

    Skins(){}

    Skins(int skinID, String color) {
        this.skinID = skinID;
        this.color = color;
    }


    public int getSkinID() {
        return skinID;
    }

    public void setSkinID(int skinID) {
        this.skinID = skinID;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
