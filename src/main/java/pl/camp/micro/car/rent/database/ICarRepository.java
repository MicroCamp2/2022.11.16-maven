package pl.camp.micro.car.rent.database;

import pl.camp.micro.car.rent.model.Car;

import java.util.List;

public interface ICarRepository {
    boolean rentCar(String plate);
    List<Car> getCars();
}
