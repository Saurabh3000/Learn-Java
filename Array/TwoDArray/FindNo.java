package Array.TwoDArray;

import java.util.*;

public class FindNo {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a No of rows = ");  //no of rows
        int row = sc.nextInt();

        System.out.print("Enter a No of columns = "); //no of columns
        int col = sc.nextInt();

        int[][] arr = new int[row][col];     //decalre a array

        //input of array elements
        for(int r=0; r<row; r++){
            for(int c=0; c<col; c++){
                arr[r][c] = sc.nextInt();
            }
        }

        //display aaray elements
        System.out.println("2D Array Elements are");

        for(int r=0; r<row; r++){
            for(int c=0; c<col; c++){
                System.out.print(arr[r][c] +" ");
            }
            System.out.println("");
        }

        //getting element to find
        System.out.println("Enter a element which you want to find = ");
        int fnum = sc.nextInt();

        //display the location of that element
        for(int r=0; r<row; r++){
            for(int c=0; c<col; c++){
                if(arr[r][c] == fnum){
                    System.out.print("Row is"+ r + " and column is"+ c);
                }
            }
            
        }
        sc.close();
    } 
    
}
