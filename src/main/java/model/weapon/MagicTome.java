package model.weapon;

public class MagicTome extends Weapon {
    @Override
    public String getName() {
        return "法杖";
    }

    @Override
    public String getDisplayName() {
        return "法杖 +40法强";
    }

    @Override
    public String getAttribute() {
        return "+40法强";
    }
}
