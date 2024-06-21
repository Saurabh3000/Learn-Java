import java.util.*;

public class Exsw_1 {

    public static void main(String args[]){

        System.out.print("Enter Friut Name = ");
        Scanner sc = new Scanner(System.in);
        String friut = sc.next();

        switch(friut){
            case "Mango":System.out.println("The King of Fruits");
            break;

            case "Apple": System.out.println("The Red Sweet Fruit");
            break;

            default: System.out.println("Invalid Inpute");
        }

        sc.close();

    }

    
}
