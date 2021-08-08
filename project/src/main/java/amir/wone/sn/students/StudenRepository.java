package amir.wone.sn.students;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudenRepository extends JpaRepository<Student, Long> {

    @Query("SELECT s FROM Student s WHERE s.email = ?1")
    Optional<Student> findStudentByEmail(String email);

//    @Query("SELECT s FROM Student s WHERE s.id = ?1")
//    Optional<Student> findStudentById(Long id);

//    @Query("UPDATE Student s SET email = s. WHERE s.id = ?1")
//    Optional<Student> updateStudentById(Long id);
}
