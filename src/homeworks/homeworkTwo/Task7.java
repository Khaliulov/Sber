package homeworks.homeworkTwo;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        /*
        Петя недавно изучил строки в джаве и решил попрактиковаться с ними.
        Ему хочется уметь разделять строку по первому пробелу.
        Для этого он может воспользоваться методами indexOf() и substring().
        На вход подается строка.
        Нужно вывести две строки, полученные из входной разделением по первому пробелу.
         */
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int indexOf = str.indexOf(32);
        String text = str.substring(0, indexOf);
        String text2 = str.substring(indexOf + 1);
        System.out.println(text);
        System.out.println(text2);
    }
}