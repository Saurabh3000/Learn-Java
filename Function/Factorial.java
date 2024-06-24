package Function;

import java.util.*;

public class Factorial {

    static void fact(int a){

        int factorial = 1;

        if(a <0  ){
            System.out.print("Invalid Number");
        }

        for(int i=a; i>=1; i--){
            factorial = factorial *i;
        }

        System.out.print("Factorial of give number is = " + factorial);
        
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number = ");
        int n = sc.nextInt();

        fact(n);

        sc.close();

    }
    
}
