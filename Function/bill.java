package Function;

import java.util.*;

public class bill {

    static int calculatebill(int r, int q){
        int cal = r * q;
        return cal;
    }

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter Product Name = ");
        String pname = in.next();
        System.out.print("Enter Product Rate = ");
        int prate = in.nextInt();
        System.out.print("Enter Product Quantity = ");
        int pqty = in.nextInt();

        int tbill = calculatebill(prate, pqty);

        System.out.print(pname + " Total Bill is = " + tbill);

        in.close();
    }
    
}
