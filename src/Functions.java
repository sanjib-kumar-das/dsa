import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        System.out.println("Result is: "+sum());
    }
    static int sum(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int n1 = inp.nextInt();
        int n2 = inp.nextInt();
        return(n1+n2);
    }
}
