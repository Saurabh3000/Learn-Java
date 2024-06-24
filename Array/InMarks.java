package Array;

import java.util.*;

public class InMarks {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Size of Array = ");
        int size = sc.nextInt();

        int marks[] = new int [size];

        //this loop is used for input
        for(int i=0; i<size; i++){
            System.out.println("Enter a Element of Array = ");
            marks[i] = sc.nextInt();
        }
        
        //this loop is used for output
        for(int i=0; i<size; i++){
            System.out.println(marks[i]);
        }

        sc.close();

    }
}
