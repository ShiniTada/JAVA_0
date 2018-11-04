import java.util.Vector;

public class _3_3 {
    public Vector<Integer> vector = new Vector<Integer>();

    public void addElem(int size) {
        for (int i = 0; i < size; i++){
            vector.add( (int)(Math.random()*100));
        }
    }

    public boolean isSortAscending() {
        for (int i = 0; i < vector.size() - 1; ) {
            if (vector.get(i) > vector.get(++i)) return false;
        }
        return true;
    }

    public boolean isSortDescending() {
        for (int i = 0; i < vector.size() - 1; ) {
            if (vector.get(i) < vector.get(++i)) return false;
        }
        return true;
    }

    public void print(){
        System.out.println(vector);
    }

    public static void main(String[] args) {
        _3_3 example = new _3_3();
        example.addElem(7);
        example.print();
        if (example.isSortAscending() || example.isSortDescending()) System.out.println("Отсортирован ");
        else System.out.println("Не отсортирован ");
    }
}