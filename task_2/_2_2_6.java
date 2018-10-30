import java.util.*;

public class task_2_2_6 {
    public static void main(String[] args) {
        boolean isNewNumber;
        int[] mas = new int[10];
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i = 0, n;
        while(num != 0) {
            n = num % 10;
            isNewNumber = true;
            for(int j = 0; j<=i; j++) {
                if (mas[j] == n) isNewNumber = false;
            }
            if(isNewNumber) {
                mas[i] = n;
                i++;
            }
            num /= 10;
        }
        i--;
        for ( ; i >= 0 ; i--) {
            System.out.println(mas[i]);
        }
    }
}
