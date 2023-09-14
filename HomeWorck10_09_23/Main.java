//
////Внутри класса MergeSort напишите метод mergeSort, который принимает массив
//// целых чисел a и реализует алгоритм сортировки слиянием. Метод должен
//// возвращать отсортированный массив.
////
////Пример
////a = {5, 1, 6, 2, 3, 4} -> [1, 2, 3, 4, 5, 6]
//
//import java.util.ArrayList;
//import java.util.Arrays;
//
//
//
//class MergeSort {
//    public static int[] mergeSort(int[] a) {
//
//        if (a.length <= 1) {
//            return a;
//        }
//        int mid = a.length / 2;
//        int[] left = Arrays.copyOfRange(a, 0, mid);
//        int[] right = Arrays.copyOfRange(a, mid, a.length);
//        left = mergeSort(left);
//        right = mergeSort(right);
//        return merge(left, right);
//    }
//
//    private static int[] merge(int[] left, int[] right) {
//        int[] result = new int[left.length + right.length];
//        int i = 0, j = 0, k = 0;
//        while (i < left.length && j < right.length) {
//            if (left[i] <= right[j]) {
//                result[k++] = left[i++];
//            } else {
//                result[k++] = right[j++];
//            }
//        }
//        while (i < left.length) {
//            result[k++] = left[i++];
//        }
//        while (j < right.length) {
//            result[k++] = right[j++];
//        }
//        return result;
//    }
//
//}
//
//    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
//
//        public class Main {
//        public static void main(String[] args) {
//            int[] a;
//
//            if (args.length == 0) {
//                // При отправке кода на Выполнение, вы можете варьировать эти параметры
//                a = new int[]{5, 1, 6, 2, 3, 4};
//            } else {
//                a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
//            }
//
//            MergeSort answer = new MergeSort();
//            String itresume_res = Arrays.toString(answer.mergeSort(a));
//            System.out.println(itresume_res);
//        }
//    }



//Задача2
//Удаление четных элементов

//Напишите функцию removeEvenNumbers, которая принимала бы произвольный
// список целых чисел, удаляла бы из него четные числа и выводила список
// без четных чисел.

//Напишите свой код в методе removeEvenNumbers класса Answer. Метод
// removeEvenNumbers принимает на вход один параметр:
//Integer[] arr - список целых чисел

//Пример
//arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
//removeEvenNumbers(arr);
//// [1, 3, 5, 7, 9]
//arr = new Integer[]{2, 4, 6, 8};
//removeEvenNumbers(arr);

//// []



//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.Arrays;
//
//class Answer {
//    public static void removeEvenNumbers(Integer[] arr) {
//        // Введите свое решение ниже
//        ArrayList<Integer> a = new ArrayList<>(arr.length);
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i]%2 == 0) {
//                    a.add(arr[i]);
//
//                }else{
//                    a.remove(arr[i]);
//                }
//            }
//            System.out.println(a);
//        }
//    }
//
//
//// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
//public class Main{
//    public static void main(String[] args) {
//        Integer[] arr = {};
//
//        if (args.length == 0) {
//            // При отправке кода на Выполнение, вы можете варьировать эти параметры
//            arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
//        }
//        else{
//            arr = Arrays.stream(args[0].split(", "))
//                    .map(Integer::parseInt)
//                    .toArray(Integer[]::new);
//        }
//
//        Answer ans = new Answer();
//        ans.removeEvenNumbers(arr);
//    }
//}

//Задача 3
//Анализатор списка
//        Напишите функцию analyzeNumbers, которая принимает на вход
//        целочисленный список arr и:
//
//        Сортирует его по возрастанию и выводит на экран
//        Находит минимальное значение в списке и выводит на экран -
//        Minimum is {число}
//        Находит максимальное значение в списке и выводит на экран -
//        Maximum is {число}
//        Находит среднее арифметическое значений списка и выводит на
//        экран - Average is =  {число}
//        Напишите свой код в методе analyzeNumbers класса Answer. Метод
//        analyzeNumbers принимает на вход один параметр:
//
//        Integer[] arr - список целых чисел

//        Пример
//        arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
//        analyzeNumbers(arr)

// [1, 2, 3, 4, 5, 6, 7, 8, 9]
// Minimum is 1
// Maximum is 9
// Average is = 5
import java.util.Arrays;
import java.util.ArrayList;

class Answer {
    public static void analyzeNumbers(Integer[] arr) {
        // Введите свое решение ниже
        ArrayList<Integer> a = new ArrayList<>(arr.length);
        int average =0;
        int max = 0, min = arr[0];
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int tmp =arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;

                }
            }
            if(max<arr[i]){
                max = arr[i];
            }
            if(min>arr[i]){
                min = arr[i];
            }
            average +=arr[i];
            a.add(arr[i]);
        }

        average /= arr.length;
        System.out.println(a);
        System.out.println("Minimum is = " + min);
        System.out.println("Maximum is = " + max);
        System.out.println("Averege is = " + average);
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Main{
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        Answer ans = new Answer();
        ans.analyzeNumbers(arr);
    }
}