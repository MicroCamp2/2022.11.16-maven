package pl.camp.micro.car.rent.database;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import pl.camp.micro.car.rent.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarRepository implements ICarRepository {
    private final List<Car> cars = new ArrayList<>();

    //private final static CarRepository instance = new CarRepository();
    /*private CarRepository() {
        this.cars.add(new Car("Audi", "A5", 300.0, "KR11"));
        this.cars.add(new Car("BMW", "3", 250.0, "KR22"));
        this.cars.add(new Car("Toyota", "Corolla", 200.0, "KR33"));
        this.cars.add(new Car("Kia", "Ceed", 200.0, "KR44"));
    }*/

    public CarRepository() {
        this.cars.add(new Car("Audi", "A5", 300.0, "KR11"));
        this.cars.add(new Car("BMW", "3", 250.0, "KR22"));
        this.cars.add(new Car("Toyota", "Corolla", 200.0, "KR33"));
        this.cars.add(new Car("Kia", "Ceed", 200.0, "KR44"));
    }

    public boolean rentCar(String plate) {
        for(Car car : this.cars) {
            if(car.getPlate().equals(plate) && !car.isRent()) {
                car.setRent(true);
                return true;
            }
        }

        return false;
    }

    public List<Car> getCars() {
        return cars;
    }

    /*public static CarRepository getInstance() {
        return instance;
    }*/
}
