package mattdack.test.web.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

    @GetMapping("/")
    public String index() {
        LOGGER.info("Hit that index real good");
        return "Silence";
    }
}
