import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks here for all three subjects");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        float avg = (float)(m1+m2+m3)/3;

        if(avg>90)
        {
            System.out.println("Excellent");
        }
        else if(avg>80)



    }
}