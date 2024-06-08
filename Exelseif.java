import java.util.*;

public class Exelseif {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A = ");
        int a = sc.nextInt();

        System.out.print("Enter B = ");
        int b = sc.nextInt();

        if(a == b){
            System.out.println("A is Equal to B");
        } else if (a>b) {
            System.out.println("A is Greater");
        }else {
            System.out.println("A is Smaller");
        }
    }
}
