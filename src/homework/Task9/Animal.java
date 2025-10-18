package homework.Task9;

//Создать классы: Животное, Собака, Птица. Поля в классе животное: окрас, максимальная продолжительность жизни, тип еды которой питаются (мясо, насекомые, растения).
// Определить методы в классе животное: (издание звуков, животное играет)
//Определить поля в классе Птица: семейство, максимальная высота полёта. В классе птица методы-петь, клевать, высиживать птенцов.
//При этом, в консоли должны выводиться поля семейства птиц с соответствующим поведением (пример: Воробей поёт).
// Использовать наследование, где суперкласс-Животное.
// Переопределить методы, которые есть в родительском классе животное (издание звуков, животное играет)  в классах Собака и Птица.
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


}


