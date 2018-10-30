public class _2_2_4 {
    public static boolean Simple ( int N )
    {
        for ( int i = 2; i < N; i ++ ) {
            if (N % i == 0 )return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 666;
        for (int i = 1; i <= n; i++) {
            if ((n % i == 0) && Simple(i)) System.out.println( "Делитель " + i + " - простой");
        }
    }
}
