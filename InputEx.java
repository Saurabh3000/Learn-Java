import java.util.*;

class InputEx {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Full Name: ");
            String fname = sc.nextLine();
            System.out.println(fname);
        }
    }

    
}
