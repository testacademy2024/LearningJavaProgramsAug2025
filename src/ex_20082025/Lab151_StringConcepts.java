package ex_20082025;

public class Lab151_StringConcepts {
    public static void main(String[] args) {
        // String - Bunch of Chars.
        //
        String s1 = new String("pramod"); // Heap Area
        String s2 = "pramod"; // String constant pool

        // String - Immutable in nature.
        System.out.println(s1.length());
        System.out.println(s1.indexOf("p"));
        System.out.println(s1.charAt(0));
        System.out.println(s1.toLowerCase());

    }
}
