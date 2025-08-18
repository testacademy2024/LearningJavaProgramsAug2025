package ex_18082025;

public class Lab121_ForLoopsOtherLoops {
    public static void main(String[] args) {
        for(int i=0;i<=50;i++)
        {
            if(i%2==0)
            {
                System.out.println("the number is a even number "+i);
            } else if (i%3==0) {
                System.out.println("the number is a odd number "+i);

            }
            else {
                System.out.println("the number is neither even nor odd "+i);
            }
        }
    }
}
