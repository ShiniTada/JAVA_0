public class _2_2_3 {
    public static boolean Simple ( int N )
    {
        for ( int i = 2; i < N; i ++ ) {
            if (N % i == 0 )return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int N = 127;
        if ( Simple (N) ) System.out.println( "Число " + N + " - простое");
        else System.out.println( "Число " + N + " - составное");
    }
}
