//import java.util.LinkedList;
//import java.util.Objects;
//import java.util.Scanner;
//
//class MyQueue<T> {
//    // Напишите свое решение ниже
//    private LinkedList<T>elements = new LinkedList<>();
//    public void enqueue(T element){
//        // Напишите свое решение ниже
//        elements.addLast(element);
//    }
//
//    public T dequeue(){
//        // Напишите свое решение ниже
//        return elements.pollFirst();
//    }
//
//    public T first(){
//        // Напишите свое решение ниже
//return elements.peekFirst();
//    }
//
//    public LinkedList<T> getElements() {
//        // Напишите свое решение ниже
//        return elements;
//    }
//}
//
//// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
//public class Main {
//    public static void main(String[] args) {
//        MyQueue<Integer> queue;
//        queue = new MyQueue<>();
//
//        if (args.length == 0) {
//            // При отправке кода на Выполнение, вы можете варьировать эти параметры
//            queue.enqueue(1);
//            queue.enqueue(10);
//            queue.enqueue(15);
//            queue.enqueue(5);
//        } else {
//            queue.enqueue(Integer.parseInt(args[0]));
//            queue.enqueue(Integer.parseInt(args[1]));
//            queue.enqueue(Integer.parseInt(args[2]));
//            queue.enqueue(Integer.parseInt(args[3]));
//        }
//
//        System.out.println(queue.getElements());
//
//        queue.dequeue();
//        queue.dequeue();
//        System.out.println(queue.getElements());
//
//        System.out.println(queue.first());
//    }
//}

//Задача 3

import java.util.ArrayDeque;
import java.util.Deque;


class Calculator {

    Deque<Integer>queue = new ArrayDeque<Integer>();
    public int calculate(char op, int a, int b) {
        // Напишите свое решение ниже

int result =0;
//queue.addFirst(result);

switch(op) {
    case'-': result = a - b ;break;
    case'+': result = a + b ;break;
    case'*': result = a * b ;break;
    case'/': result = a / b ;break;

}
if(op == '<'){
    result = queue.peekLast();
}else{
    queue.addFirst(result);

}

return  result;
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Main {
    public static void main(String[] args) {
        int a, b, c, d;
        char op, op2, undo;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '+';
            b = 7;
            c = 4;
            op2 = '+';
            d = 7;
            undo = '<';
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
            c = Integer.parseInt(args[3]);
            op2 = args[4].charAt(0);
            d = Integer.parseInt(args[5]);
            undo = args[6].charAt(0);
        }

        Calculator calculator = new Calculator();
        int result = calculator.calculate(op, a, b);
        System.out.println(result);
        int result2 = calculator.calculate(op2, c, d);
        System.out.println(result2);
        int prevResult = calculator.calculate(undo, 0, 0);
        System.out.println(prevResult);
    }
}