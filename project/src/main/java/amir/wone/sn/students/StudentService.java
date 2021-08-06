package amir.wone.sn.students;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student("WONE",
                        "Mamadou",
                        "wone@amir.com",
                        LocalDate.of(1999, Month.DECEMBER, 20),
                        21)
        );
    }
}
