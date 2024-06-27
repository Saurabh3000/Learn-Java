package Searching.Liner_Search;

public class Program3 {
    public static void main(String[] args){

        int[] numbers = {12, 15, 18, 19, 65, 54, 78,};
        int se = 19;
        int start = 1;
        int end = 5;

        int ans = linerSearch(numbers, se, start, end);
        System.out.print(ans);
    }
    
    static int linerSearch(int[] numbers,int se, int start, int end){
        for(int index = start; index < end; index++){
            int element = numbers[index];
            if(element == se){
                return 0;
            }
        }

        return -1;
    }
}
