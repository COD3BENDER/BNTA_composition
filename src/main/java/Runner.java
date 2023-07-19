import products.Product;
import vehicles.Bicycle;
import vehicles.Car;
import vehicles.Engine;
import vehicles.IVehicle;

import java.util.ArrayList;

public class Runner {


    public static void main(String[] args) {

        ArrayList<IVehicle> vehicles = new ArrayList<>();

        Bicycle bicycle = new Bicycle(
                10,
                20,
                new Product(350,6,"BMX")
        );

        vehicles.add(bicycle);
        System.out.println("wheels:" + bicycle.getWheenCount());
        System.out.println("speed:" + bicycle.getMaxSpeed());
        System.out.println("price:" + bicycle.getPrice());

        // this will show the difference from inheritance.

        Car car = new Car(
                200,
                10000,
                new Product(10000, 3, "Honda Civic"),
                new Engine(1000,600)
        );

        vehicles.add(car);
        car.startEngine(); // this part even though both Bicycle and Car have extended Vehicle, the car has the startEngine method by getting IMotorized object
        System.out.println(car.getFuel());
        System.out.println(car.getPrice());
    }

}
