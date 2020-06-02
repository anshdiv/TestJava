package example.auth;

import example.core.models.User;
import io.dropwizard.auth.AuthenticationException;
import io.dropwizard.auth.Authenticator;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OAuthUserAuthenticator implements Authenticator<String, User> {

    private static final List<User> user;
    static {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("anshul","abcdefgh","ADMIN"));
        users.add(new User("demo","xyzdef","USER"));
        user=users;
    }

    @Override
    public Optional<User> authenticate(String authToken) throws AuthenticationException {
        try {
            return Optional.of(user.stream().filter(user1 -> user1.getPassword().equals(authToken)).limit(1).collect(Collectors.toList()).get(0));
        }catch (IndexOutOfBoundsException exception){
            return Optional.empty();
        }
    }
}
