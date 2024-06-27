package Searching.Liner_Search;
import java.util.*;

public class Program2 {
    public static void main(String[] args){

        String[] fruits = {"Apple", "Mango", "Orange", "Pinnapple", "Strawberry"};

        Scanner sc = new Scanner(System.in);
        String sfruit = sc.next();

        linerSearch(fruits, sfruit);
        sc.close();
    }
    
    static void linerSearch(String[] fruits, String sfn){
        
        for(int index = 0; index < fruits.length; index++){
        
            String element = fruits[index];
        
            if (element.equals(sfn)) {
        
                System.out.print("Fruit is Present");
            }
        }

    }
}
