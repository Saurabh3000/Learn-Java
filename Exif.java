import java.util.*;

public class Exif{

    public static void main(String args[]){

        System.out.print("Enter User Age = ");

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("User are eligible for Voting");
        }
        else{
            System.out.println("User are not eligible for Voting");
        }

    }
}

