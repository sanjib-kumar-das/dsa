import java.util.Scanner;

public class Prog6 {
    public static void main(String[] args) {
        System.out.println("Enter a day number: ");
        Scanner inp = new Scanner(System.in);
        int day = inp.nextInt();

        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day!");
        }
    }
}
