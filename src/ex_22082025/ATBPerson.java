package ex_22082025;

public class ATBPerson {
    String name;
    String phone;

    // DC
    ATBPerson() {
        System.out.println("Object is created!");
    }
    ATBPerson(String nameFromObjectCreated) //Constructor with arguments
    {
        this.name=nameFromObjectCreated;

    }
ATBPerson(String nameFromObjectCreated,String phoneFromObjectCreated) //Constructor with arguments
{
this.name=nameFromObjectCreated;
this.phone=phoneFromObjectCreated;
}


}
