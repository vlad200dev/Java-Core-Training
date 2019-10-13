package ProhorenokBook.InputAndOutput.InputStream_OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class Test1 {
    public static void main(String[] args) {
        /*
        Класс OutputStream - базовый абстрактный для потоков вывода(записи)
        метод write() - записывает данные в поток
        метод flush() - сбрасывает данные из буфера в файл
        метод close() - сбрасывает данные из буфера в файл, закрывает поток и высвобождает ресурсы.

        Все методы могут генерировать контролируемое исключение.
         */
        OutputStream out = null;
        try {
            try {
                out = new FileOutputStream("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\ProhorenokBook\\FilesAndCatalogues\\Files_usage");
                byte[] bytes = "строка".getBytes("cp1251");
                out.write(bytes[0]);
                out.write(bytes, 0, 3);
                out.write(bytes);
            }
            finally {
                if (out != null) out.close();
            }
        }
        catch (UnsupportedEncodingException e) {
            System.err.println("Проблемы с кодировкой");
            System.exit(1);
        }
        catch (IOException e) {
            System.err.println("Не удалось записать в файл");
            System.exit(1);
        }
        System.out.println("Данные успешно записаны в файл");
    }

}
/*
Не удалось записать в файл
 */
