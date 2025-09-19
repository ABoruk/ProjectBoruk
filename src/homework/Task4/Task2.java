package homework.Task4;

import java.util.Scanner;

public class Task2 {
        public static void main (String[]args) {
            //Задача 2
            Scanner in = new Scanner(System.in);
            System.out.println("Введите a");
            int a = in.nextInt();
            System.out.println("Введите b");
            int b = in.nextInt();
            System.out.println("Введите с");
            int c = in.nextInt();


            if (a % 2 == 0 && a%5==0) {
                    System.out.println(a + " делится на 2 и на 5");
                }
            else {
                    System.out.println(a + "  не делится на 2 и на 5");
                }
            if (b % 2 == 0 && b%5==0) {
                System.out.println(b + " делится на 2 и на 5");
            }
            else {
                System.out.println(b + "  не делится на 2 и на 5");
            }
            if (c % 2 == 0 && c%5==0) {
                System.out.println(c + " делится на 2 и на 5");
            }
            else {
                System.out.println(c + "  не делится на 2 и на 5");
            }

            } }