package homeworks.homeworkOne;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        /*
        На вход подается двузначное число n.
        Выведите число, полученное перестановкой цифр в исходном числе n.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите двухзначное число: ");
        int n = scanner.nextInt();
        int a = n/10;
        int b = n%10;
        //int n2 = b*10+a;
        System.out.println("Вывод: " + b + a);
    }
}
