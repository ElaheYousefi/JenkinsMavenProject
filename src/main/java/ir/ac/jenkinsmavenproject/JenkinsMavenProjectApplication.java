package ir.ac.jenkinsmavenproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsMavenProjectApplication {

    public static void main(String[] args) {

        SpringApplication.run(JenkinsMavenProjectApplication.class, args);
        System.out.println("hello world");
    }

}
