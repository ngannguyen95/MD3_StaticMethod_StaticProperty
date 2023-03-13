package Static.Property;

public class Main {
    public static void main(String[] args) {
        Car car1=new Car("Vin Fast","Vf8");
        System.out.println(Car.numberOfCars);

        Car car2=new Car("Vin past","Vf8");
        System.out.println(Car.numberOfCars);
    }
}
