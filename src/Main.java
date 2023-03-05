public class Main {
    public static void main(String[] args) {
        int score = 130;
        int replenishment = 1500;

        int bonus;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        int balance = score + replenishment + bonus;
        System.out.println("Ваш итоговый счет: " + balance + " руб.");
        System.out.println("Ваш бонус: " + bonus + " Руб.");
    }
}