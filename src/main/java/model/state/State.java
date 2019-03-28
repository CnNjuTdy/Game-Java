package model.state;

public interface State {
    String getName();

    int attack(int attack, boolean critical);

    int useSkill(int damage, int power);
}
