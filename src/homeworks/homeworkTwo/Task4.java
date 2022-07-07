package homeworks.homeworkTwo;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*
        После вкусного обеда Петя принимается за подсчет дней до выходных.
        Календаря под рукой не оказалось, а если спросить у коллеги Феди,
        то тот называет только порядковый номер дня недели, что не очень удобно.
        Поэтому Петя решил написать программу,
        которая по порядковому номеру дня недели выводит сколько осталось дней до субботы.
        А если же сегодня шестой (суббота) или седьмой (воскресенье) день, то программа выводит "Ура, выходные!".
         */
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int days = 6;
        if (x < days) {
            x = days - x;
            System.out.println(x);
        } else {
            System.out.println("Ура выходные");
        }
    }
}
