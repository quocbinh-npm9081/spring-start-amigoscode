package amigoscode.dev.amigoscode.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student binh = new Student("binhcao", LocalDate.of(2010, Month.JANUARY, 14), "binh@gmail.com");
            Student an = new Student("ancao",  LocalDate.of(2001, Month.JANUARY, 14), "an@gmail.com");
            repository.saveAll(List.of(binh, an));
        };
    }
}
