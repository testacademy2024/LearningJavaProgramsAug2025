package ex_09082025;

public class Lab058_TypeCasting {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45F;
        //int total_price = course+GST;// Implicti Narrowing - JVM
        int total_price = course+(int)GST; // Explit narrowing - REAL time - money loss

        System.out.println(total_price);
    }
}
