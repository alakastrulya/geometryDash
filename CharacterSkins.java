import java.util.ArrayList;

public class CharacterSkins implements SkinManager {
    private ArrayList<Skins> availableSkins = new ArrayList<>();
    private Skins currentSkin;

    public Skins getCurrentSkin() {
        return currentSkin;
    }

    public void setCurrentSkin(Skins skin) {
        this.currentSkin = skin;
    }

    @Override
    public void addSkin(Skins skin) {
        if (!availableSkins.contains(skin)) {
            availableSkins.add(skin);
        }
    }

    @Override
    public ArrayList<Skins> getAvailableSkins() {
        return availableSkins;
    }
}
