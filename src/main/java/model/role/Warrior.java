package model.role;

import pattern.Observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static data.AttributeData.attrs;

public class Warrior implements Role {
    private List<Observer> observers;
    private int hp;
    private int attack;
    private int critical;
    private int defense;
    private int power;
    private int speed;
    private int x, y;

    public Warrior() {
        observers = new ArrayList<>();

        HashMap<String, Integer> config = attrs.get("warrior");
        hp = config.get("hp");
        attack = config.get("attack");
        critical = config.get("critical");
        defense = config.get("defense");
        power = config.get("power");
        speed = config.get("speed");

        x = 0;
        y = 0;
    }

    @Override
    public int getHp() {
        return 0;
    }

    @Override
    public int getAttack() {
        return 0;
    }

    @Override
    public int getCritical() {
        return 0;
    }

    @Override
    public int getDefense() {
        return 0;
    }

    @Override
    public int getPower() {
        return 0;
    }

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }


    @Override
    public void setLocation(int x, int y) {
        if (x == this.x && y == this.y) {
            return;
        }
        this.x = x;
        this.y = y;
        notifyObserver();
    }

    @Override
    public String getConfigName() {
        return "warrior";
    }

    @Override
    public String getDisplayName() {
        return "Warrior";
    }

    @Override
    public void notifyObserver() {
        for (Observer o : observers) {
            o.update(this);
        }
    }

    @Override
    public void register(Observer o) {
        if (observers.indexOf(o) < 0) {
            observers.add(o);
        }
    }
}

