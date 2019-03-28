package model.role;

public class Mage extends Role {
    public Mage() {
        super();
        this.setName("法师");
    }

    @Override
    public String getPicName() {
        return "Mage";
    }

}
