package homeworks.homeworkTwo;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        За каждый год работы Петя получает на ревью оценку.
        На вход подаются оценки Пети за последние три года (три целых положительных числа).
        Если последовательность оценок строго монотонно убывает, то вывести "Петя, пора трудиться".
        В остальных случаях вывести "Петя молодец!"
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Введите оценки Пети за последние три года:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a > b && b > c) {
            System.out.println("Петя, пора трудиться");
        } else {
            System.out.println("Петя молодец!");
        }
    }
}