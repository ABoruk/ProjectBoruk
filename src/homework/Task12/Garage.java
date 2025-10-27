package homework.Task12;

public class Garage <T extends Vehicle > {
    private T vehicle;


    public Garage(T b) {
        this.vehicle = b;
    }

    public T getVehicle() {
        return vehicle;
    }

    public void setVehicle(T vehicle) {
        this.vehicle = vehicle;
    }

    public  Boolean isEntryPermitted(){
if (vehicle.getAmount()>100){

    System.out.println("Въезд запрещен");
    return false;
}
else {
    System.out.println("Въезд разрешен");
    return true;
}

    }
}
