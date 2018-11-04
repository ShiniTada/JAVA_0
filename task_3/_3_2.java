import java.util.Vector;

public class _3_2 {
    public Vector<Integer> vector = new Vector<Integer>();

    public void addElem(int size) {
        for (int i = 0; i < size; i++){
            vector.add( (int)(Math.random()*100));
        }
    }

    public double arifm() {
        double ari = 0.;
        for (int elem : vector) ari += elem;
        ari /= vector.size();
        return ari;
    }

    public double geom() {
        double geo = 1.;
        for (int elem : vector) geo *=  elem;
        geo /= vector.size();
        return geo;
    }

    public void print(){
        System.out.println(vector);
    }

    public static void main(String[] args) {
        _3_2 example = new _3_2();
        example.addElem(15);
        example.print();
        System.out.println("Ср. ариметическое - " + example.arifm());
        System.out.println("Ср. геометрическое - " + example.geom());

    }
}
