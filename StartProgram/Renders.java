package StartProgram;



import Interfeises.HasHealthPoint;
import Interfeises.Tiredness;


public class Renders {

    static void render(Object object) {

        if (object instanceof HasHealthPoint hasHealthPoint) {
            hasHealthPoint.getMaxHp();
            hasHealthPoint.getCurrentHp();


  
        }

        if (object instanceof Tiredness Tiredness) {
           Tiredness.getMaxEnergy();
           Tiredness.getCurrentEnergy();
        }

  
}
    
}
    



