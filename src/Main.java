import java.util.Scanner;

/**
 * Created by prabesh on 7/10/17.
 *
 * @author prabesh
 */
/*
* base class vehicle banaune tespaxi create car class
* that inherits from this base class
* Finally create another class alli specific jasle car class
* ko inherit garos
* you should be able to hand steering,changing gears,and moving(speed in other word)
* specific ko lagi specific kei add garne 
*
* */


public class Main {
    public static void main(String[] args) {
       Suzuki suzuki=new Suzuki(2);
        
        suzuki.accelerate(23);
/* @output <<  suzuki.accelerate(0);
           <<suzuki.move(2,3);
Car.setgear changed to 1gear
vehicle move called
vehicle current velocity2
vehicle current direction3
*/

    }
}
