import java.util.Vector;

public class _3_1 {
    public Vector<Integer> vector = new Vector<Integer>();

    public void addElem(int size) {
        for (int i = 0; i < size; i++){
            vector.add( (int)(Math.random()*100));
        }
    }

    public int maxElem() {
        int max = vector.firstElement();
        for (int elem : vector) {
            if (max < elem) max = elem;
        }
        return max;
    }

    public int minElem() {
        int min = vector.firstElement();
        for (int elem : vector) {
            if (min > elem) min = elem;
        }
        return min;
    }

    public void print(){
        System.out.println(vector);
    }

    public static void main(String[] args){
        _3_1 example = new _3_1();
        example.addElem(10);
        example.print();
        System.out.println("Максимальный - " + example.maxElem());
        System.out.println("Миниальный - " + example.minElem());
    }
}


