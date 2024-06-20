import java.util.*;

public class Exinput{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String name = sc.next();  //next() fun accept only one word. To accept string sentences use nextln().

        System.out.println(name);

        sc.close();
        
    }
}