package gaddam1987.github.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan(basePackages = {"gaddam1987.github.config"})
@RestController
public class ConfigClientV1Application {

	public static void main(String[] args) {
		System.setProperty("spring.profiles.active", "st1");
		ConfigurableApplicationContext context = SpringApplication.run(ConfigClientV1Application.class, args);
		String value = context.getEnvironment().getProperty("key");
		System.out.println("value from config server is :: "+ value);
		String a = context.getEnvironment().getProperty("key-common");
		System.out.println("a from config server is :: "+ a);
		String extra = context.getEnvironment().getProperty("key-extra");
		System.out.println("extra from config server is :: "+ extra);
		String app = context.getEnvironment().getProperty("key-app");
		System.out.println("app from config server is :: "+ app);
	}


}


