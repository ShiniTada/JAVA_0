import java.util.*;

class _1_3a
{
    public static void main(String[] args) {
        char input;
        Scanner scan=new Scanner(System.in);
        input=scan.nextLine().toLowerCase().toCharArray()[0];
        switch (input){
            case 'а':
            case 'о':
            case 'и':
            case 'е':
            case 'э':
            case 'ы':
            case 'у':
            case 'ю':
            case 'я':
            case 'ё':
                System.out.println("Буква '" + input + "' гласная");
                break;
            default:
                System.out.println("Буква '" + input + "' coгласная");
        }

    }
}

