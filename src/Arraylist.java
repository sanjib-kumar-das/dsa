import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        ArrayList<Integer> myList = new ArrayList<>(10);

        list.add(10);
        list.add(20);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list);
        list.set(2,45);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);

        System.out.println("Enter array items: ");
        Scanner inp = new Scanner(System.in);
//TAKING USER INPUT
        for (int i = 0; i < 5; i++) {
            myList.add(inp.nextInt());
        }
//SHOWING OUTPUT
        for (int i = 0; i < 5; i++) {
            System.out.print(myList.get(i)+ " ");
        }
    }
}
