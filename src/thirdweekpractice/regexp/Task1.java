package thirdweekpractice.regexp;
/*
Проверить, является ли введенная строка корректным hex номером цвета.
Корректная строка состоит из 7 символов, первый символ “#”,
далее цифры или буквы от A до F (заглавные или прописные).

Если строка является корректным hex номером цвета, то вывести true, иначе false.

#00AA12
true

00FFFF
false

#00FA
false
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
     String inputColor = new Scanner(System.in).nextLine();

        System.out.println(inputColor.matches("#([a-fA-F0-9]{6})"));
    }
}
