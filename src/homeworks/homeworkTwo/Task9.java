package homeworks.homeworkTwo;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        /*
        Пока Петя практиковался в работе со строками, к нему подбежала его дочь и спросила:
        "А правда ли, что тригонометрическое тождество (sin^2(x)+ cos^2(x) - 1 == 0) всегда-всегда выполняется?"
        Напишите программу, которая проверяет, что при любом x на входе тригонометрическое тождество будет выполняться
        (то есть будет выводить true при любом x).
        */
        Scanner input = new Scanner(System.in);
        double x = input.nextInt();
        double epsilon = 1E-5;
        double a = Math.pow(Math.sin(x), 2.0) + Math.pow(Math.cos(x), 2.0) - 1.0;
        double b = 0.0;
        if (Math.abs(a - b) < epsilon) {
            System.out.println(true);
            }
        else {
            System.out.println(false);
            }
    }
}