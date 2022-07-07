package homeworks.homeworkOne;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*
        На вход подается количество секунд, прошедших с начала текущего дня – count.
        Выведите в консоль текущее время в формате: часы и минуты.
         */
        Scanner scanner = new Scanner(System.in);
        final int HOUR_CONST = 60;
        final int MINUTE_CONST = 60;
        final int SECOND_CONST = 60;
        System.out.println("Введите количество секунд с начала текущего дня:");
        int count = scanner.nextInt();
        double hour = count/MINUTE_CONST/HOUR_CONST;
        double minute = count/HOUR_CONST % SECOND_CONST;
        System.out.println("Текущее время " + (int)hour + ":" + (int)minute);
    }
}