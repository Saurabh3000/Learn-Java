package Searching.Liner_Search;

import java.util.*;

public class Program7 {

    static int findeven(int[] num){
        int count = 0; 
            for(int i = 0; i < num.length; i++){
                if(num[i] % 2 == 0) {
                    count++;
                }
            }
        return count;
    }

    public static void main(String[] args){

        int[] num = {11, 152, 17, 19, 65, 54, 783,};
        
        System.out.println("Array elements are = " + Arrays.toString(num));

        System.out.println("Even elements in array are = " + findeven(num));
        

    }
    
}
