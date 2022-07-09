package thirdweekpractice.regexp;

import java.util.Scanner;

public class Task3 {
    /*
    Запросить у пользователя имя, день рождения, номер телефона, email.
Каждое из полученных ответов проверить регулярным выражением по описанным ниже правилам.
Если все введено верно, вывести “Ok”.
Если хотя бы одно из полей не соответствует - вывести “Wrong Answer” и завершить работу программы.
Проверки:
Имя
Должно содержать только буквы. Начинаться с заглавной буквы и далее только прописные.
От 2 до 20 символов.

День рождения
Должно иметь вид DD.MM.YYYY (DD, MM, YYYY - цифры, без ограничений)

Номер телефона
Должно начинаться со знака +, далее ровно 11 цифр.

Email
В начале идут прописные буквы или цифры или один из спец. символов _ - * .
Далее обязательно символ @
Далее прописные буквы или цифры
Далее точка
Далее “com” или “ru”

Albert
15.12.1990
+79151112233
albert@mail.ru
Ok

albert
15.12.1990
+79151112233
albert@mail.ru
Wrong Answer

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String date = input.nextLine();
        String phone = input.nextLine();
        String email = input.nextLine();

        name.matches("[A-Z][a-z]{1,19}");
        date.matches("[0-9]{2}\\.[0-9]{2}\\.[0-9]{4}");
        phone.matches("\\+[0-9]{11}");
        email.matches("[A-Za-z0-9\\-\\_\\*\\.]+@[a-z0-9]+\\.(com|ru)");
    }
}
