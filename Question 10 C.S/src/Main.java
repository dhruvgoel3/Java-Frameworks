import com.sun.security.jgss.GSSUtil;

import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Enter a alphabet here from A-Z");
        Scanner sc = new Scanner(System.in);
       char alphabet = sc.next().charAt(0);

       if(alphabet == 'a' || alphabet=='e' || alphabet=='i' || alphabet=='0' || alphabet=='u')
        {
            System.out.println("alphabet is vowel");
        }
       else
       {
           System.out.println("Given alphabet is Consonent");
       }



    }



















    -*
}