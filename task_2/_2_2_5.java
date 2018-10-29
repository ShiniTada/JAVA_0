public class _2_2_5 {
    public static int HOD( int a, int b )
    {
        return (a % b != 0) ? HOD(b, a % b) : b;
    }

    public static void main(String[] args) {
        int a =  6, b = 5;
        System.out.println( "НОД( " + a + "," + b + ") = " + HOD(a, b));
        System.out.println( "НОK( " + a + "," + b + ") = " + (double)a * b / HOD(a, b));
    }
}
