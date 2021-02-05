public class Main {
    public static void main(String[] args) {

        // Created an object of the television class
        Television samsung = new Television("Samsung", true, 0);

        // Calling the only method not overridden from the abstract class
        System.out.println(samsung.requiresElectricity());

        //Calling the various methods that has been overridden from the abstract class and interface
        samsung.turnOn();
        samsung.display();
        samsung.displayStatus();
        samsung.volumeUp();
        samsung.volumeUp();
        System.out.println(samsung.volume);
        System.out.println(samsung.rotate());
        System.out.println(samsung.makeSound());
        samsung.lightUp();
        samsung.turnOff();
        samsung.displayStatus();
        samsung.displayName();

        // Prints out the result of a method that checks if a number is divisible by 3,5 or 15
        System.out.println(samsung.foobar(45));

    }
}
