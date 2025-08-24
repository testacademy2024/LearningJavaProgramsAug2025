package ex_22082025;

public class BankAccount {
    String bankName;
    float balance;
    String bankCode;
//DC
    BankAccount()
    {
        bankName="SBI";
        balance=0.00f;
        bankCode="SBIN00001";

    }
    BankAccount(String bName,float bal,String bCode)
    {
        this.bankName=bName;
        this.balance=bal;
        this.bankCode=bCode;

    }
    void printDetails(){
        System.out.println("BankName is : "+bankName);
        System.out.println("BankCode is : "+bankCode);
        System.out.println("Balance is  : "+balance);

    }
}
