public class Main {
    public static void main(String[] args) {

        int initialBalance = 100; // Начальная сумма на счету клиента
        int topUpAmount = 1100;   // Сумма пополнения

        int bonus = 0;

        if (topUpAmount > 1000) {
            bonus = topUpAmount / 100;
        }

        int finalBalance = initialBalance + topUpAmount + bonus;

        System.out.println("Бонусные рубли: " + bonus);
        System.out.println("Итоговая сумма на счету: " + finalBalance);
    }
}
