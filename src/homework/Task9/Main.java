package homework.Task9;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Белый", 2, "Мясо", "Лабрадор", "Тузик", 15);
        Dog dog2 = new Dog("Черный", 3, "Трава", "Дворняга", "Мухтар", 5);
        Dog dog3 = new Dog("Рыжий", 4, "Все", "Шпиц", "Барни", 10);
        Bird bird1 = new Bird("Серый", 5, "Семечки", "Синичка", 50);
        Bird bird2 = new Bird("Черный", 6, "Кора", "Дятел", 20);
        Bird bird3 = new Bird("Красный", 7, "Снег", "Снегирь", 60);
        bird1.sound();
        dog1.sound();
//dog2.jump();
//dog3.run();
//dog1.kusat();
//bird2.incubate();
        System.out.println(bird1.toString());
        System.out.println(dog1.toString());
        Zoo zoo = new Zoo();

        zoo.addAnimal(dog1);
        zoo.addAnimal(dog2);
        zoo.addAnimal(dog3);
        zoo.addAnimal(bird1);
        zoo.addAnimal(bird2);
        zoo.addAnimal(bird3);
        zoo.getAnimals();

        Animal[] allAnimals = zoo.getAnimals();

        for (Animal animal1 : allAnimals) {
            animal1.sound();
            animal1.play();
            System.out.println();
        }
        System.out.println(dog1.equals(dog2));
        System.out.println(dog1.hashCode());
        System.out.println(dog2.hashCode());
        System.out.println(bird1.equals(bird2));
        System.out.println(bird1.hashCode());
        System.out.println(bird2.hashCode());
    }
}
