package StartProgram;


import Object.Building;
import Object.Wariors;

public class StartProgram {
    public static void main(String[] args) {
        Wariors ivan = new Wariors("Ivan",300,200);
        Wariors sasha = new Wariors("Sasha", 200,200);
        Building toun = new Building("toun");

        Renders.render(ivan);
        toun.attack(ivan.damager());
        Renders.render(toun);
        Renders.render(ivan);
        toun.attack(sasha.damager());
        Renders.render(toun);
        Renders.render(ivan);
        ivan.attack(sasha.damager());
        Renders.render(ivan);
        Renders.render(sasha);
        sasha.attack(ivan.damager());
        Renders.render(sasha);



        




        




    }
}
