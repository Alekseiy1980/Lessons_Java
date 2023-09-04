
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int firstInt = 123;
//        String a = "hello this number is ";
//        System.out.println(a + firstInt);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(LocalDateTime.now().toString());

//        первая хадача

//        Scanner inputData = new Scanner(System.in);
//        System.out.println("enter your age: ");
//        int age = inputData.nextInt();
//        if (age >=18){
//            System.out.println("welcom");
//        }else if (age >=15){
//            System.out.println("sorry");
//        }else{
//            System.out.println("go to school");
//        }

//        работа с цикоами
//        while (true) {
//            Scanner inputData = new Scanner(System.in);
//            System.out.println("enter your age: ");
//            int age = inputData.nextInt();}

//            for (int i = 0; i < 10; i++) {
//                Scanner inputData = new Scanner(System.in);
//                System.out.println("enter your age: ");
//                int age = inputData.nextInt();
//                if (age >=18){
//                    System.out.println("welcom");
//                }else if (age >=15){
//                    System.out.println("sorry");
//                }else{
//                    System.out.println("go to school");
//                }
//
//            }
//        Самостоятельная работа в классе
//  Написать программу, которая запросит пользователя ввести имя в консрои,
//   И выведит в консоль приветствие

//        String name;
//        Scanner inputData = new Scanner(System.in);
//        System.out.println("Введите ваше имя ");
//        name = inputData.next();
//        System.out.println("Привет, " + name + " !");

//        дан массив двоичных чисел , например [1,1,0,1,1,1],
//        вывести максимальное колличество подряд идущих 1

//            int [] arr = {1,1,0,1,1,1,1};
//            int count = 0;
//            int max = 0;
//            for (int i = 0; i < arr.length; i++){
//                if(arr[i] == 1)
//                {
//                    count++;
//                }else if(count > max){
//                    max = count;
//                    count = 0;
//                }
//                if(count > max)System.out.println(count);
//                else System.out.println(max);
//            }
//        Второй способ решнния этой же задачи
//            int [] arr = {1,1,0,1,1,1,1};
//            int count = 0;
//            int max = 0;
//
//            for (int num : arr){
//                if(num == 1){
//                    count++;
//                    if(count > max){
//                        max = count;
//                    }
//                }else {
//                    count = 0;
//                }
//            }
//            System.out.println("1: "+ max);

//        задача3
//        Дан массив nums = [3,2,2,3] и число val = 3
//        Если в массиве есть числа ,равные заданному, нужно перенести в конец массва

        int [] arr = {3,1,3,3,5,2};
        var val = 3;
        for (int i = 0; i < arr.length; i++){
          for (int j = 0; j <arr.length - 1; j++){
              if (arr[j] == val){
                  int tmp = arr[j];
                  arr[j] = arr[j + 1];
                  arr[j + 1] = tmp;
              }
          }
        }
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

}