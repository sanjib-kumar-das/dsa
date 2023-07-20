import java.util.Scanner;

public class Prog5 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner inp = new Scanner(System.in);
        int number = inp.nextInt();
        int ans=0;
        while(number > 0) {
            int rem = number % 10;
            number = number / 10;
            ans = ans*10+rem;
        }
        System.out.println("Reversed number: "+ans);
    }
}
