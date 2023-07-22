import java.util.Scanner;

public class Prog9 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        int ans = isArm(num);
        if(ans == num){
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an armstrong number");
        }
    }
    static int isArm(int n){
        int count=0, sum=0;
        int temp=n;
        while(temp>0){
            temp=temp/10;
            count++;
        }
        while(n>0){
            int rem = n%10;
            sum = (int) (sum + Math.pow(rem,count));
            n=n/10;
        }
        return sum;
    }
}
