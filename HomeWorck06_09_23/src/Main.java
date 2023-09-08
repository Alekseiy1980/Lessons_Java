

class Answer {
    public static StringBuilder answer(String QUERY, String PARAMS) {
        // Напишите свое решение ниже
        try {
            StringBuilder str = new StringBuilder(PARAMS);
            int lengthParam = PARAMS.length();
            int length = str.indexOf("null");
            if (length == -1) {
//            System.out.println("no " + length);
            } else {
                str.delete(0, lengthParam);
                str.append(PARAMS.replace("null", ""));
                PARAMS = str.toString();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(QUERY);
            sb.append(PARAMS);
            return sb;
        }catch(Exception e){
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
                PARAMS = "{\"name\":\"Вася\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"23\"} ";
            }
            else{
                QUERY = args[0];
                PARAMS = args[1];
            }

            Answer ans = new Answer();
            System.out.println(ans.answer(QUERY, PARAMS));
        }
}