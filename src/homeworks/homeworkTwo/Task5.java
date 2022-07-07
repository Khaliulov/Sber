package homeworks.homeworkTwo;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        /*
        Дома дочери Пети опять нужна помощь с математикой!
        В этот раз ей нужно проверить, имеет ли предложенное квадратное уравнение решение или нет.
        На вход подаются три числа - коэффициенты уравнения a, b, c.
        Нужно вывести "Решение есть", если оно есть и "Решения нет", если нет.
         */
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = (int)Math.pow((double)b, 2.0) - 4 * a * c;
        if (d <= 0) {
            System.out.println("Решения нет");
        } else {
            System.out.println("Решение есть");
        }
    }
}