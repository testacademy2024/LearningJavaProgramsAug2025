package ex_09082025;

public class Lab076_StringConcepts {
    public static void main(String[] args) {
        String s1 = "Pramod";
        //String s1 = "P r a m o d";
        //          |0|1|2|3|4|5|
        char c = s1.charAt(5);
        System.out.println(c);
        s1 = s1.concat("Dutta"); // Pramod Dutta
        System.out.println(s1);

    }
}
