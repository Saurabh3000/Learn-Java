package Function;

import java.util.*;

public class Return {

    public static void main(String args[]){

        int result = sum();

        System.out.println("Addition of Two No is = "+result);


    }

    static int sum(){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a 1st No = ");
        int num1 = in.nextInt();

        System.out.print("Enter a 2nd No = ");
        int num2 = in.nextInt();

        int add = num1 + num2;
        
        in.close();
        return add;
        
    }

    
}
