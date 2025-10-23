package homework.Task11;

//РоботСроитель. Поля: модель, потребляемая мощность, страна производитель, агрегат для строительства, материал, включение робота (boolean isOn.)
public class RobotBuilder implements RobotEngineer, Robot {
    public String model;
    public String consumption;
    public String country;
    public String agregation;
    public String material;
    public boolean isOn;

    public RobotBuilder(String model, String consumption, String country, String agregation, String material, boolean isOn) {
        this.model = model;
        this.consumption = consumption;
        this.country = country;
        this.agregation = agregation;
        this.material = material;
        this.isOn = isOn;
    }

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
            System.out.println(model + " строит");
        } else {
            System.out.println("Робот " + model + " выключен и не строит");
        }

    }

    @Override
    public void createItem() {
        if (isOn) {
            System.out.println("Робот-строитель создает бетон ");
        } else {
            System.out.println("Робот-строитель выключен");
        }
    }
}
