package io.xrio.basicgraphql;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class BasicGraphqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasicGraphqlApplication.class, args);
    }


    @Bean
    ApplicationRunner applicationRunner(StudentRepository studentRepository, SchoolRepository schoolRepository) {
        return args -> {
            School school1 = schoolRepository.save(new School("J.P. Wynne High School"));
            School school2 = schoolRepository.save(new School("Bel-Air Academy"));
            School school3 = schoolRepository.save(new School("Hawkins Middle School"));

            studentRepository.saveAll(List.of(
                    new Student("white Jr", "white.jr@email.com", school1),
                    new Student("Heisenberg Jr", "heisenberg.jr@email.com", school1),

                    new Student("Will", "will@email.com", school2),
                    new Student("Carlton Banks", "carlton.banks@email.com", school2),

                    new Student("Mike Wheeler", "mike.wheeler@email.com", school3),
                    new Student("Eleven", "eleven@email.com", school3),
                    new Student("Will Byers", "will.byers@email.com", school3),
                    new Student("Dustin Henderson", "dustin.henderson@email.com", school3)

            ));

        };
    }


}
