package pl.camp.micro.car.rent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.camp.micro.car.rent.configuration.AppConfiguration;

public class Main {
    public static void main(String[] args) {
        ApplicationContext pudeleczko =
                new AnnotationConfigApplicationContext(AppConfiguration.class);
        Engine engine = pudeleczko.getBean(Engine.class);
        engine.start();
    }
}
