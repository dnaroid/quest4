package quest4;

import quest4.Aircraft.Aircraft;

/**
 *
 * @author buzz
 */
public class Quest4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft(1);
        System.out.println(aircraft.toString());
        aircraft.setTarget("Berlin");
        aircraft.printTarget();
        aircraft.fly();
    }
    
}
