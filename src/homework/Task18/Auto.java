package homework.Task18;

public class Auto extends Thread {
    private String name;
    private String number;
    private long time;

    public Auto(String name, String number, long time) {
        this.name = name;
        this.number = number;
        this.time = time;
    }
    @Override
    public void run(){
        drive(this.name, this.number, this.time);
    }
    private static void drive(String name, String number, long time){
        System.out.println(name + " (" + number + ") едет");
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " едет... Шаг " + i);
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(name + " завершила движение.");

    }
    }

