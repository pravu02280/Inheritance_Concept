/**
 * Created by prabesh on 7/11/17.
 */
public class Suzuki extends Car {
    private int roadservicesmonths;

  /*  public Suzuki(String name, String size, int wheels, int doors, int gears, boolean isManual, int currentGear, int roadservicesmonths) {
        super(name, size, wheels, doors, gears, isManual, currentGear);
        this.roadservicesmonths = roadservicesmonths;
    }*/
  /*suzuki ra 4wd vhayo teha super ma vhayesi mathi parameter ma lekhna jaruri xaina*/

    public Suzuki(int roadservicesmonths) {
        super("suzuki", "4wd", 1, 5, 5, true);
        this.roadservicesmonths = roadservicesmonths;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
            Changegear(1);
        } else if (newVelocity > 0 && newVelocity <= 10) {
            Changegear(1);

        } else if (newVelocity > 10 && newVelocity <= 20) {
            Changegear(2);

        } else if (newVelocity > 20 && newVelocity <= 30) {
            Changegear(3);
        } else {
            Changegear(4);
        }
    }
}
