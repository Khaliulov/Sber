package homeworks.homeworkOne;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        /*
        На вход подается бюджет мероприятия – n тугриков.
        Бюджет на одного гостя – k тугриков.
        Вычислите и выведите, сколько гостей можно пригласить на мероприятие.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите бюджет мероприятия:");
        int n = scanner.nextInt();
        System.out.println("Введите бюджет на одного гостя:");
        int k = scanner.nextInt();
        double guests = n/k;
        System.out.println("На мероприятие можно пригласить: " + (int)guests);
    }
}
