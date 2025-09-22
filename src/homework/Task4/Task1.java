package homework.Task4;

import java.util.Scanner;

public class Task1 { public static void main(String[] args) {
    //Задача 1

    Scanner in = new Scanner(System.in);
    System.out.println("Введите a");
    int a = in.nextInt();
    System.out.println("Введите b");
    int b = in.nextInt();
    System.out.println("Введите с");
    int c = in.nextInt();

    if (a % 2 == 0) {
        System.out.println(a + "-четное число");
    }
    if (b % 2 == 0) {
        System.out.println(b + "-четное число");
    }
    if (c % 2 == 0) {
        System.out.println(c + "-четное число");
    }
}

}
//Задание 2


//if (условие) оператор 1
//else (условие) оператор 2
