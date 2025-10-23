package homework.Task11;

//РоботСапёр. Поля: модель, потребляемая мощность, средство для разминирования (шасси номер), материал, включение робота (boolean isOn)
public class RobotSapper implements RobotEngineer, Robot {
    public String model;
    public String consumption;
    public String shassi;
    public String material;
    public boolean isOn;

    public RobotSapper(String model, String consumption, String shassi, String material, boolean isOn) {
        this.model = model;
        this.consumption = consumption;
        this.shassi = shassi;
        this.material = material;
        this.isOn = isOn;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Робот " + model + " включен");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Робот " + model + " выключен");
    }

    @Override
    public void uniquePossibility() {
        if (isOn) {
            System.out.println(model + " разминирует");
        } else {
            System.out.println(model + " выключен и не разминирует");
        }

    }

    @Override
    public void repair() {
        System.out.println("Робот " + model + " отремонтирован в классе Сапёр");
    }

    @Override
    public void createItem() {
        if (isOn) {
            System.out.println(model + " создаёт приспособление для разминирования ");
        } else {
            System.out.println(model + " выключен  ");
        }
    }
}
