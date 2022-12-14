package amigoscode.dev.amigoscode.Controllers;

import amigoscode.dev.amigoscode.Entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "/")
public class StudentController {
    @GetMapping
    public List<Student> getStudents(){
        return List.of(new Student( 1L, "dfd", 12, LocalDate.of(2000, Month.JANUARY,5), "binh@gmail.com"));
    }

}