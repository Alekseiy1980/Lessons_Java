import java.util.HashMap;
import java.util.Map;

class Answer {
    public static StringBuilder answer(String QUERY, String PARAMS) {
        // Напишите свое решение ниже
        String[] arrayKey = {"name", "country", "city", "age"};
        StringBuilder json = new StringBuilder(PARAMS);
        StringBuilder sqlCommand = new StringBuilder(QUERY);
        StringBuilder b = new StringBuilder("null");
        short i = 0;
        for (String key : arrayKey) {
            int indexKey = json.indexOf(key, 0) + key.length();
            int indexBegin = json.indexOf(":\"", indexKey) + 2;
            int indexEnd = json.indexOf("\"", indexBegin);
            StringBuilder a = new StringBuilder(json.substring(indexBegin, indexEnd));
            if ((i != 0) && (a.compareTo(b) != 0)) sqlCommand.append(" and ");
            if (a.compareTo(b) != 0) {
                sqlCommand.append(key + "=" + "'" + a.toString() + "'");
                i++;
            }
        }
        return sqlCommand;


    }
}

public class Main {
    // Не удаляте этот класс - он нужен для вывода результатов на экран и проверк
        public static void main(String[] args) {
            String QUERY = "";
            String PARAMS = "";

            if (args.length == 0) {
                // При отправке кода на Выполнение, вы можете варьировать эти параметры
                QUERY = "select * from students where ";
                PARAMS = "{\"name\":\"Aleks\", \"country\":\"null\", \"city\":\"Moscow\", \"age\":\"23\"} ";
            }
            else{
                QUERY = args[0];
                PARAMS = args[1];
            }

            Answer ans = new Answer();
            System.out.println(ans.answer(QUERY, PARAMS));
        }
}

//Внутри класса Answer напишите метод answer, который распарсит json и,
// используя StringBuilder, создаст строки вида:
////Студент [фамилия] получил [оценка] по предмету [предмет].
//class Answer {
//    public static void answer(String JSON, String ELEMENT1, String ELEMENT2, String ELEMENT3) {
//        // Напишите свое решение ниже
//        StringBuilder an  = new StringBuilder();
//        StringBuilder nowString = new StringBuilder();
//        String name = "";
//        String ocenka = "";
//        String predmet = "";
//        try {
//
//        }catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
//
//
//// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
//public class Main{
//    public static void main(String[] args) {
//        String JSON = "";
//        String ELEMENT1 = "";
//        String ELEMENT2 = "";
//        String ELEMENT3 = "";
//
//        if (args.length == 0) {
//            // При отправке кода на Выполнение, вы можете варьировать эти параметры
//            JSON = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
//                    "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
//                    "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
//            ELEMENT1 = "Студент ";
//            ELEMENT2 = " получил ";
//            ELEMENT3 = " по предмету ";
//        }
//        else{
//            JSON = args[0];
//            ELEMENT1 = args[1];
//            ELEMENT2 = args[2];
//            ELEMENT3 = args[3];
//        }
//
//        Answer ans = new Answer();
//        ans.answer(JSON, ELEMENT1, ELEMENT2, ELEMENT3);
//    }
//}