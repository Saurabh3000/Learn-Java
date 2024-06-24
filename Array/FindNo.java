//Find element in array and return index of that element. 

package Array;

import java.util.*;

public class FindNo {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Size of Array = ");
        int size = sc.nextInt();

        int numbers[] = new int[size]; //define array size

        //for input
        System.out.print("Enter a Array Elements = ");
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter a Find Element = ");
        int num = sc.nextInt();

        //find element and return index
        for(int i=0; i<numbers.length; i++){   //.length is same as size of array.
            if(numbers[i] == num){
                System.out.print("Index of the element is = "+i);
            }
        }

        sc.close();
    }
}
