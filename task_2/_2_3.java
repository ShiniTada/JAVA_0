public class task_2_3 {
    public static void main(String[] args) {
        int num= 4443;
        if(num > 0) {
            if (isPerfectNumber(num)) System.out.println(num + " - совершенное");
            else System.out.println(num + " - не совершенное");
        }
        else  System.out.println(num + " - не натуральное");
    }

    public static boolean isPerfectNumber(int num){
        int delitel = 0;
        for( int i = 1; i < num; i++){
            if( num % i == 0) delitel += i;
        }
        if( delitel == num) return true;
        else return false;
    }
}
