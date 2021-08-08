package amir.wone.sn.students;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudenRepository repository){
        return args -> {
            Student amir = new Student(
                    "WONE",
                    "Mamadou",
                    "wone@amir.com",
                    LocalDate.of(2004, Month.DECEMBER, 20));

            Student maye = new Student(
                    "WONE",
                    "Maye",
                    "maye@amir.com",
                    LocalDate.of(1999, Month.AUGUST, 31));
            repository.saveAll(
                    List.of(amir, maye)
            );
        };

    }

}

