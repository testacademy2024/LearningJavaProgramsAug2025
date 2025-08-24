package ex_22082025;

public class Lab169_ConstructorConcepts {
    public static void main(String[] args) {
        ATBPerson p0=new ATBPerson();
        ATBPerson p1=new ATBPerson("SANKET");//
       // ex_22082025.p1.name="SANKET";// One of the way is After object is created we can assign a value to name variable called from ATBPerson Class
//Another Way is we are going to see a method in which during object creation the value will be assigned.For that we have to pass an argument in the ATBPerson constructor function and pass the value in the ATBPerson object pointing to a reference variable under main method

        ATBPerson p2=new ATBPerson("SMITA");//
        ATBPerson p3=new ATBPerson("AJIT","9819091745");
        System.out.println(p0.name);
        System.out.println(p0.phone);
        System.out.println(p1.name);
        System.out.println(p1.phone);
        System.out.println(p2.name);
        System.out.println(p2.phone);
        System.out.println(p3.name);
        System.out.println(p3.phone);

    }




}
