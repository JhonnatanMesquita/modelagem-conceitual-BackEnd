package me.jhonnatanmesquita.mcspringbackend;

import me.jhonnatanmesquita.mcspringbackend.services.S3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class McSpringBackendApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(McSpringBackendApplication.class, args);
    }

    @Override
    public void run (String... args) throws Exception{
    }
}
