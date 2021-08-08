package amir.wone.sn.students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class StudentService {

    private final StudenRepository studenRepository;

    @Autowired
    public StudentService(StudenRepository studenRepository) {
        this.studenRepository = studenRepository;
    }

    public List<Student> getStudents(){
        return studenRepository.findAll();
    }

    public void addNewStudent(Student student) {
        Optional<Student> studentOptional =  studenRepository.findStudentByEmail(student.getEmail());
        if(studentOptional.isPresent()){
            throw new IllegalStateException("Email tal=ken");
        }
        studenRepository.save(student);
    }

    public void deleteStudent(Long studentId){
        boolean exist = studenRepository.existsById(studentId);
        if(!exist){
            throw new IllegalStateException("Student with id " + studentId +" does not exist");
        }
        studenRepository.deleteById(studentId);
    }

    @Transactional
    public void updateStudent(Long studentId, String email, String name){
        Student student= studenRepository.findById(studentId)
                .orElseThrow(() -> new IllegalStateException(
                        "Student with id " + studentId + " does not exist !"
                ));
        if(name != null && name.length() > 0 && !Objects.equals(student.getName(), name)){
            student.setName(name);
        }

        if(email != null && email.length() > 0 && !Objects.equals(student.getEmail(), email)){
            Optional<Student> studentOptional =  studenRepository.findStudentByEmail(student.getEmail());
            if(studentOptional.isPresent()){
                throw new IllegalStateException("email taken");
            }
            student.setEmail(email);
        }
        studenRepository.save(student);
    }
}
