package ex_12082025;

public class Lab098_SwitchStatements {
    public static void main(String[] args) {
        // JDK > 13
        int itemCode = 001;
        switch (itemCode)  ///break is not necessary for arrow mark used
        {
            case 001 ->System.out.println("It's a laptop!");
            case 002 ->System.out.println("It's a desktop!");
            case 003, 004 -> System.out.println("It's a mobile phone!");
            default -> System.out.println("Heloo!");
        }
    }
}
