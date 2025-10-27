package homework.Task11;

//РоботПовар поля: модель, потребляемая мощность, страна производитель, агрегат для приготовления, включение робота (boolean isOn).
public class RobotCooker implements Robot {

    public String model;
    public String consumption;
    public String country;
    public String agregation;
    public boolean isOn;

    public RobotCooker(String model, String consumption, String country, String agregation, boolean isOn) {
        this.model = model;
        this.consumption = consumption;
        this.country = country;
        this.agregation = agregation;
        this.isOn = isOn;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println(model + " включен");
    }

    public void turnOff() {
        isOn = false;
        System.out.println(model + " выключен");
    }

    @Override
    public void uniquePossibility() {
        if (isOn) {
            System.out.println(model + " готовит");
        } else {
            System.out.println(model + " выключен");
        }
    }
}

