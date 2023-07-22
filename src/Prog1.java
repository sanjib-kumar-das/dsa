import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Prog1 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();
        int max = a;
        if(b>max){
            max=b;
        } else if(c>max) {
            max=c;
        } else{
            max=a;
        }
        System.out.println("Largest number is: "+ max);
    }
}
