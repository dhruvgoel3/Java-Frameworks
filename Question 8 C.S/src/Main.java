import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Write a number between 1-7 here to see the name");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch(day)
        {
            case 1 :
                System.out.println("monday");
                break;
            case 2 :
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default :
                System.out.println("Invalid day");


        }
    }
}