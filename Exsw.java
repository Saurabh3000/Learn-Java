import java.util.*;

public class Exsw {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Button");
        int button = sc.nextInt();

        switch(button){
            case 1 : System.out.println("Tv is ON");
                    break;
            case 2 : System.out.println("Fan is ON");
                    break;
            case 3 : System.out.println("AC is ON");
                    break;
            default: System.out.println("Invalid Button is pressed");
        }

        sc.close();
    }
}
