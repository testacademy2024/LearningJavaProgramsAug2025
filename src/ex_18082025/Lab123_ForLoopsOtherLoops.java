package ex_18082025;

public class Lab123_ForLoopsOtherLoops {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) { // i = 0 to 50, times  = 51
            if (i % 2 == 0) {
                System.out.println("Even -> " + i);
                continue; //skipping the code
            }
            System.out.println("Odd -> "+ i);
        }
    }
}
