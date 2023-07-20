import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,2,3,4,5); // add as much nos as u want
    }
    static void fun(int ...v){ // array of integers when the limit is unknown
        System.out.println(Arrays.toString(v));
    }
}
