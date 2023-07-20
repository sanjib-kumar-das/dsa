import java.util.Scanner;

public class Prog3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter how many numbers you want: ");
        int n = inp.nextInt();

        int n1=0,n2=1,n3,i;
        System.out.print(n1+" "+n2);

        for(i=2;i<n;++i)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
