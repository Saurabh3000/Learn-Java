import java.util.*;

public class ExQue_1For {

    public static void main(String args[]){

        int count = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a no for table = ");
        int n = sc.nextInt();

        for(int i = 1;  i<=10;  i++){

            int table = n * i;
            count = count + 1;

            System.out.println("Table of "+n+" by " +count+ " = " +table);
        }

        sc.close();
    }
}
