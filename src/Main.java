public class Main {
    public static void main(String[] args) {
        Television samsung = new Television("Samsung", true, 0);
        int volume = 0;
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

        System.out.println(samsung.foobar(45));

    }
}
