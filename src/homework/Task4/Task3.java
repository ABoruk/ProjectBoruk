package homework.Task4;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x");
        int x = in.nextInt();

        double a = 15.0 / x;
        int b = (int) a;
        if (a == b) {
            switch (b) {
                case 3:
                    System.out.println("Результат деления равен 3");
                    break;
                case 5:
                    System.out.println("Результат деления равен 5");
                    break;
                default:
                    System.out.println("Результат деления равен целому числу " + b);
                    break;
            }
        } else {

            System.out.println("Результат деления равен дробному числу " + a);
        }
    }
}
