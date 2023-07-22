import java.sql.SQLOutput;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[][] arr = new int[3][3]; // column size initialization is not mandatory
        System.out.println("Size of array: "+arr.length);
        System.out.println("Enter array elements(3*3): ");
//TAKING INPUT
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = inp.nextInt();
            }
        }
//GIVING OUTPUT
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
//ANOTHER WAY OF PRINTING
        for (int row = 0; row < arr.length; row++) {
            System.out.println(java.util.Arrays.toString(arr[row]));
        }
    }
}
