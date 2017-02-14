package config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableConfigServer
@EnableAutoConfiguration
@ComponentScan(basePackages = {"org.springframework.cloud", "config", "monitor"})
public class ConfigServer {
    public static void main(String[] args) {
        System.setProperty("spring.profiles.active","st1");
        SpringApplication.run(ConfigServer.class, args);
    }
}


