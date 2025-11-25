package homework.Task18.Runnable;

public class Main {
    public static void main(String[] args)  {
        System.out.println(" Две машины едут параллельно ");
        Thread car1 = new Thread(new Auto("Zeekr","AC-2560",300));
        Thread car2 = new Thread(new Auto("Opel","VC2121",500));
        car1.start();
        car2.start();
    }
}
