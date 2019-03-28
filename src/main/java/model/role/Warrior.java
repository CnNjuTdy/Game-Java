package model.role;

public class Warrior extends Role {
    public Warrior() {
        super();
        this.setName("战士");
    }

    @Override
    public String getPicName() {
        return "Warrior";
    }
}

