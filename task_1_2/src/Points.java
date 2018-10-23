public class Points {                  // using in _1_1
    private int x, y;

    public void SetXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    public double side(Points a, Points b) {
        return Math.sqrt(poww(a.x - b.x) + poww(a.y - b.y));
    }
    public int poww(int c) { return c*c;}
    public boolean triangle(Points a, Points b, Points c) {  // длина каждой стороны треугольника должны
                                                             // быть меньше суммы длин остальных сторон.
        if(side(a, b) + side(a, c) <= side(c, b))
            return false;
        if(side(a, b) + side(c, b) <= side(a, c))
            return false;
        if(side(c, b) + side(c, a) <= side(a, b))
            return false;
        return true;
    }
    public boolean rectangle(Points a, Points b, Points c){
        if(Math.sqrt(side(a, b)*side(a, b) + side(a, c)*side(a, c)) == side(c, b))
            return true;
        if(Math.sqrt(side(a, b)*side(a, b) + side(c, b)*side(c, b)) == side(a, c))
            return true;
        if(Math.sqrt(side(c, b)*side(c, b) + side(c, a)*side(c, a)) == side(a, b))
            return true;
        return false;
    }
}
