package memory;

public class Test {

    public static void main(String[] args) {
        Integer a = 1111;
        Integer b = a;
        b = 2222;

        System.out.println(a);
        System.out.println(b);
    }
}
