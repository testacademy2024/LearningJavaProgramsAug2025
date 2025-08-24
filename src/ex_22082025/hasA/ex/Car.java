package ex_22082025.hasA.ex;

public class Car {
    // Aggregation - hasA
    protected void StartTheCar()
    {
new Engine().start();
new Tyres().rolling();
    }
}
