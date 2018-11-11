import java.util.*;

public class necklace {

    private static ArrayList<gemstone> gemstoneList = new ArrayList<gemstone>();

    public void addGemstone(int choiceType){
        gemstone gemst = new gemstone(choiceType);
        gemstoneList.add(gemst);
    }



   public static Comparator<gemstone> COMPARE_BY_CARAT = new Comparator<gemstone>() {
        public int compare(gemstone one,gemstone other) {
            return one.getCarat().compareTo(other. getCarat());
        }
    };

    public static Comparator<gemstone> COMPARE_BY_PRICE = new Comparator<gemstone>() {
        public int compare(gemstone one, gemstone other) {
            return one.getPrice().compareTo(other.getPrice());
        }
    };

    public int menu(){
        System.out.println("Какого типа добавить камень: ");
        System.out.println(" 1)Исскуственный \n 2)Янтарь \n 3)Жемчуг \n 0)Конец");
        int choice = 1;
        try {
            boolean right = false;
            while (!right) {
                System.out.print("Выбор > ");
                Scanner scanner = new Scanner(System.in);
                choice = scanner.nextInt();
                if (choice <= 3 && choice >= 0) right = true;
                else System.out.println("Неверно!");
            }
        } catch (Exception e) {
            System.out.println("Введено не числовое значение!");
            System.out.println("Автоматически выбирается 1-ый вариант!");
        }
        return choice;
    }



    public void find(int trans){
       for(int i = 0; i < gemstoneList.size(); i++){
           if((gemstoneList.get(i)).getTransparency() >= trans)   gemstoneList.get(i).print();
       }

    }

    public void printAll(){
        for(int i = 0; i< gemstoneList.size(); i++)gemstoneList.get(i).print();
    }

    public double calculPrice(){
        double price = 0;
        for(int i = 0; i< gemstoneList.size(); i++) price += gemstoneList.get(i).getPrice();
        return price;
    }



    public static void main(String[] args) {
        necklace example = new necklace();
        System.out.println("Создаем ожерелье");
        int choiceType = 1;
        while (choiceType != 0) {
            choiceType = example.menu();
            if (choiceType != 0) example.addGemstone(choiceType);
        }
        System.out.println("Ожерелье");
        example.printAll();
        System.out.println("Количество камней - " + gemstoneList.size());
        System.out.println("Цена ожерелья - " + example.calculPrice() + "\n");


        Collections.sort(gemstoneList, example.COMPARE_BY_CARAT);
        System.out.println("Отсортировано по каратам");
        example.printAll();
        Collections.sort(gemstoneList, example.COMPARE_BY_PRICE);
        System.out.println("Отсортировано по цене");
        example.printAll();




        System.out.println("Поиск по прозрачности");
        System.out.println("Введите минимальную прозрачность");
        Scanner scanner = new Scanner(System.in);
        int trans = scanner.nextInt();
        example.find(trans);
   }
}
