import java.util.*;

public class _1_2 {
    public static void main(String[] args) {
        int age = 0, head = 3, eyes;
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(; age < N; age++) {
            if (age >=300) head +=1;
            else if(age >=200) head +=2;
                else head +=3;
        }
        eyes = head*2;
        System.out.println("В " + N + " лет у дракона будет " + head + " голов и " + eyes + " глаз.");
    }
}
