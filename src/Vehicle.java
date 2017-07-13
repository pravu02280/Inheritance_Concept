/**
 * Created by prabesh on 7/11/17.
 */
public class Vehicle {
    private String name;
    private String size;
    private int currentVelocity = 90;
    private int currenDirection;

   /* public Vehicle(String name, String size, int currentVelocity, int currenDirection) {

        this.name = name;
        this.size = size;
        this.currentVelocity = currentVelocity;
        this.currenDirection = currenDirection;
    }*/

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currenDirection = 1;
        this.currentVelocity = 2;
    }

    public void steer(int direction) {
        this.currenDirection += direction;
        System.out.println("vehicle.steer()" + currenDirection + "degress");

    }

    public void move(int velocity, int direction) {
        currentVelocity = velocity;
        currenDirection = direction;
        System.out.println("vehicle move called ");
        System.out.println("vehicle current velocity" + currentVelocity);
        System.out.println("vehicle current direction" + currenDirection);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        System.out.println("current velocity"+currentVelocity);
        return currentVelocity;
    }
    /*public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }*/

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public int getCurrenDirection() {
        return currenDirection;
    }

    public void stop() {
        System.out.println("stop is called");

    }

}
