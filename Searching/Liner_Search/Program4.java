package Searching.Liner_Search;

import java.util.Arrays;

public class Program4 {

    public static void main(String[] args){

        int[] numbers = {22, 15, 18, 19, 3, 54, 78,};

        System.out.println(Arrays.toString(numbers));

        int ans = linerSearch(numbers);

        System.out.println(ans);
    }

    static int linerSearch(int[] numbers){
        int min = numbers[0];
        for(int index = 1; index < numbers.length; index++){
            if(numbers[index] < min){
                min = numbers[index];
            }
        }

        return min;
    }
    
}
