package ProhorenokBook.String_about;

import java.util.Locale;

/**
 * Главное правило!!! ПРОВЕРЯТЬ какая локаль по умолчанию, иначе и форматирование будет по-разному работать.
 *  * формула:
 *  * %ИндексФлагШирина.ТочностьТиппреобразования
 *  Параметр ширина - задает минимальную ширину поля. Если строка меньше указанной ширины, то параментр игнорируется, иначе
 *  дополнятется пробелами.
 *  Параметр точность - задает количество знаков после точки для вещественных чисел. Для тип строк он задает макс количество символов.
 *  Параметр флаг - комбинации символов
 *  # - добавляет символ #0 или #х для 8х,16х типов чисел. Для вещественных - выводить ли дробную часть.
 *  0 - задает нули вначале для чисел
 *  - - задает выравнивание по левой границе области. По умолчанию, выравнивание по правой границе.
 *  пробел - вставляет пробел между положительным числом. Перед отрицательным будет стоять минус.
 *  + - обязательный вывод знака и для положит и для отриц чисел.
 *  , - разделитель тысячных групп
 *  ( - отрицательные числа будут в круглых скобках.
 */
public class Printf3_string {
    public static void main(String[] args) {
        System.out.printf("'%3s'", "string"); //'string' (3 игнорируется, так как строка шире)
        System.out.printf("'%10s'", "string"); //'    string'
        System.out.printf("'%10d'", 25); //'        25'
        System.out.printf("'%10f'", 12.5); //' 12.500000'
        System.out.printf("'%10.5f'", Math.PI); //'   3.14159'
        System.out.printf("'%5.2f'", 3.14159265359); //' 3.14'
        System.out.printf("'%5.7s'", "Hello, world"); //'Hello, ' (лучше не использовать для строк - так и не понял как как точность считается)
        System.out.printf("'%5.10s'", "Hello, world"); //'Hello, world' (лучше не использовать для строк - так и не понял как как точность считается)
        System.out.printf("%#o %#o", 10, 077); //012 077 - перевели в восмеричный тип чисел
        System.out.printf("%#x %#x", 10, 0xff); //0xa 0xff - перевели в 16 тип чисел
        System.out.printf("%#X %#X", 10, 0xff); //0XA 0XFF - перевели в 16 тип чисел
        System.out.printf(new Locale("ru","RU"),"%#.0f %.0f", 100.0, 100.0); //100, 100
        System.out.printf("'%7d'", 100); //'    100'
        System.out.printf("'%07d'", 100); //'0000100'
        System.out.printf("'%5d' '%-5d'", 3,3); //'    3' '3    '
        System.out.printf("'%5d'", 3); //'    3'
        System.out.printf("'%+d' '%+d'", -3, 3); //'-3' '+3'
        System.out.printf("'%d'", 1000000); //'1000000'
        System.out.printf("'%,d'", 1000000); //'1,000,000'
        System.out.printf("'%.4f'", 1000000.1); //'1000000.1000'
        System.out.printf("'%,.4f'", 1000000.12); //'1,000,000.1200'
        System.out.printf("%(d", 10); //10
        System.out.printf("%(d", -10); //(10)
        System.out.printf("%(.2f", -10.15); //(10.15)
        System.out.printf("%(.2f", 10.15); //10.15
        /*
        Примеры важности учата локали
         */
        System.out.printf(new Locale("ru","RU"),"%,.2f", 1000000000.5); //1 000 000 000,50
        System.out.printf(new Locale("en","US"),"%,.2f", 1000000000.5); //1,000,000,000.50
        System.out.printf(new Locale("de","DE"),"%,.2f", 1000000000.5); //1.000.000.000,50

    }
}
