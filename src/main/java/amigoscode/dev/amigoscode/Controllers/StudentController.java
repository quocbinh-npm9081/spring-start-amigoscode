package amigoscode.dev.amigoscode.Controllers;

import amigoscode.dev.amigoscode.Entity.Student;
import amigoscode.dev.amigoscode.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/")
public class StudentController {
    // we dont use new key when we use @autowired
    //private final StudentService studentService = new StudentService();
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService =  studentService;
    }
    @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

}
