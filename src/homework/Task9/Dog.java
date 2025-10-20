package homework.Task9;

import java.util.Objects;

//В классе собака определить имя, порода, средний вес.
//В классе Собака реализовать методы: лаять, кусать, бегать, играть, прыгать.
// При этом, в консоли должны выводится имя собаки вместе с описанием действия (пример. Рекс прыгает).
public class Dog extends Animal {
    private String name;
    private String breed;
    private double avg_weight;

    public Dog(String color, int age, String food, String breed, String name, double avg_weight) {
        super(color, age, food);
        this.breed = breed;
        this.name = name;
        this.avg_weight = avg_weight;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public double getAvg_weight() {
        return avg_weight;
    }

    public void sound() {
        System.out.println(name + " лает");
    }

    public void kusat() {
        System.out.println(name + " кусает");

    }

    public void run() {
        System.out.println(name + " бегает");
    }

    public void jump() {
        System.out.println(name + " прыгает");
    }

    public void play() {
        System.out.println(name + " играет");
    }

    public String toString() {
        String result = super.toString();
        result = result + " Имя: " + name + " Порода: " + breed + " Средний вес " + avg_weight;
        return result;
    }

    public boolean equals(Object obj) {

        if (!(obj instanceof Dog)) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        Dog dog1 = (Dog) obj;

        if (name.equals(dog1.getName()) && breed.equals(dog1.getBreed()) && avg_weight == dog1.avg_weight) {
            return true;
        } else {
            return false;
        }

    }

    public int hashCode() {
        int result ;
        result = super.hashCode()+3 * (int) (name.hashCode() + breed.hashCode() + avg_weight * 2);
        return result;
    }
}