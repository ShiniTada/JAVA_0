public class _1_5 {
    public static void main(String[] args) {
        int num = 128563, i = 0, n;
        int [] mas = new int [10];
        double arifm = 0, geom = 1;
        while(num != 0) {
            n = num %10;
            mas[i] = n;
            i++;
            num /= 10;
        }
        i--;
        for ( ; i >= 0 ; i--) {
            arifm += mas[i];
            geom *= mas[i];
        }
        arifm /= 6.;
        geom /= 6.;
        System.out.println("Среднеее арифметическое: " + arifm);
        System.out.println("Среднее геометрическое: " + geom);

    }
}
