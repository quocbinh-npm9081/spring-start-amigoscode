package amigoscode.dev.amigoscode.Services;

import amigoscode.dev.amigoscode.Entity.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public StudentService() {
    }

    public List<Student> getStudents(){
        return List.of(new Student( 1L, "dfd", 12, LocalDate.of(2000, Month.JANUARY,5), "binh@gmail.com"));
    }
}
