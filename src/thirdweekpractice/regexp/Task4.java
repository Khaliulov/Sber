package thirdweekpractice.regexp;

import java.util.Scanner;

public class Task4 {
    /*
    /*
Перевод CamelCase в snake_case
На вход подается строка, состоящая из заглавных и прописных латинских
букв (вида CamelCase). Вывести эту же строку, но состоящую только
из прописных букв (вид snake_case), а перед местом, где была заглавная буква -
должен быть выведен символ нижнего подчеркивания.

ItIsCamelCaseString
it_is_camel_case_string

SomeLongVariable
some_long_variable
 */
    public static void main(String[] args) {
        String inputStr = new Scanner(System.in).nextLine();

        System.out.println(inputStr);
        System.out.println(inputStr.replaceAll("([a-z])([A-Z]+)", "$1_$2").toLowerCase());
    }
}
