package homework.Task9;

import java.util.Objects;

public class Animal {
    private String color;
    private int age;
    private String food;

    public Animal(String color, int age, String food) {
        this.color = color;
        this.age = age;
        this.food = food;
    }

    public String toString() {
        return "Цвет: " + color + ", Возраст: " + age + ", Еда: " + food;
    }

    public void sound() {
        System.out.println("Издание звуков");
    }

    public void play() {
        System.out.println("Животное играет");

    }

    public String getColor() {
        return color;
    }
    public int getAge() {
        return age;
    }
    public String getFood() {
        return food;
    }

@Override
public boolean equals(Object obj) {
    if (!(obj instanceof Animal)) return false;
    Animal animal = (Animal) obj;
            if (color.equals(animal.getColor()) && age==animal.age &&food.equals((animal.getFood()))) {
            return true;
        } else {
            return false;
        }
}

    @Override
    public int hashCode() {
        int result = color.hashCode() + food.hashCode() + age * 2;
            return  result;
    }
}


