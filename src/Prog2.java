import java.util.Scanner;

public class Prog2 {
    public static void main(String[] args) {
        System.out.println("Enter a character: ");
        Scanner inp = new Scanner(System.in);
        char myChar = inp.next().trim().charAt(0);
        System.out.println(myChar);

        if(myChar>='a' && myChar<='z'){
            System.out.println("It's a lowercase letter");
        } else{
            System.out.println("It's a uppercase letter");
        }
    }
}
