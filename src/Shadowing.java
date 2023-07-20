public class Shadowing {
    static int x = 24;
    public static void main(String[] args) {
        System.out.println("Initial value of x: "+x);
        int x=33;
        System.out.println("Updated value of x: "+x);
        fun();
    }
    static void fun(){
        System.out.println("From function value of x: "+x);
    }
}
