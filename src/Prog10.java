import java.util.Scanner;

public class Prog10 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println("Maximum value of element is: "+max(arr));
    }
    static int max(int[] arr){
        System.out.println("Enter 5 array elements: ");
        Scanner inp = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = inp.nextInt();
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
