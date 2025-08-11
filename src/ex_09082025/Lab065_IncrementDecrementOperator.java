package ex_09082025;

public class Lab065_IncrementDecrementOperator {
    public static void main(String[] args) {
        int a=10;
        System.out.println(++a + a++ + a++);  //  ++a=11 a=11 + a++=11 a=12 + a++=12 a=13  11+11+12
    }
}
