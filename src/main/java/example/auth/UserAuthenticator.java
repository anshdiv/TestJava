package example.auth;

import example.core.models.User;
import io.dropwizard.auth.AuthenticationException;
import io.dropwizard.auth.Authenticator;
import io.dropwizard.auth.basic.BasicCredentials;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UserAuthenticator implements Authenticator<BasicCredentials, User> {

   private static final List<User> user;
    static {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("anshul","secret","ADMIN"));
        users.add(new User("demo","demo","USER"));
        user=users;
    }

    @Override
    public Optional<User> authenticate(BasicCredentials basicCredentials) throws AuthenticationException {
        try {
            return Optional.of(user.stream().filter(user1 -> user1.getUserName().equals(basicCredentials.getUsername())  && user1.getPassword().equals(basicCredentials.getPassword() )).limit(1).collect(Collectors.toList()).get(0));
        }catch (IndexOutOfBoundsException exception){
            return Optional.empty();
        }
    }
}
