package homework.Task11;

//Создать интерфейс Робот. В нём определены методы:
// Дефолтный метод:  Отремонтировать робота и абстрактные методы: включить робота, выключить, продемонстрировать уникальные способности (uniquePossibility).
public interface Robot {
    void turnOn();

    void turnOff();

    void uniquePossibility();

    default void repair() {
        System.out.println("Отремонтировать робота");
    }
}
