
public class Main {
    public static void main(String[] args) {

        int init_count= 1000;
        //System.out.println("Начальный счёт клиента: " + init_count);

        int sum = 1013;
        //System.out.println("Клиент пополнил счёт на: " + sum + " рублей");

        if (sum >= 1000) {
            int bonus = sum / 100;
            System.out.println("На счёт клиента начислено " + bonus + " бонусных рублей");
            int final_count = bonus + sum + init_count;
            System.out.println("Счёт клиента после пополнения: " + final_count + " р.");
        }
        else {
            System.out.println("На счёт клиента не начисленно бонусов.");
            int final_count = sum + init_count;
            System.out.println("Счёт клиента после пополнения: " + final_count + " р.");
        }

    }
}