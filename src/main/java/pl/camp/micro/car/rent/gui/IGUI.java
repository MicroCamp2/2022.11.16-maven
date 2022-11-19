package pl.camp.micro.car.rent.gui;

import pl.camp.micro.car.rent.model.Car;
import pl.camp.micro.car.rent.model.User;

import java.util.List;

public interface IGUI {
    String showMenu();
    void listCars(List<Car> cars);
    String plateInput();
    void showRentResult(boolean rentResult);
    User loginInput();
}
