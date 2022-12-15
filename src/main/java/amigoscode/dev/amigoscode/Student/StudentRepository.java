package amigoscode.dev.amigoscode.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // anatation giup ta ho tro CURD
public interface StudentRepository extends JpaRepository<Student, Long> {
}
