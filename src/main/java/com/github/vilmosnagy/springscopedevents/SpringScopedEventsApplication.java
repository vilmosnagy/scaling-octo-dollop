package com.github.vilmosnagy.springscopedevents;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;

@EnableScheduling
@SpringBootApplication
public class SpringScopedEventsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringScopedEventsApplication.class, args);
    }

}
