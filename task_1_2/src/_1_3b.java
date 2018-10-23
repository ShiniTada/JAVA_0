import java.util.*;

class _1_3b
{
    public static void main(String[] args)
    {
        char[] letters = {'а', 'о', 'и', 'е', 'ё', 'э', 'ы', 'у', 'ю', 'я'};
        boolean ok = false;
        char input;
        Scanner scan=new Scanner(System.in);
        input=scan.nextLine().toLowerCase().toCharArray()[0];
        for(char c:letters){
            if(input==c) {
                ok=true;
                break;
            }
        }
        if(ok)  System.out.println("Буква '" + input + "' гласная");
        else    System.out.println("Буква '" + input + "' coгласная");
    }

}
    