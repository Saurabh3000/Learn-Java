package Array;

import java.util.*;

public class ExOperationAL {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Size of Array = ");
        int size = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<size; i++){
            list.add(sc.nextInt());
        }
        System.out.println("Elements of Array is = "+ list);


        // To add elements in the array use add() method. New elements are added in the last position of array.
        list.add(16);
        System.out.println(" Here 16 is added in array elements = "+list);

        // To add elements in between positions.
        list.add(1, 10);
        System.out.println("Here 10 element is added in 1 position = "+list);

        // To set element in the index position.
        list.set(0, 9);
        System.out.println("Here 9 element is set on 0 position = "+list);

        // To delete element on specific index position.
        list.remove(1);
        System.out.print("Here delete the 1 postion element = "+list);


        sc.close();
    }    
}
