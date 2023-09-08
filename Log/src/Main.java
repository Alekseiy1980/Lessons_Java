
import javax.swing.text.DateFormatter;
import javax.xml.crypto.Data;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.time.LocalTime;
import java.util.*;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.File;
import java.io.BufferedReader;
import java.util.logging.SimpleFormatter;
//// урок логирования
//public class Main {
//    public static void main(String[] args)
//    {
//        Logger logger = Logger.getLogger(Main.class.getName());
//
//        try {
//            FileWriter fileWriter = new FileWriter("text.txt");
//            fileWriter.write("hello");
//            fileWriter.flush();
//        }catch (IOException e) {
//            e.printStackTrace();
//
//
//        }
//
//        try {
//            //Создаем FileHandler, указываем путь к файлу и максимальный размер файла ( в битах)
//            FileHandler fileHandler = new FileHandler("mylog.txt");
//
//            //настраиваем формат сообщений
//            fileHandler.setFormatter(new SimpleFormatter());
//
//            //устанавливаем FileHandler как обработчик для логера
//            logger.addHandler(fileHandler);
//
//            //Устанавливаем уровень логирования( например - ALL, INFO, WARNING, SEVERE и т.д)
//            logger.setLevel(Level.ALL);
//
//            //примеры логирования
//            logger.info("This is an informational message");
//            logger.warning("This is a warning message");
//            logger.severe("This is a severe message");
//
//        }catch(IOException e) {
//            e.printStackTrace();
//
//        }
//    }
//}

//задача 1
 /*
 Напишите программу которая составит строку из 100 повторений слова
 TEST и метод, который запишет эту строку в простой текстовый файл,
 обработайте исключения

 */
//public class Main {
//    public static void main(String[] args) {
//        Logger logger = Logger.getLogger(Main.class.getName());
//        try
//        {
//            FileWriter fileWriterTest = new FileWriter("Test.txt");
//            for(int i = 0; i < 100; i++){
//            fileWriterTest.write("Test");}
//            fileWriterTest.flush();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//}



// задача 2
/* Напишите метод, который вернет содержимое текущей папки в виде
массива строк. Напишите метод , который запишит массив возвращенный
методом в файл.
обработайте ошибки с помощью try-catch конструкции. В случае
возникновения исключения, оно должно записаться в лог фаил
*
* */
//public class Main {
//    public static void main(String[] args) {
//        Logger logger = Logger.getLogger(Main.class.getName());
//        StringBuilder str = new StringBuilder();
//        try
//        {
//            FileReader reader = new FileReader("Test.txt");
//
//            int line;
//            while ((line = reader.read()) !=-1)
//            {
//                str.append((char)line);
//            }
//            System.out.println(str.toString());
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
//        try
//        {
//            FileWriter fileWriterTest = new FileWriter("Test2.txt");
//            fileWriterTest.write(str.toString());
//            fileWriterTest.flush();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//}
class BubbleSort {
    private static File log;
    private static FileWriter fileWriter;

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    public static void sort(int[] mas) {
        Logger logger = Logger.getLogger(BubbleSort.class.getName());
        StringBuilder str = new StringBuilder();
        Date date = new Date();
        Map<String, String> map = new HashMap<String, String>();
        String newdata ="";
        try {
            FileWriter fileWriterTest = new FileWriter("log.txt");
//            //Создаем FileHandler, указываем путь к файлу и максимальный размер файла ( в битах)
//            FileHandler fileHandler = new FileHandler("log.txt");
//
//            //настраиваем формат сообщений
//            fileHandler.setFormatter(new SimpleFormatter());
//
//            //устанавливаем FileHandler как обработчик для логера
//            logger.addHandler(fileHandler);
//
//            //Устанавливаем уровень логирования( например - ALL, INFO, WARNING, SEVERE и т.д)
//            logger.setLevel(Level.INFO);
//
//
//            //примеры логирования
////            logger.info("This is an informational message");
////            logger.warning("This is a warning message");
////            logger.severe("This is a severe message");
            int len = mas.length;
            int max =mas[len-1];
            for (int i = 0; i < len; i++)
            {

                fileWriterTest.write(sdf.format(date) + " [" );
                for (int j = i; j <len; j++)
                {

                    if (mas[j] < mas[i]){
                        int tmp = mas[i];
                        mas[i] = mas[j];
                        mas[j] = tmp;
                      }
                }

                for(int z = 0; z <len; z++) {
                    if (z < len - 1) {
                        fileWriterTest.write(Integer.toString(mas[z]) + ", ");
                    }else
                    {
                        fileWriterTest.write(Integer.toString(mas[z]) );
                    }
                }
                fileWriterTest.write("]\n");
            }
            fileWriterTest.flush();
            System.out.println(newdata);
        }catch(IOException e) {
            e.printStackTrace();

        }
    }
}
public class Main{
    public static void main(String[] args) {
        int[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new int[]{9, 4, 8, 3, 1};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        BubbleSort ans = new BubbleSort();
        ans.sort(arr);

        try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}