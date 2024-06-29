package Questions;

import java.util.*;

public class Question4 {

    static int sum(int n1, int n2){

        int add = n1 + n2;

        return add;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First No = ");
        int num1 = sc.nextInt();

        System.out.print("Enter a Second No = ");
        int num2 = sc.nextInt();

        
        System.out.print("Sum of two No is = " + sum(num1, num2));
        sc.close();
    }    
}
