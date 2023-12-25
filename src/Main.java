
public class Main {
    public static void main(String[] args) {

        int initCount = 1000;
        //System.out.println("Начальный счёт клиента: " + initCount);

        int sum = 1013;
        //System.out.println("Клиент пополнил счёт на: " + sum + " рублей");

        if (sum >= 1000) {
            int bonus = sum / 100;
            System.out.println("На счёт клиента начислено " + bonus + " бонусных рублей");
            int finalCount = bonus + sum + initCount;
            System.out.println("Счёт клиента после пополнения: " + finalCount + " р.");
        } else {
            System.out.println("На счёт клиента не начисленно бонусов.");
            int finalCount = sum + initCount;
            System.out.println("Счёт клиента после пополнения: " + finalCount + " р.");
        }

    }
}