package AbstractDesign;


abstract class Bird
{
    abstract void fly();

    abstract void eat();
}

class Sparrow extends Bird
{
    void fly()
    {
        System.out.println("Sparrow is flying");
    }

    void eat()
    {
        System.out.println("Sparrow is eating");
    }
}

class Crow extends Bird
{
    void fly()
    {
        System.out.println("Crow is flying");
    }

    void eat()
    {
        System.out.println("Crow is eating");
    }
}

public class Main {

    public static void main(String[] args) {
        
        // Bird b=new Bird();--not allowed
        Bird b = new Sparrow();
        b.fly();
        b.eat();

        b = new Crow();
        b.fly();
        b.eat();
    }
    
}
