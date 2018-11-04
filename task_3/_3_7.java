import java.util.*;

public class _3_7{
    public Vector<Integer> vector = new Vector<Integer>();

    public void addElem(int size) {
        for (int i = 0; i < size; i++){
            vector.add( (int)(Math.random()*100));
        }
    }

    public void print(){
        System.out.println(vector);
    }

    public void swap(int i, int j) {
        int one = vector.get(i);
        int two = vector.get(j);
        if( i != j) {
        vector.remove(i);
        vector.add(i, two);
        vector.remove(j);
        vector.add(j, one);
        }
    }

    public void choice_min_value() {
        int min;
        for (int i = 0; i < vector.size(); i++)
        {
            min = i;
            for (int j = i + 1; j < vector.size(); j++)
            {
                if (vector.get(min) > vector.get(j)) min = j;
            }
            swap(i, min);
        }
    }

    public void bubble() {
        int i, j;
        for (i = 0; i <  vector.size(); ++i) {
            for (j =  vector.size() - 1; j > i; --j)
            {
                if (vector.get(j - 1) > vector.get(j)) swap(j, j - 1);
            }
        }
    }

    public void shaker() {
        int leftMark = 1;
        int rightMark = vector.size() - 1;
        while (leftMark <= rightMark)
        {
            for (int i = rightMark; i >= leftMark; i--)
            {
                if(vector.get(i - 1) >vector.get(i))  swap(i, i - 1);
            }
            leftMark++;

            for (int i = leftMark; i <= rightMark; i++)
            {
                if (vector.get(i - 1) > vector.get(i)) swap(i, i - 1);
            }
            rightMark--;
        }
    }

    public void shell() {
        int  step, i, j, tmp;
        for (step = vector.size() / 2; step > 0; step /= 2){
            for (i = step; i < vector.size(); i++) {
                tmp = vector.get(i);
                for (j = i; j >= step; j -= step) {
                    if(tmp < vector.get(j-step)) swap(j, j - step);
                    else break;
                }
                vector.remove(j);
                vector.add(j, tmp);
            }
        }
    }

    public void quickSort(int left, int right) {
        int i = left, j = right;
        int central =  vector.get((left + right) / 2);
        do {
            while ( vector.get(i) < central) i++;
            while ( vector.get(j) > central) j--;
            if (i <= j) {
                swap(i, j);
                i++;
                j--;
            }
        }
        while (i <= j);
        /*рекурсивно вызываем алгоритм для правого и левого подмассива*/
        if (i < right) quickSort(i, right);
        if (j > left) quickSort(left, j);
    }

    public void clean(){
        vector.removeAllElements();
    }

    public int menu(){
        System.out.println("------------------------------------------------------------");
        System.out.println("\n\n\n**********МЕНЮ**********");
        System.out.println("1)Сортировка методом выбора наименьшего значения");
        System.out.println("2)Сортировка методом пузырька");
        System.out.println("3)Шейкерная сортировка");
        System.out.println("4)Сортировка методом Шелла");
        System.out.println("5)Сортировка методом Хоара");
        System.out.println("0)Выход\n");
        int choice = 1;
        try {
            boolean right = false;
            while (!right) {
                System.out.print("Выбор > ");
                Scanner scanner = new Scanner(System.in);
                choice = scanner.nextInt();
                if (choice <= 5 && choice >= 0) right = true;
                else System.out.println("Неверно!");
            }
        } catch (Exception e) {
            System.out.println("Введено не числовое значение!");
            System.out.println("Автоматически выбирается 1-ый вариант!");
        }
        return choice;
    }

    public static void main(String[] args) {
        while(true) {
            _3_7 example = new _3_7();
            int choice = example.menu();
            if(choice == 0) break;
            else {
                int size = 7;       // можно ввеси в консоли
                example.addElem(size);
                switch (choice) {
                    case 1:
                        System.out.println("Изначальный: "); example.print();
                        example.choice_min_value();
                        System.out.println("Отсортированный: "); example.print();
                        break;
                    case 2:
                        System.out.println("Изначальный: "); example.print();
                        example.bubble();
                        System.out.println("Отсортированный: "); example.print();
                        break;
                    case 3:
                        System.out.println("Изначальный: "); example.print();
                        example.shaker();
                        System.out.println("Отсортированный: "); example.print();
                        break;
                    case 4:
                        System.out.println("Изначальный: "); example.print();
                        example.shell();
                        System.out.println("Отсортированный: "); example.print();
                        break;
                    case 5:
                        System.out.println("Изначальный: "); example.print();
                        example.quickSort(0, size - 1);
                        System.out.println("Отсортированный: "); example.print();
                        break;
                }
                example.clean();
            }
        }
    }
}
