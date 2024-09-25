import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the year here: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year%400==0)
        {
            System.out.println("This is a leap Year");
        }
        else {
            System.out.println("THis is not a leap year");
        }

    }
}