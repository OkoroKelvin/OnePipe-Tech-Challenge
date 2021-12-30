package com.kelvin.onepipechallenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class OnePipeChallengeApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnePipeChallengeApplication.class, args);
    }

}
