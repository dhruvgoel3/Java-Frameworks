import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter any integer: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0)
        {
            n=n*(-1);
        }
        System.out.println("The absolute value is : "+n);


    }
}