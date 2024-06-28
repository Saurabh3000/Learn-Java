package Questions;

import java.util.Arrays;

public class Question3 {

    static int[] mul(int[] arr){
        int[] newarr = new int[arr.length]; 
        for(int i = 0; i < arr.length; i++){
             newarr[i] = arr[i]*2;
        }

        return newarr;
    }


    public static void main(String[] args){

        int[] arr = {11, 12, 13, 4};

        System.out.println("Array Elements are = "+Arrays.toString(arr));

          int[] result = mul(arr);
          System.out.print("New array elements are = "+ Arrays.toString(result));
    }
    
}
