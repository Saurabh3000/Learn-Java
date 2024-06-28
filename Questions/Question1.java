package Questions;

import java.util.*;

public class Question1 {

    static boolean display(int n){

        if( n % 2 == 0){
            return true;
        }
        
        return false;

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a No = ");
        int n = sc.nextInt();

        System.out.print(display(n));

        sc.close();
    }


}
