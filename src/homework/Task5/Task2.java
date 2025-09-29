package homework.Task5;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {

//    while(условие){тело цикла}
        Scanner in = new Scanner(System.in);
        System.out.println("Введите а");
        int a = in.nextInt();
        System.out.println("Введите b");
        int b = in.nextInt();
        int sum = 0;
        int max;
        int min;
        if (a > b) {
            min = b;
            max = a;
        }
        else {
            min = a;
            max = b;
        }
        if (min>0 & max> 0) {
            while (min <= max) {
                sum += min;
                min++;

            }
            System.out.println("Сумма чисел = " + sum);
        }
        else {
            System.out.println("Одно из чисел отрицательное");
        }
    }
}
