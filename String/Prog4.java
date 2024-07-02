package String;

public class Prog4 {
    public static void main(String[] args){

        String str1 = "hello";
        String str2 = "Everyone";

        System.out.println("1st String is = " + str1);
        System.out.println("2nd String is = " + str2);

        // check strings are equal or not.
        // compareTo() check 3 case.
        // 1. str1 > str 2  : +ve value
        // 2. str 1 == str2 : 0 
        // 3. str1 < str2   : -ve value

        if(str1.compareTo(str2) == 0){
            System.out.print("String are equal");
        }else {
            System.out.print("Strings are not equal");
        }

    }
    
}
