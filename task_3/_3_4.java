import java.util.Vector;

public class _3_4 {
    public Vector<Integer> vector = new Vector<Integer>();

    public void addElem(int size) {
        for (int i = 0; i < size; i++){
            vector.add( (int)(Math.random()*100));
        }
    }

    public int localMin() {
        for (int i = 0; i < vector.size() - 2; ) {
            if (vector.get(i) > vector.get(++i) && vector.get(i) < vector.get(++i)) return vector.get(--i);
        }
        return -1;
    }

    public void print(){
        System.out.println(vector);
    }

    public static void main(String[] args) {
    _3_4 example = new _3_4();
        example.addElem(10);
        example.print();
        int min;
        if ( (min = example.localMin()) != -1) System.out.println("Локальный минимум - " + min);
        else System.out.println("Локальный минимум не найден");
    }
}
