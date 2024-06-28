package Array;

import java.util.*;

public class ReversDisplay {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size Array = ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // input array elements
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        //display array elements reverse
        System.out.println("Array Elements are: - ");
        for(int i = arr.length-1; i >=0; i--){
            System.out.println(arr[i]);
        }
        sc.close();
    }    
}
