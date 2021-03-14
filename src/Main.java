public class Main {
    public static void main(String[] args) {
        long score = 100;
        long payment = 1200;
        boolean bonus = payment > 1000;

        if (Bonus) {
            long bonus = payment / 100;
            long total = score + payment + bonus;
            System.out.println("Бонус: " + bonus + " Итоговая сумма на счету клиента: " + total);

        } else {
            long total = score + payment;
            System.out.println("Бонус: 0" + " Итоговая сумма на счету клиента: " + total);
        }
    }
}
