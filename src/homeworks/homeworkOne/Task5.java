package homeworks.homeworkOne;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        /*
        Переведите дюймы в сантиметры (1 дюйм = 2,54 сантиметров).
        На вход подается количество дюймов, выведите количество сантиметров.
         */
        final double INCH_CM = 2.54;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество дюймов");
        double inch = scanner.nextDouble();
        double santimetr = inch*INCH_CM;
        System.out.println("Количество сантиметров " + santimetr);

    }
}