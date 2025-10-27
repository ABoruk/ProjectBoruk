package homework.Task12;

public class Main {
    public static void main(String[]args){
        Car car=new Car("Lamborgini",200);
        Motocycle motocycle=new Motocycle("Java",70);

        Garage<Car>carGarage=new Garage<>(car);
        Garage<Motocycle>motocycleGarage=new Garage<>(motocycle);

        System.out.println(carGarage.getVehicle().getName());
        carGarage.isEntryPermitted();

        System.out.println(motocycleGarage.getVehicle().getName());
        motocycleGarage.isEntryPermitted();
    }
}
