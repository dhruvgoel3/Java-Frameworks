 import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Enter a number here");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n%5==0)
        {
            System.out.println("Number is divisible by 5");
        }
        else
        {
            System.out.println("Number is not divisible by 5");
        }

    }
