package homework.Task9;

public class Zoo {

    private Animal[] animals = new Animal[0];


    public void addAnimal(Animal animal) {
        Animal[] newAnimal = new Animal[animals.length + 1];
        for (int i = 0; i < animals.length; i++) {
            newAnimal[i] = animals[i];
        }
        newAnimal[animals.length] = animal;
        animals = newAnimal;

    }

    public Animal[] getAnimals() {
        return animals;
    }

}



