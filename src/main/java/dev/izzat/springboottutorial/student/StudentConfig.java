package dev.izzat.springboottutorial.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository studentRepository
    ) {
        return args -> {
          Student alex = new Student(
                  "Alex",
                  "alex@gmail.com",
                  LocalDate.of(2000, Month.APRIL, 23)
          );

          Student misha = new Student(
                  "Misha",
                  "misha@gmail.com",
                  LocalDate.of(1993, Month.AUGUST, 21)
          );

          studentRepository.saveAll(List.of(alex, misha));
        };
    }
}
