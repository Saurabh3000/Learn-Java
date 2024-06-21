package Function;

import java.util.*;

public class Sum {

    public static void main(String args[]){

            sum();        
    }

    static void sum(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number 1 = ");
        int num1 = sc.nextInt();

        System.out.print("Enter Number 2 = ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum of Two Digit are  = " + sum);

        sc.close();

    }
    
}
