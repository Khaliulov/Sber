package homeworks.homeworkTwo;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        /*
        "А логарифмическое?" - не унималась дочь.
        Напишите программу, которая проверяет, что log(e^n) == n для любого вещественного n.
         */
        Scanner input = new Scanner(System.in);
        double n = input.nextDouble();
        //Math.pow(Math.E,n)
        boolean x = (Math.log(Math.pow(Math.E,n)) == n);
        System.out.println(x);
    }
}
