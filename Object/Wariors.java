package Object;

import java.util.Random;

import Interfeises.Attack;

import Interfeises.HasHealthPoint;

import Interfeises.Tiredness;

public class Wariors implements HasHealthPoint, Tiredness, Attack {
    String name;
    double hp;
    double maxHp;
    double energy;
    double maxEnergy;
    double damage;
    static Random num;

    static {
        num = new Random();
    }

    public Wariors(String name, double maxHp, double maxEnergy) {
        this.name = name;
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.maxEnergy = maxEnergy;
        this.energy = maxEnergy;

    }

    public Wariors(String name) {
        this.name = name;
        this.maxHp = num.nextInt(100, 200);
        this.hp = maxHp;
        this.maxEnergy = num.nextInt(100, 200);
        this.energy = maxEnergy;
        // this.damage = num.nextInt(25,50);
    }

    @Override
    public void getMaxEnergy() {
        System.out.println(name + " MaxEnergy = " + maxEnergy);

    }

    @Override
    public void getCurrentEnergy() {
        System.out.println(name + " CurentEnergy = " + energy);

    }

    @Override
    public void getMaxHp() {
        System.out.println(name + " MaxHp = " + maxHp);

    }

    @Override
    public void getCurrentHp() {
        System.out.println(name + " CurrentHp = " + hp);

    }

    public double damager() {
        System.out.println(this.name + " Персонаж атакует ");
        double tire = energy / maxEnergy;
        if (tire > 0) {
            double damage = num.nextInt(150, 200) * tire;
            energy = energy - (damage * 0.1);
            if (energy <= 0) {
                energy = 0;
            }
            return damage;
        }

        else {
            damage = num.nextInt(150, 200);
            return damage;
        }

    }

    @Override
    public boolean attack(double damage) {
        System.out.println(this.name + " Персонаж атакован");
        this.hp -= damage;
        double value =  (hp / maxHp) * 100;
        if (value > 50) {
            System.out.println(name + value + " HealthPoint GREEN");
        } else if (value > 25 && value < 51) {
            System.out.println(name + value + " HealthPoint RED");
        } else if (value > 0 && value <= 25){
            System.out.println(name + value + " HealthPoint BLACK");
        } else {
            hp = 0;
            System.out.println(name + " Персонаж умер");
            return false;
        }
        return true;

    }



}
