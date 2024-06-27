package Array;

import java.util.*;

public class ExArrayList {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter a Size of Array = ");
        int size = sc.nextInt();

        System.out.print("Enter a Elements of Array = ");

        for(int i=0; i<size; i++){
            list.add(sc.nextInt());
        }

        System.out.println("Array Elements are: - " + list);
        

        sc.close();
    }    
}
