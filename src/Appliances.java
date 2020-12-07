public abstract class Appliances {

     abstract void display();

     abstract boolean rotate();

     abstract boolean makeSound();

     abstract void lightUp();

    public boolean requiresElectricity(){
        return true;
    }

}
