import java.util.HashMap;
import java.util.Map;

class Answer {
    public static StringBuilder answer(String QUERY, String PARAMS){
        StringBuilder str = new StringBuilder(PARAMS);
        int length = str.indexOf("null");

        try {
            if (length != -1) {
                str.delete(length, length + 4); // Удаляем "null"
                PARAMS = str.toString();
            }

            String[] params = PARAMS.split(",");
            str = new StringBuilder();

            for (String param : params) {
                String[] keyValue = param.split(":");
                String key = keyValue[0].replaceAll("\"", "");
                String value = keyValue[1].replaceAll("\"", "");
                str.append(key).append("='").append(value).append("' and ");
            }

            str.delete(str.length() - 5, str.length()); // Удаляем последний "and"
            String resultParams = str.toString();

            StringBuilder sb = new StringBuilder();
            sb.append(QUERY).append(resultParams);
            return sb;
        } catch(Exception e) {
            e.printStackTrace();
        }

        return null;
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