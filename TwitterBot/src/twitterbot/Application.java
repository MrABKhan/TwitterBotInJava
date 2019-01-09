package twitterbot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import static org.springframework.boot.SpringApplication.*;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        run(Application.class, args);
    }


    @Bean
    public void commandLineRunner() {


    }

}
