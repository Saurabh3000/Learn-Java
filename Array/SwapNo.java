package Array;

import java.util.Arrays;

public class SwapNo {
    public static void main(String[] args){
        int[] arr = {1, 8, 12, 17};

        swap(arr, 1, 3);    // 1 and 3 are the index position.

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2){   // index1 and index2 are used to store the value of index 1 & 3 position.
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    
}
