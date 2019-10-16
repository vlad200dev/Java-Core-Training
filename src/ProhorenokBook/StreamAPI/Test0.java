package ProhorenokBook.StreamAPI;

/**
 * Начиная с Java 8 в состав библиотеки входит пакет, который позволяет работать с ПОТОКАМИ ДАННЫХ. Причем обработка данных может быть произведена ПОСЛЕДОВАТЕЛЬНО(по умолчанию), либо в параллельных потоках, что увелич скорость обработки.
 * Схема работы с потоками данных
 * Источник->Операция1->...->ОперацияN->Терминальная операция
 * В качестве источника данных могут быть:
 * Списки
 * Множества
 * др элементы Коллекции
 * Массивы
 * Файлы
 * др.
 *
 * Над данными производятся различные промежуточные операции(например фильтрация).
 * ЛЮБАЯ ПРОМЕЖУТОЧНАЯ ОПЕРАЦИЯ возвращает поток, с которым можно выполнять другие промежуточные операции.
 * Промежуточные операции заканчиваются ТЕРМИНАЛЬНОЙ ОПЕРАЦИЕЙ. При ее выполнении работа с потоком прекращается.
 *
 * Промежуточные операции являются "линивыми", то есть все промежуточные операции выполняются только при выполнении терминальной операции
 *
 * stream() - создает последовательный поток.
 * parallelStream() - создает параллельный поток. Паралалельный поток может обрабатывать данные в нескольких потоках, это позволяет увеличить скорость обработки, если процессор многоядерный
 * parallel() - преобразовать последовательный поток в параллельный.
 * Stream<Integer> stream = arr.stream().parallel();
 * При использовании паралельных потоков возможны конфликты между несколькими потоками при доступе к одному объекту.
 * Проблема в использовании упорядоченных и отсортированных даннных.
 * Чтобы получить максимальный выигрыш от параллельной обработки, следует сделать данные неупорядоченными с помощью метода unordered()
 */
public class Test0 {
}
