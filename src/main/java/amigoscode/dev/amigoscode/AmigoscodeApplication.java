package amigoscode.dev.amigoscode;

import amigoscode.dev.amigoscode.Entity.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class AmigoscodeApplication {
	@GetMapping("/")
	public List<Student> hello(){
		return List.of(new Student( 1L, "dfd", 12, LocalDate.of(2000, Month.JANUARY,5), "binh@gmail.com"));
	}
	public static void main(String[] args) {
		SpringApplication.run(AmigoscodeApplication.class, args);
	}

}
