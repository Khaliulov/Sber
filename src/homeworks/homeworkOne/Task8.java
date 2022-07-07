package homeworks.homeworkOne;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        /*
        На вход подается баланс счета в банке – n.
        Рассчитайте дневной бюджет на 30 дней.
         */
        Scanner scanner = new Scanner(System.in);
        final double DAYS = 30.0;
        System.out.println("Введите баланс счета в банке:");
        int n = scanner.nextInt();
        double n2 = n/DAYS;
        System.out.println("Дневной бюджет = " + n2);

    }
}
