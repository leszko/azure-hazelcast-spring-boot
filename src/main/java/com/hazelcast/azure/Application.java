package com.hazelcast.azure;

import com.hazelcast.config.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    private static Config config;

//    @Bean
//    public Config config() {
//        return new Config();
//    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
