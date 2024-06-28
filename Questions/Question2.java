package Questions;

import java.util.Arrays;

public class Question2 {

    static int sum(int[] arr){
        int sum=0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }

        return sum;
    }


    public static void main(String[] args){

        int[] arr = {11, 12, 13, 4};

        System.out.println("Array Elements are = "+Arrays.toString(arr));

        int ans = sum(arr);
        System.out.print("Sum of All array elements = "+ ans);
    }
}
