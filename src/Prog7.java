import java.util.Scanner;

public class Prog7 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = inp.nextInt();
        System.out.println("Enter second number: ");
        int num2 = inp.nextInt();
        System.out.println("AFTER SWAPPING:- ");
        swap(num1,num2);
    }

    static void swap(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("First number: "+a);
        System.out.println("Second number: "+b);
    }
}
