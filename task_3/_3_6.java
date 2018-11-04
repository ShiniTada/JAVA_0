import java.util.Vector;

public class _3_6 {
    public Vector<Integer> vector = new Vector<Integer>();

    public void addElem(int size) {
        for (int i = 0; i < size; i++){
            vector.add( (int)(Math.random()*100));
        }
    }

    public void print(){
        System.out.println(vector);
    }

    public void revers(){
        int save;
        for (int i = 0; i < vector.size()/2; i++) {
            save = vector.get(i);
            vector.remove(i);
            vector.add(i, vector.get(vector.size()-i-1));
            vector.remove(vector.size()-i-1);
            vector.add(vector.size()-i, save);
        }
    }

    public static void main(String[] args) {
        _3_6 example = new _3_6();
        example.addElem(10);
        example.print();
        example.revers();
        example.print();
    }
}
