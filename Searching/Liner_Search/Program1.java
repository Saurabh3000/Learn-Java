package Searching.Liner_Search;

import java.util.Arrays;

public class Program1 {
    public static void main(String[] args){
        
        int[] num = {10, 14, -3, 15, 78, 98, 2, 67};
        System.out.println(Arrays.toString(num));
        int se = 155;

        int result = linerSearch(num, se);
        System.out.print(result);
    }

    static int linerSearch(int[] num, int se){
        if(num.length == 0){
            return -1;
        }

        for(int index = 0; index<num.length; index++){
            int element = num[index];
            if(element == se){
                return index;
            }
        }

        return -1;
    }

}
