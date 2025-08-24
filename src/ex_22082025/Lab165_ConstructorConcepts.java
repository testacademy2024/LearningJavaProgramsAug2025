package ex_22082025;

public class Lab165_ConstructorConcepts {

    int e=145;  // Instance Variable != Global Variable

    void f1(){
        int e = 10; // Local Variable scope limited to the function
        System.out.println(e);
    }
    void f2(){
        //e = 50;// Local Variable scope limited to the function
        System.out.println(e);
    }

}
