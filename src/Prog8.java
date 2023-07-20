import java.util.Scanner;

public class Prog8 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        System.out.println(isPrime(num));
    }
    static boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }
        int c=2;
        while (c <= n*0.5){
            if(n%c==0){
                return false;
            }
            c++;
            }
        if(c*c>n){
            return true;
        }
        return false;
    }
}
