public class Television extends Appliances implements Remote {
    String name;
    boolean isOn;
    int volume;

    public Television(String name, boolean isOn, int volume) {
        this.name = name;
        this.isOn = isOn;
        this.volume = volume;
    }

    @Override
     void display(){
        System.out.println("This is a television");
    }

    @Override
     boolean rotate() {
        return false;
    }

    @Override
    public boolean makeSound() {
        return true;
    }

    @Override
    public void lightUp() {
        System.out.println("It lights up a room");

    }


    // Interface methods
    @Override
    public boolean turnOn() {
        this.isOn = true;
        System.out.println("The television is turned on");
        return isOn;
    }

    @Override
    public int volumeUp() {
        return volume++;
    }

    @Override
    public int volumeDown() {
        return volume--;
    }

    @Override
    public void displayStatus() {
        if (isOn){
        System.out.println("ON");}else System.out.println("OFF");
    }

    @Override
    public boolean turnOff() {
        this.isOn = false;
        System.out.println("The television is off");
        return isOn;
    }

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
