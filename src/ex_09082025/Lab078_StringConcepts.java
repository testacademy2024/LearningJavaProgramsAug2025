package ex_09082025;

public class Lab078_StringConcepts {
    public static void main(String[] args) {
        String password ="Pramod@123";
        String pass_u=password.toLowerCase();
        System.out.println(pass_u);
        System.out.println(pass_u==password);
        System.out.println(pass_u.equals(password));
        System.out.println(pass_u.equalsIgnoreCase(password));

        System.out.println(password.substring(0,3));
        System.out.println(password.indexOf('r'));
        System.out.println(password.length());

    }
}
