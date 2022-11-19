package pl.camp.micro.car.rent.database;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import pl.camp.micro.car.rent.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository implements IUserRepository {
    private final List<User> users = new ArrayList<>();
    //private final static UserRepository instance = new UserRepository();

    /*private UserRepository() {
        this.users.add(new User("admin", "5ab58eb03c599ea617a3ebc2e5ca9a71"));
        this.users.add(new User("mateusz", "7b0e5cd441108e1dd31219678385aab7"));
    }*/

    public UserRepository() {
        this.users.add(new User("admin", "5ab58eb03c599ea617a3ebc2e5ca9a71"));
        this.users.add(new User("mateusz", "7b0e5cd441108e1dd31219678385aab7"));
    }

    public Optional<User> getUserByLogin(String login) {
        for(User user : this.users) {
            if(user.getLogin().equals(login)) {
                return Optional.of(user);
            }
        }

        return Optional.empty();
    }

    public List<User> getUsers() {
        return users;
    }

    /*public static UserRepository getInstance() {
        return instance;
    }*/
}
