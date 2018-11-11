import java.util.*;

public class gemstone  {
    private String type;
    private Double carat;
    private Double price;
    private int transparency;

    public gemstone(){}

    public gemstone(int choiceType){
        switch(choiceType){
            case 1:
                this.type =  "Исскуственный";
                this.carat = 0.;
                this.price = 2.7;
                this.transparency = 50;
                break;
            case 2:
                this.type =  "Янтарь";
                this.carat = 0.05;
                this.price = 50.;
                this.transparency = 20;
                break;
            case 3:
                this.type =  "Жемчуг";
                this.carat = 0.25;
                this.price = 3000.;
                this.transparency = 1;
                break;
        }
    }

    public String getType(){
        return type;
    }
    public Double getCarat() {
        return carat;
    }

    public Double getPrice() {
        return price;
    }

    public int getTransparency() {
        return transparency;
    }
    public void print() {
        System.out.print("Камень: ");
        System.out.println("тип - " + type + ", карат - " + carat + ", цена - " + price + ", прозрачность - " + transparency);
    }

}
