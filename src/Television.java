public class Television extends Appliances implements Remote {
    String name;
    boolean isOn;
    int volume;


    /**
     * A constructor for the television class that takes in three params
     * @param name the name of the television
     * @param isOn a boolean to check if the television is turned on
     * @param volume saves the value of the volume of the television
     */
    public Television(String name, boolean isOn, int volume) {
        this.name = name;
        this.isOn = isOn;
        this.volume = volume;
    }


    /**
     * Overridden methods from the abstract class appliances
     */
    @Override
     void display(){
        System.out.println("This is a television");
    }


    // Checks if the television can rotate
    @Override
     boolean rotate() {
        return false;
    }

    // Checks if the television makes sound
    @Override
    public boolean makeSound() {
        return true;
    }

    // Checks if the television lights up a room
    @Override
    public void lightUp() {
        System.out.println("It lights up a room");

    }


    /**
     * Overrides all the methods present in the interface
     *
     */

    // Turns on the television
    @Override
    public boolean turnOn() {
        this.isOn = true;
        System.out.println("The television is turned on");
        return isOn;
    }

    // Increases the volume of the television
    @Override
    public int volumeUp() {
        return volume++;
    }

    // Reduces the volume of the television
    @Override
    public int volumeDown() {
        return volume--;
    }

    // Checks if the television is on or off
    @Override
    public void displayStatus() {
        if (isOn){
        System.out.println("ON");}else System.out.println("OFF");
    }

    // Turns off the television
    @Override
    public boolean turnOff() {
        this.isOn = false;
        System.out.println("The television is off");
        return isOn;
    }

    /**
     *  A method that checks if a number is divisible by 3, 5 or 15 and returns "foo", "bar" or "foobar" respectively
     * @param number number that is to be checked
     * @return returns a string that matches the predicate and returns null if it doesnt match any of the predicates
     */
    public String foobar(int number){
        if (number%15==0){
            return "foobar";
        }else if (number%5==0){
            return "bar";
        }else if (number%3==0){
            return "foo";
        }
        return null;
    }
}
