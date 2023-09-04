import java.util.Scanner;
//задача 1
// class Answer {
//    public int countNTriangle(int n){
//        var sum = 0;
//        // Введите свое решение ниже
//        for(int i=0;i<=n;i++){
//            sum += i;
//        }
//        return sum;
//    }
//}
//
//
//public class Main {
//    public static void main(String[] args) {
//
//
//        int n = 0;
//        System.out.print("Введите данные = ");
//        Scanner scanner = new Scanner(System.in);
//        n = scanner.nextInt();
//
//
//        // Вывод результата на экран
//        Answer ans = new Answer();
//        int itresume_res = ans.countNTriangle(n);
//        System.out.println(itresume_res);
//    }
//}


//задача2
class Answer {
    public void printPrimeNums(){
        boolean flag = true;

        // Напишите свое решение ниже
        for (int i = 1; i <=100;i++)
        {
            for (int j = 2; j<=i/2; j++){

                if(i%j==0)
                {
                    flag = false;
                }


            }
            if(flag)
        {
            System.out.println(i);

        }flag = true;

        }
    }
}


public class Main {
    public static void main(String[] args) {
        Answer ans = new Answer();
        ans.printPrimeNums();
    }
}