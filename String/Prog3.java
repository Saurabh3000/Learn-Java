package String;

public class Prog3 {
    public static void main(String[] args){

        String str1 = "HelloEveryone";

        System.out.println("String is = "+ str1);

        System.out.println("Length of String is = "+ str1.length());

        //print characters of string.

        for(int  i = 0; i < str1.length(); i++){
            System.out.println(str1.charAt(i));
        }
    }
    
}
