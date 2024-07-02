package String;

import java.util.*;

public class Prog1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st String = ");
        String str1 = sc.nextLine();

        System.out.print("Enter 2nd String  = ");
        String str2 = sc.nextLine();

        String str3 = str1 + " " + str2;
        System.out.print("Full String is = " + str3);

        sc.close();
    }    
}
