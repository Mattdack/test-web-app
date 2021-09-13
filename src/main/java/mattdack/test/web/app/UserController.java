package mattdack.test.web.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/user")
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    private final UserStore store;

    public UserController(UserStore store) {
        this.store = store;
    }

    @GetMapping("/age")
    public ResponseEntity<Integer> getAge(@RequestParam("username") String username) {
        //final Optional<Integer> maybeAge = store.getAge(username);
//        if(maybeAge.isEmpty()) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        } else {
//            return ResponseEntity.ok(maybeAge.get());
//        }
        LOGGER.info("Getting age for: " + username);
        return ResponseEntity.of(store.getAge(username));
    }
    @PostMapping("/age")
    public ResponseEntity setAge(@RequestParam("username") String username, @RequestParam("age") int age) {
        LOGGER.info("Trying to create: " + username + " and set the age to: " + age);
        store.setUser(username, age);
        return ResponseEntity.ok().build();
    }
}
