public class _1_2 {
    public static void main(String[] args) {
        double dinoMassKg = 50000;
        double dinoMassMg = dinoMassKg*1000000;
        double dinoMassG = dinoMassKg*1000;
        double dinoMassTon = dinoMassKg*0.001;

        System.out.println("Масса динозавра в кг: " + dinoMassKg);
        System.out.println("Масса динозавра в мг: " + dinoMassMg);
        System.out.println("Масса динозавра в г: " + dinoMassG);
        System.out.println("Масса динозавра в т: " + dinoMassTon);
    }
}
