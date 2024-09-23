import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number here: ");
        double n1 = sc.nextDouble();
        System.out.println("Enter the second number here: ");
        double n2 = sc.nextDouble();

        n1 = n1*1000;
        n1 = n1/1000;
        n2 = n2*1000;
        n2 = n2/1000;

        if(n1 == n2)
        {
            System.out.println("Numbers are equal");
        }
        else {
            System.out.println("both the numbers are not same");
        }

    }
}