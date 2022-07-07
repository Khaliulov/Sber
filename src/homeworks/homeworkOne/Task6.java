package homeworks.homeworkOne;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        /*
        На вход подается количеств миль – count.
        Переведите мили в километры (1 миля = 1,60934 км) и выведите количество километров.
         */
        final double MILE_KM = 1.60934;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество миль");
        double mile = scanner.nextDouble();
        double km = mile*MILE_KM;
        System.out.println("Количество сантиметров " + km);
    }
}
