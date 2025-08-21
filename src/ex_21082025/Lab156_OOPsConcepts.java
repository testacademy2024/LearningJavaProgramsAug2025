package ex_21082025;

public class Lab156_OOPsConcepts {
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.name="Toffee";
        d1.breed="Napolean Mastiff";
        d1.age=10;
        d1.color="Black";
        d1.eat();
        d1.sleep();
        d1.talk();
        d1.walk();

        Dog d2=new Dog();
        d2.name="Snow";
        d2.breed="German Shephard";
        d2.age=11;
        d2.color="White";
        d2.eat();
        d2.sleep();
        d2.talk();
        d2.walk();
        // functions - perform a task , block of code
        // functions within the class are called -> methods?
        // class -> blueprint
        // object ->  real entity created from the class. / instance of the class.
    }
}
