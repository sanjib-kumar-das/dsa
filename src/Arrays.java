import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        System.out.println("Enter 5 numbers: ");
        Scanner inp = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = inp.nextInt();
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println(java.util.Arrays.toString(arr));

    }
}
