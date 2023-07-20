import java.util.Scanner;

public class Prog4 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner inp = new Scanner(System.in);
        int number = inp.nextInt();
        int count=0;

       while(number > 0){
           int rem = number%10;
           if(rem==7){
               count++;
           }
           number=number/10;
       }
        System.out.println("Number 7 occurred: "+count+" times.");
    }
}
