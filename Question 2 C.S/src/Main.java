import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Enter the age of person ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<18)
        {
            System.out.println("The person is not young");
        }
        else if(n==18)
        {
            System.out.println("celebrating the 18");
        }
        else
        {
            System.out.println("the person is young");
        }
    }
}