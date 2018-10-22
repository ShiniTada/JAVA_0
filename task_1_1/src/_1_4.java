public class _1_4 {
    public static void main(String[] args) {
        int num = 9852;
        int a, b, c, d;
        a = num % 10;
        b = num % 100 / 10;
        c = num % 1000 / 100;
        d = num / 1000;
        if(a < b && b <c  && c < d)System.out.println("Последовательность возрастающая!");
        else if(a > b && b > c && c > d)System.out.println("Последовательность убывающая!");
            else  System.out.println("Последовательность не найдена!");
    }
}
