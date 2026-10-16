package Inheritance.Transport;

public class Vehicle {

    public String name;
    public String model;
    public int noOfTyres;
    
    //default constructor
    public Vehicle()
    {
        this.name="";
        this.model="";
        this.noOfTyres = -1;
    }

    public Vehicle(String name,String model, int noOfTyres)
    {
        this.name=name;
        this.model=model;
        this.noOfTyres = noOfTyres;
    }

    public void startEngine()
    {
        System.out.println("Engine is starting of "+name+" : "+model);
    } 

    public void stopEngine()
    {
        System.out.println("Engine is stopping of "+name+" : "+model);
    }
}
