package gaddam1987.github.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ConfigClientV2Application {

	public static void main(String[] args) {
		System.setProperty("spring.profiles.active", "st1");
		ConfigurableApplicationContext context = SpringApplication.run(ConfigClientV2Application.class, args);
		String value = context.getEnvironment().getProperty("key");
		System.out.println("value from config server is :: "+ value);
		String a = context.getEnvironment().getProperty("key-common");
		System.out.println("a from config server is :: "+ a);
	}
}
