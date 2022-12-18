package amigoscode.dev.amigoscode.Student;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "student_sequence")
    @SequenceGenerator(
        name = "student_sequence",
        sequenceName = "student_sequence",
        allocationSize = 1
    )
    private Long id;
    private String name;
    //@transient là 1 'khoản khác' và nó chỉ chạy khi ta gọi Geter(), ta sẽ remove this.age trong constructor

    @Transient //Đây là 1 anotaion rất hay, tuổi là 1 trường có thể thay đổi theo thời gian, nếu ta lưu tuổi xuống database thì rất xàm, nên ta sẽ khoong lưu tuổi xuống đó
    private Integer age;
    private LocalDate dob;
    private String email;
    public Student() {
    }
    public Student(Long id, String name,  LocalDate dob, String email) {
        this.id = id;
        this.name = name;
       // this.age = age; @Transient không cho phép setter()
        this.dob = dob;
        this.email = email;
    }

    public Student(String name, LocalDate dob, String email) {
        this.name = name;
        //this.age = age;
        this.dob = dob;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   // public Integer getAge() { // mình sẽ ko getAge từ đối tượng đơn giản như vậy nữa, vì age không được lưu trong database neen mình không theer return age dc
     //   return age;
   // }
    //Mình sẽ sử dụng đối tượng Period
    public Integer getAge() { // mình sẽ ko getAge từ đối tượng đơn giản như vậy nữa, vì age không được lưu trong database neen mình không theer return age dc
      return Period.between(this.dob, LocalDate.now()).getYears();
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                '}';
    }
}
