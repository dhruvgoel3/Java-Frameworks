import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number here");
        int n = sc.nextInt();
        if(n%2==0)
        {
            System.out.println("Given number is even");
        }
        else
        {
            System.out.println("Given number is odd");
        }
    }
}