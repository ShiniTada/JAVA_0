public class _1_1 {
    public static void main(String[] args){
        Points a = new Points();
        Points b = new Points();
        Points c = new Points();
        a.SetXY(1,1);
        b.SetXY(4, 1);
        c.SetXY(1,5);
        if(a.triangle(a, b, c)) {
            if (a.rectangle(a, b, c)) System.out.println("Прямоугольник");
            else System.out.println("Треугольник");
        }
        else System.out.println("Непонятная фигура");

    }
}