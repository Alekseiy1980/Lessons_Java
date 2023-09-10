import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;


import java.io.BufferedReader;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
//import java.util.Date;


class Calculator {
    public int calculate(char op, int a, int b) {
//
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime now = LocalDateTime.now();
        var getCurrentTime = now.format(formatter);
                int result = 0;
                switch (op) {
                    case '+':
                        result = a + b;
                        break;
                    case '-':
                        result = a - b;
                        break;
                    case '*':
                        result = a * b;
                        break;
                    case '/':
                        if (b != 0) {
                            result = a / b;
                        } else {
                            System.out.println("Division by zero is not allowed!");
                            result = 0;
                        }
                        break;
                    default:
                        System.out.println("Invalid operator!");
                        result = 0;
                }
        try (FileWriter fileWriter = new FileWriter("log.txt", true)) {
            fileWriter.write(String.format("%s User entered the first operand = %d\n", getCurrentTime, a));
            fileWriter.write(String.format("%s User entered the operation = %c\n", getCurrentTime, op));
            fileWriter.write(String.format("%s User entered the second operand = %d\n", getCurrentTime, b));
            fileWriter.write(String.format("%s Result is %d\n", getCurrentTime, result));
        } catch (IOException e) {
            e.printStackTrace();
        }
                return result;
            }

        }

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class calck_log {
        public static void main(String[] args) {
                int a = 0;
                char op = ' ';
                int b = 0;

                if (args.length == 0) {
                    // При отправке кода на Выполнение, вы можете варьировать эти параметры
                    a = 3;
                    op = '+';
                    b = 7;
                } else {
                    a = Integer.parseInt(args[0]);
                    op = args[1].charAt(0);
                    b = Integer.parseInt(args[2]);
                }

                Calculator calculator = new Calculator();
                int result = calculator.calculate(op, a, b);
                System.out.println(result);
            }
        }


