package amigoscode.dev.amigoscode.Repositories;

import amigoscode.dev.amigoscode.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
