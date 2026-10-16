package Inheritance.Transport;

public class Main {

    public static void main(String[] args) {
        // Car c=new Car("Maruti", "800", 4, 5, "Auto");
        // c.startEngine();
        // c.startAC();
        // c.stopEngine();

        Motorcycle c=new Motorcycle("Splendor", "Xline", 2, "U", "Soft");
        c.startEngine();
        c.wheelie();
        c.stopEngine();
    }
    
}
