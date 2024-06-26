package Array;

import java.util.*;

public class Fruits {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a No of Fruits = ");
        int size = sc.nextInt();

        String fruits[] = new String[size];

        System.out.print("Enter a Fruits Name = ");
        for(int i=0; i<size; i++){
            fruits[i] = sc.next();
        }

        System.out.println("Name of Fruits You Enter: - ");
        for(int i=0; i<fruits.length; i++){
            System.out.println(fruits[i]);
        }

        sc.close();
    }
    
}
