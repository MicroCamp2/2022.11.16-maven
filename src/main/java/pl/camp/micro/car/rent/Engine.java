package pl.camp.micro.car.rent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import pl.camp.micro.car.rent.authentication.Authenticator;
import pl.camp.micro.car.rent.authentication.IAuthenticator;
import pl.camp.micro.car.rent.database.CarRepository;
import pl.camp.micro.car.rent.database.ICarRepository;
import pl.camp.micro.car.rent.gui.GUI;
import pl.camp.micro.car.rent.gui.GUIv2;
import pl.camp.micro.car.rent.gui.IGUI;

import java.util.Optional;

@Component
public class Engine {

    //private static final Engine instance = new Engine();
    @Autowired
    private ICarRepository carRepository;
    @Autowired
    private final IGUI gui;
    @Autowired
    private IAuthenticator authenticator;

    /*private Engine() {
    }*/

    public Engine(IGUI gui) {
        this.gui = gui;
    }

    public void start() {
        int loginCounter = 0;
        String choose = "3";
        while(loginCounter < 3 && choose.equals("3")) {
            choose = authenticator.authenticate(gui.loginInput()) ? "" : "3";
            loginCounter++;
        }


        while (!choose.equals("3")) {
            choose = gui.showMenu();
            switch (choose) {
                case "1":
                    gui.listCars(carRepository.getCars());
                    break;
                case "2":
                    gui.showRentResult(carRepository.rentCar(gui.plateInput()));
                    break;
                case "3":
                    break;

                default:
                    System.out.println("Wrong choose !!");
                    break;
            }
        }
    }

    /*public static Engine getInstance() {
        return instance;
    }*/
}
