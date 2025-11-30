package homework.Task19;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        //UpperCase
        StringProcessor upper = String::toUpperCase;
        System.out.println(upper.value("Hello World"));
        List<City> cities = Arrays.asList(
                new City(1, "Tokyo", 37_000_000, Continent.ASIA),
                new City(2, "Delhi", 31_000_000, Continent.ASIA),
                new City(3, "San Paulo", 22_000_000, Continent.AMERICA),
                new City(4, "Mexico City", 21_000_000, Continent.AMERICA),
                new City(5, "Istanbul", 15_000_000, Continent.EUROPE),
                new City(6, "Paris", 11_000_000, Continent.EUROPE),
                new City(7, "Sydney", 5_300_000, Continent.AUSTRALIA),
                new City(8, "Canberra", 400_000, Continent.AUSTRALIA)
        );
        // Самый густонаселенный город на континенте
        List<City> maxPopulation = cities.stream()
                .filter(city -> city.getContinent() == Continent.ASIA)
                .max(Comparator.comparing(City::getPopulation)).stream().toList();
        System.out.println(maxPopulation);
        //Город с минимальным населением на континенте
        List<City> minPopulation = cities.stream()
                .filter(city -> city.getContinent() == Continent.ASIA)
                .min(Comparator.comparing(City::getPopulation)).stream().toList();
        System.out.println(minPopulation);
        //Самый густонаселённый город вообще
        List<City> maxPopulationAll = cities.stream()
                .max(Comparator.comparing(City::getPopulation)).stream().toList();
        System.out.println(maxPopulationAll);
        //Город с самым маленьким населением вообще
        List<City> minPopulationAll = cities.stream()
                .min(Comparator.comparing(City::getPopulation)).stream().toList();
        System.out.println(minPopulationAll);
        //Первый город с населением > 1 млн
        Optional<City> firstCity = cities.stream()
                .filter(city -> city.getPopulation() > 1000000).findFirst();
        firstCity.ifPresent(System.out::println);
        //Коллекция названий городов
        List<String> cityNames = cities.stream()
                .map(City::getName)
                .toList();
        System.out.println("Названия всех городов: " + cityNames);
    }
}
