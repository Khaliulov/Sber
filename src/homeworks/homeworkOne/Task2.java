package homeworks.homeworkOne;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        На вход подается два целых числа – a и b. Вычислите и выведите среднее квадратическое a и b.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число а: ");
        int a = scanner.nextInt();
        System.out.println("Введите число b: ");
        int b = scanner.nextInt();
        double rms = Math.sqrt((Math.pow(a,2)+Math.pow(b,2))/2);
        System.out.println("Cреднее квадратическое чисел a и b = " +rms);
    }
}
