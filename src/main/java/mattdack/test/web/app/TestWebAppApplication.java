package mattdack.test.web.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestWebAppApplication {

	@Bean
	public UserStore userStore() {
		return new UserStore();
	}

	public static void main(String[] args) {
		SpringApplication.run(TestWebAppApplication.class, args);
	}

}
