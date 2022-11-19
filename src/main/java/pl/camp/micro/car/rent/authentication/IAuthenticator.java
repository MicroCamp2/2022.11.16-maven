package pl.camp.micro.car.rent.authentication;

import pl.camp.micro.car.rent.model.User;

public interface IAuthenticator {
    boolean authenticate(User user);
}
