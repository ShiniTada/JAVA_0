public class _1_6 {
    public static void main(String[] args) {
        int num =1234567;
        int rev, i = 0;
        int[] mas = new int[10];
        while(num != 0) {
            rev = num %10;
            mas[i] = rev;
            i++;
            num /= 10;
        }
       for(int j = 0; j < i; j++) {
        System.out.print(mas[j]);
       }
    }
}
