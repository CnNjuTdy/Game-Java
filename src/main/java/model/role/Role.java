package model.role;

import pattern.Subject;

public interface Role extends Subject {
    int getHp();

    int getAttack();

    int getCritical();

    int getDefense();

    int getPower();

    int getSpeed();

    int getX();

    int getY();

    void setLocation(int x,int y);

    String getConfigName();

    String getDisplayName();

}