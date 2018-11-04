import java.util.*;

public class _3_5 {
    private int key;
    public Vector<Integer> vector = new Vector<Integer>();

    public void addElem(int size) {
        for (int i = 0; i < size; i++){
            vector.add( (int)(Math.random()*10));
        }
    }

    public void setKey(int key){
        this.key = key;
    }

    public int linearSearch() {
        for (int i = 0; i < vector.size(); i++) {
            if (vector.get(i) == key) return i;
        }
        return -1;
    }

    public void sort(){
        Collections.sort(vector);
    }

    public int  binarySearch(){
        int low, high, middle;
        low = 0;
        high = vector.size() - 1;
        while (low <= high)
        {
            middle = (low + high) / 2;
            if (key < vector.get(middle)) high = middle - 1;
            else if (key > vector.get(middle)) low = middle + 1;
                else return middle;
        }
        return -1;
    }

    public void print(){
        System.out.println(vector);
    }

    public static void main(String[] args) {
        _3_5 example = new _3_5();
        example.addElem(8);
        int key = (int)(Math.random()*10); //можно ввести это с клавиатуры
        example.setKey(key);
        example.print();
        int find;
        if ((find = example.linearSearch()) != -1) System.out.println("Элемент " + key + " под " + find + " номером");
        else System.out.println("Элемент " + key + " не найден");

        example.sort();
        example.print();
        if ((find = example.binarySearch()) != -1) System.out.println("Элемент " + key + " под " + find + " номером");
        else System.out.println("Элемент " + key + " не найден");
    }

}
