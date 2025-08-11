package ex_09082025;

public class Lab067_StringConcepts {
    public static void main(String[] args) {
        String name="SANKET";  // = "SCP" // Sting constant Pool
        // String? - // Bunch of Chars - Collection of Chars
        // class - ?
        String name2 = new String("SANKET");  // new - Objects(heap)
        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(7));  //StringIndexOutOfBoundException

    }
}
