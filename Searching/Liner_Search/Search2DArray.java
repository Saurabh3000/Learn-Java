package Searching.Liner_Search;

import java.util.*;

public class Search2DArray {

    static int Search(int[][] arr, int se){

        for(int row = 0; row < 2; row++){
            for(int col = 0; col < 3; col++){
                if(arr[row][col] == se){
                    return 0;
                }
            }
        }

        return -1;
    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[][] arr = {
                    {11, 12, 13},
                    {14, 15, 16}
        };
        
        for(int row = 0; row < 2; row++){
            for(int col = 0; col < 3; col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println("");
        }
        
        System.out.println("Enter a Search Element = ");
        int se = sc.nextInt();

        sc.close();
        
        int ans = Search(arr, se);
        System.out.print(ans);
    }
    
}
