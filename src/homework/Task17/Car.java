package homework.Task17;

import java.io.Serializable;
import java.util.Objects;

public class Car implements Serializable {
    private String model;
    private int speed;
    private String country;

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", speed='" + speed + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return speed == car.speed && Objects.equals(model, car.model) && Objects.equals(country, car.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, speed, country);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Car(String model, int speed, String country) {
        this.model = model;
        this.speed = speed;
        this.country = country;

    }
}
