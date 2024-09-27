import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost price here : ");
        int cp = sc.nextInt();
        System.out.println("Enter selling price here : ");
        int sp = sc.nextInt();

        if(sp>cp)
        {
            System.out.println("Your Profit is : ");
            System.out.println(sp-cp);
        }
        if(sp<cp)
        {
            System.out.println("Your Loss is : ");
            System.out.println(cp-sp);
        }



    }
}