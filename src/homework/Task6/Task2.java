package homework.Task6;

public class Task2 {
    public static void main(String[] args) {
        int [] array1 = {2, 3, 4, 5, 6};
        int [] array2 = new int[array1.length + 1];

        for (int a=0;a<array1.length;a++)
        {
            array2[a]=array1[a];

        }
        array2[array2.length - 1] = 0;
        for (int b:array2)
        {
            System.out.println(b);
        }


    }
}
