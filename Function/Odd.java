package Function;

import java.util.*;

public class Odd {

    static void findodd(int s, int l){

        for(int i=s; i<=l; i++){

            if(i%2==1){
                System.out.println(i);
            }
    }

}

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Starting No = ");
        int st = sc.nextInt();

        System.out.print("Enter Last No = ");
        int ls = sc.nextInt();

        findodd(st, ls);
        sc.close();
    }
    
}
