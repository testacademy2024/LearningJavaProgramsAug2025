package ex_09082025;

public class Lab059_TypeCasting {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45F;
        //int total_price = course+GST;// Implicti Narrowing - JVM
        float total_price = course+GST; // destination datatype should be bigger, which will reduce data loss

        System.out.println(total_price);
    }
}
