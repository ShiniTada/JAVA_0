public class _1_7 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        System.out.println("a = " + a + "  b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + "  b = " + b);
    }
}
