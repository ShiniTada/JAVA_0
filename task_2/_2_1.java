public class _2_1 {
    public static int countHeads(int h){
        int a=0, heads=0;
        for(int i=0; i<h; i++){
            a=(int)(Math.random()*2);
            if(a==0){
                heads++;
            }
        }
        return heads;
    }

    public static void main(String[] args) {
        int count = 768;
        int heads=countHeads(count);
        System.out.println("Орёл выпал: " + heads
                + " раз, решка: " + (count-heads));
    }

}
