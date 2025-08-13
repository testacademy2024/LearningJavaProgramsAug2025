package ex_12082025;

public class Lab100_SwitchStatementsReturns {
    public static void main(String[] args) {
        // JDK > 13
        char code= 'B';
        int val=switch(code)
        {
            case 'A':
                yield 65;  //returns  new feature introduced for jdk17+
            case 'B':
                yield 66;  //returns new feature introduced for jdk17+

            default:
                throw new IllegalStateException("Unexpected value: " + code);
        };
        System.out.println(val);
    }


}
