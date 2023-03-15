package Object;

import Interfeises.Attack;
import Interfeises.ColorValue;
import Interfeises.HasHealthPoint;

public class Building implements HasHealthPoint, Attack, ColorValue {
    String name;
    double maxHp;
    double hp;
    double damage;

    public Building(String name, double maxHp) {
        this.name = name;
        this.maxHp = maxHp;
        this.hp = maxHp;
    }

    public Building(String name) {
        this.name = name;
        this.maxHp = Wariors.num.nextInt(1000, 2000);
        this.hp = maxHp;
    }

    @Override
    public void getMaxHp() {
        System.out.println(name + " MaxHP = " + maxHp);

    }

    @Override
    public void getCurrentHp() {
        System.out.println(name + " CurrentHp = " + hp);
    }

    @Override
    public boolean attack(double damage) {
        System.out.println(this.name + " Здание атаковано");
        this.hp -= damage;
        double value = (hp / maxHp) * 100;
        if (value > 50) {
            System.out.println(name + value +" HealthPoint GREEN ");
        } else if (value > 25 && value < 51) {
            System.out.println(name + value + " HealthPoint RED");
        } else if (value > 0 && value <= 25)
            System.out.println(name + value + " HealthPoint BLack");
        else {
            hp = 0;
            System.out.println(name + " здание разрушено");
            return false;
        }
        return true;

    }

    @Override
    public void colorValue() {

    }
}
