package Function;

public class Parameter {
    public static void main(String args[]){
        int ans = sum(10,20);

        System.out.print("Addition is = "+ans);
    }

    static int sum(int a, int b){
        int ans = a + b;
        return ans;
    }
    
}
