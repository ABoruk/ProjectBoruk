package homework.Task18;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(" Две машины едут параллельно ");
        Auto car1 = new Auto("GEELY", "1234BC", 600);
        Auto car2 = new Auto("HYUNDAY", "5678DE", 900);

        car1.start();
        car2.start();
        Auto car3 = new Auto("BMW", "0000C", 1000);
        Auto car4 = new Auto("Audi", "1111E", 500);
        Auto car5 = new Auto("Mercedes", "1222DE", 1500);
        car3.start();
        car3.join();
        car4.start();
        car5.start();
    }
}
