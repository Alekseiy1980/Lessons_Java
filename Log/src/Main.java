
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

        public static void sort(int[] mas) {
            try {
                log = new File("log.txt");
                log.createNewFile();
                fileWriter = new FileWriter(log);
                bubbleSort(mas);

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        private static int[] bubbleSort(int[] mas) {
            boolean isSorted = false;
            int buffer;

            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < mas.length - 1; i++) {
                    if (mas[i] > mas[i + 1]) {
                        isSorted = false;

                        buffer = mas[i];
                        mas[i] = mas[i + 1];
                        mas[i + 1] = buffer;
                    }
                }
                logStep(Arrays.toString(mas));
            }
            return mas;
        }

        public static void logStep(String note) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                String timestamp = dateFormat.format(new Date());
                fileWriter.write(timestamp + " " + note + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

public class Main {
        public static void main(String[] args) {
            int[] arr = {};

            if (args.length == 0) {
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
