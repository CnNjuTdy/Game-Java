package model.role;

public class Monster {
    private int id;
    private int hp;
    private int attack;
    private int defend;
    private int exp;
    private String name;

    public Monster(int id, int hp, int attack, int defend, int exp, String name) {
        this.id = id;
        this.hp = hp;
        this.attack = attack;
        this.defend = defend;
        this.exp = exp;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getHp() {
        return hp;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefend() {
        return defend;
    }

    public int getExp() {
        return exp;
    }

    public String getName() {
        return name;
    }
}

