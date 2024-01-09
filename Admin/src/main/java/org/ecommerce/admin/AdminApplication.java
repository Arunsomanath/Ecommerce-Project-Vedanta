package org.ecommerce.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"org.ecommerce.library.*", "org.ecommerce.admin.*"})
@EnableJpaRepositories(value = "org.ecommerce.library.repository")
@EntityScan(value = "org.ecommerce.library.model")
public class AdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }

}
