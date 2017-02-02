package gaddam1987.github.config;

import gaddam1987.github.config.monitor.EnvironmentMonitorAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.config.server.environment.AbstractScmEnvironmentRepository;
import org.springframework.cloud.config.server.environment.NativeEnvironmentRepository;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableConfigServer
@Import(EnvironmentMonitorAutoConfiguration.class)
public class ConfigServer {
    public static void main(String[] args) {
        final ConfigurableApplicationContext run = SpringApplication.run(ConfigServer.class, args);
        //final AbstractScmEnvironmentRepository bean = run.getBean(AbstractScmEnvironmentRepository.class);
        final NativeEnvironmentRepository bean1 = run.getBean(NativeEnvironmentRepository.class);
        //System.out.println(bean);
        System.out.println(bean1);
    }
}

