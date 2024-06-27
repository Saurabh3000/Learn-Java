package Searching.Liner_Search;

import java.util.Arrays;

public class Program5 {
    public static void main(String[] args){

        int[] num = {127, 15, 17, 19, 65, 54, 783,};

        System.out.println(Arrays.toString(num));

        int ans = linerSearch(num);

        System.out.println(ans);

    }

    static int linerSearch(int[] num){
    
        for(int index = 0; index < num.length; index++){
    
            if(num[index] % 2 == 0){
    
                return num[index];
            }
        }

        return -1;
    }
}
