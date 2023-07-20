public class Overloading {
    public static void main(String[] args) {
        fun(3);
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String x){
        System.out.println(x);
    }
}
