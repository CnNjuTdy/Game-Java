package model.role;

import config.GameConfig;
import model.skill.NoSkill;
import model.skill.Skill;
import model.state.DefaultState;
import model.state.State;
import model.weapon.NoWeapon;
import model.weapon.Weapon;
import pattern.Subject;

import static game.Game.*;

import java.util.ArrayList;
import java.util.List;

public abstract class Role extends Subject {
    protected Weapon weapon;
    private List<Skill> skills;
    private int skillNumber;
    private List<Skill> skillsCanLearn;
    private State state;
    private static GameConfig gameConfig = GameConfig.getInstance();

    private String name;

    private int level;
    private int exp;

    private int hp;
    private int attack;
    private int critical;
    private int defense;
    private int power;
    private int speed;

    private int x, y;

    Role() {
        this.weapon = new NoWeapon();
        this.skills = new ArrayList<>();
        this.skills.add(new NoSkill());
        this.skills.add(new NoSkill());
        this.skillNumber = 0;
        this.skillsCanLearn = skillFactory.createSkills();
        this.state = new DefaultState();
        this.level = 1;
        this.exp = 0;

        String className = this.getClass().getName();
        this.hp = Integer.valueOf(gameConfig.get(String.format("%s.%s", className, "hpLevelUp")));
        this.attack = Integer.valueOf(gameConfig.get(String.format("%s.%s", className, "attackLevelUp")));
        this.critical = Integer.valueOf(gameConfig.get(String.format("%s.%s", className, "criticalLevelUp")));
        this.defense = Integer.valueOf(gameConfig.get(String.format("%s.%s", className, "defenseLevelUp")));
        this.power = Integer.valueOf(gameConfig.get(String.format("%s.%s", className, "powerLevelUp")));
        this.speed = Integer.valueOf(gameConfig.get(String.format("%s.%s", className, "speedLevelUp")));
    }

    public void levelUp() {
        String className = this.getClass().getName();
        this.level++;
        this.hp += Integer.valueOf(gameConfig.get(String.format("%s.%s", className, "hpLevelUp")));
        this.attack += Integer.valueOf(gameConfig.get(String.format("%s.%s", className, "attackLevelUp")));
        this.critical += Integer.valueOf(gameConfig.get(String.format("%s.%s", className, "criticalLevelUp")));
        this.defense += Integer.valueOf(gameConfig.get(String.format("%s.%s", className, "defenseLevelUp")));
        this.power += Integer.valueOf(gameConfig.get(String.format("%s.%s", className, "powerLevelUp")));
        this.speed += Integer.valueOf(gameConfig.get(String.format("%s.%s", className, "speedLevelUp")));
    }

    public int getHp() {
        return this.hp;
    }

    public int getAttack() {
        return this.attack;
    }

    public int getLevel() {
        return this.level;
    }

    public int getExp() {
        return this.exp;
    }

    public int getCritical() {
        return this.critical;
    }

    public int getDefense() {
        return this.defense;
    }

    public int getPower() {
        return this.power;
    }

    public int getSpeed() {
        return this.speed;
    }

    public List<Skill> getSkills() {
        return this.skills;
    }

    public State getState() {
        return this.state;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public void setLocation(int x, int y) {
        if (x == this.x && y == this.y) {
            return;
        }
        this.x = x;
        this.y = y;
        notifyObserver();
    }

    public int getSkillNumber() {
        return skillNumber;
    }

    public void setSkillNumber(int skillNumber) {
        this.skillNumber = skillNumber;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public List<Skill> getSkillsCanLearn() {
        return skillsCanLearn;
    }
}