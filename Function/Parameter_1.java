package Function;

import java.util.*;

public class Parameter_1 {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Name = ");
        String name = in.next();

        String display = message(name);
        System.out.print(display);
        in.close();
    }

    static String message(String a){
        String msg = "Hello " + a;
        return msg;
    } 
    
}
