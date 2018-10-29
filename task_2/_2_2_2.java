public class _2_2_2 {
    public static void main(String[] args) {
        int pal = 34543, reverse = 0, temp;
        temp = pal;

        while (temp != 0) {
            reverse *= 10;
            reverse += temp % 10;
            temp = temp / 10;
        }

        if (pal == reverse) System.out.println(pal + " is a palindrome number.");
        else System.out.println(pal + " is not a palindrome number.");
    }
}
