import java.util.*;

class _1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите день: ");
        int day = scanner.nextInt();
        System.out.print("Введите месяц: ");
        int month = scanner.nextInt();
        System.out.print("Введите год: ");
        int year = scanner.nextInt();
        System.out.println("Введенная дата: " + day + "." + month + "." + year);
        int max = 0;
        boolean valid = true;
        switch (month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: max = 31; break;

            case 4:
            case 6:
            case 9:
            case 11: max = 30; break;

            case 2:
                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) max = 29;
                else  max = 28;
                break;
            default: System.out.println("Несуществующая дата");
                valid = false;
                break;
        }
        if(valid) {
            if (day == max && month == 12) {
                year++;
                day = 1;
                month = 1;
            }
            else if (day == max ) {
                day = 1;
                month++;
                }
                else day++;

            System.out.println("Следующий дата: " + day + "." + month + "." + year);
        }
    }
}