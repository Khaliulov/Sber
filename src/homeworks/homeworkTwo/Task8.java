package homeworks.homeworkTwo;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        /*
        Раз так легко получается разделять по первому пробелу,
        Петя решил немного изменить предыдущую программу и теперь разделять строку по последнему пробелу.
         */
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int lastIndexOf = str.lastIndexOf(32);
        String text = str.substring(0, lastIndexOf);
        String text2 = str.substring(lastIndexOf + 1);
        System.out.println(text);
        System.out.println(text2);
    }
}
