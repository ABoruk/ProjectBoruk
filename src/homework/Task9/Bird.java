package homework.Task9;

public class Bird extends Animal {
    private String family;
    private int height;

    public Bird(String color, int age, String food, String family, int height) {
        super(color, age, food);
        this.family = family;
        this.height = height;
    }

    // Переопределить методы, которые есть в родительском классе животное (издание звуков, животное играет)  в классах Собака и Птица.
    public void sound() {
        System.out.println(family + " поёт");

    }

    public void play() {
        System.out.println(family + " клюет");
    }

    public void incubate() {
        System.out.println(family + " высиживает птенцов");
    }

    public String toString() {
        String result = super.toString();
        result = result + " Семейство: " + family + " Высота: " + height;
        return result;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Bird)) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        Bird bird1 = (Bird) obj;

        if (family.equals(bird1.getFamily()) && height == bird1.height) {
            return true;
        } else {
            return false;
        }

    }

    public String getFamily() {
        return family;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int hashCode() {
        int result;
        result=super.hashCode()+3* family.hashCode() + height;
        return result;
    }
}