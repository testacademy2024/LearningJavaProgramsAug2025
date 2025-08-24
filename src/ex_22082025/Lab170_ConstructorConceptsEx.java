package ex_22082025;

public class Lab170_ConstructorConceptsEx {
    public static void main(String[] args) {
        BankAccount ba=new BankAccount();
        System.out.println(ba.bankName);
        System.out.println(ba.balance);
        System.out.println(ba.bankCode);
        System.out.println("-------------------");
        BankAccount ba1=new BankAccount("ICICI",35.90f,"ICIC0001");

        System.out.println(ba1.bankName);
        System.out.println(ba1.balance);
        System.out.println(ba1.bankCode);

    }
}
