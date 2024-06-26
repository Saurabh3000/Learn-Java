//To dsiplay Array elements we use two methods.

package Array;

public class DiaplayWay {
    public static void main(String[] args){

        int[] numbers = {11, 12, 14, 15, 18};

        //1st method
        System.out.println("Array Elements are: - ");
        for(int i = 0; i<numbers.length; i++){
            System.out.print(numbers[i] +" ");
        }


        //2nd method
        System.out.println("Array Elements are: - ");
        for(int display : numbers){
            
            System.out.print(display + " ");
        }
    }
    
}
