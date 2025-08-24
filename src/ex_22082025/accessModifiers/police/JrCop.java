package ex_22082025.accessModifiers.police;

public class JrCop {
    public static void main(String[] args) {
        Cop c=new Cop(10);
        System.out.println(c.gun);// as instance variable are private within the class, it cannot be accessed, if wants to access then, instance variable has to be marked as protected
        c.canIShoot();//as function are private within the class, it cannot be accessed, if it want to access then function has to be marked as protected
    }
}
