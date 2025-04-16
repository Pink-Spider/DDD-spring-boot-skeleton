package io.pinkspider.dddspringbootskeleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"api", "application", "domain", "infrastructure", "common", "config"})
public class DddSpringBootSkeletonApplication {

    public static void main(String[] args) {
        SpringApplication.run(DddSpringBootSkeletonApplication.class, args);
    }

}
