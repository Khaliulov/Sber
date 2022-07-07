package homeworks.homeworkOne;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        Вычислите и выведите объем шара, прочитав его радиус r с консоли.
         */
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14;
        System.out.println("Введите радиус шара:");
        double r = scanner.nextDouble();
        double v = (4.0*PI*Math.pow(r, 3))/3;
        System.out.println("Объем шара = "+v);
    }
}