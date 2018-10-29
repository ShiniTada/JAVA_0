public class _2_2_1 {
    public static void main(String[] args) {
        int number = 1284, max;

        max = number % 10;
        number = number / 10;
        while (number > 0) {
            if (number % 10 > max) max = number % 10;
            number = number / 10;
        }
        System.out.println(max);
    }
}
