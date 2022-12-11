package amigoscode.dev.amigoscode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class AmigoscodeApplication {
	@GetMapping("/")
	public List<String> hello(){
		return List.of("Hello", "World");
	}
	public static void main(String[] args) {
		SpringApplication.run(AmigoscodeApplication.class, args);
	}

}
