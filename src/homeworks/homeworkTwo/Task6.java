package homeworks.homeworkTwo;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        /*
        На следующий день на работе Петю и его коллег попросили заполнить анкету.
        Один из вопросов был про уровень владения английского.
        Петя и его коллеги примерно представляют, сколько они знают иностранных слов.
        Также у них есть табличка перевода количества слов в уровень владения английском языком.
        Было бы здорово автоматизировать этот перевод!
        На вход подается положительное целое число count - количество выученных иностранных слов.
        Нужно вывести какому уровню соответствует это количество.
         */
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        if (count < 500) {
            System.out.println("beginner");
        } else if (500 <= count && count < 1500) {
            System.out.println("pre-intermediate");
        } else if (1500 <= count && count < 2500) {
            System.out.println("intermediate");
        } else if (2500 <= count && count < 3500) {
            System.out.println("upper-intermediate");
        } else if (3500 <= count) {
            System.out.println("fluent");
        }
    }
}
