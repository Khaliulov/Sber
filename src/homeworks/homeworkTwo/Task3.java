package homeworks.homeworkTwo;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*
        Петя снова пошел на работу. С сегодняшнего дня он решил ходить на обед строго после полудня.
        Периодически он посматривает на часы (x - час, который он увидел).
        Помогите Пете решить, пора ли ему на обед или нет.
        Если время больше полудня, то вывести "Пора".
        Иначе - “Рано” На вход гарантируется передача числа от 0 до 23 включительно.
        */
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        if (x >= 13) {
            System.out.println("Пора");
        } else {
            System.out.println("Рано");
        }

    }
}
