package homework;

public class Task3 {
    public static void main(String[] args) {
        //Задание 1

        int x = (98 - 25) * 6; //x/6+25=98
        System.out.println("Результат x= " + x);

        //Задание 2
        int x1 = 8;
        int y1 = 9;
        int z1 = 12;

        x1 += 5;//x1=x1+5
        y1 *= 9;//y1=y1*9
        z1 -= 6; //z=z1-6

        System.out.println("Сложение с присваиванием " + x1);
        System.out.println("Умножение с присваиванием " + y1);
        System.out.println("Вычитание с присваиванием " + z1);

        //Задание 3
        int a = 35;
        int b = 65;
        int ab = a > b ? 5 : 10;
        System.out.println("Результат ab: " + ab);

        //Задание 4
        int xa = 5;
        int ya = 2;
        int ca = ++xa * ya--;
        System.out.println("Инкремент " +xa);
        System.out.println( "Декремент " +ya);
        System.out.println("Результат уравнения " +ca);

    }

}
