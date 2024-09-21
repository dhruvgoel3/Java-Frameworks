import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number here");
        float n = sc.nextFloat();

        if(n<0 && n<1){
            System.out.println("Given number is negative and small");
        }
        else if(n>0){
            System.out.println("Given number is positive");
        }
        else if(n>1000000){
                System.out.println("number is large");
        }
        else
        {
            System.out.println("number is zero");
        }





    }
}