package mattdack.test.web.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UserStore {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserStore.class);

    private final List<String> usernames;
    private final List<Integer> ages;

    public UserStore() {
        this.usernames = new ArrayList<>();
        this.ages = new ArrayList<>();
    }

    public Optional<Integer> getAge(String username) {
        int userIndex = usernames.indexOf(username);
        LOGGER.info("Got Index: " + userIndex + " from usernames: " + usernames + " for user: " + username);
        if(userIndex == -1) {
            return Optional.empty();
        } else {
            return Optional.of(ages.get(userIndex));
        }

//        return Optional.of(usernames.indexOf(username))
//                .filter(index -> index >= 0)
//                .map(ages::get);
    }

    public void setUser(String username, int age) {

        int userIndex = usernames.indexOf(username);
        if(userIndex == -1) {
            usernames.add(username);
            ages.add(age);
        } else {
            ages.set(userIndex, age);
        }
    }

}
