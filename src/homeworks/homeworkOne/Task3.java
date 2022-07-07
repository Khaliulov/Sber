package homeworks.homeworkOne;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*
        Прочитайте из консоли имя пользователя и выведите в консоль строку:
        Привет, <имя пользователя>!
        String userName = scanner.next();
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свое имя: ");
        String userName = scanner.nextLine();
        System.out.println("Привет, " + userName +"!");
    }
}