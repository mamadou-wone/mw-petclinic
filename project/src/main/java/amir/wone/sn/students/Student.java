package amir.wone.sn.students;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Student {

    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String firstName;
    private String email;
    private LocalDate bob;

    @Transient
    private int age;

    public Student() {
    }

    public Student(Long id, String name, String firstName, String email, LocalDate bob) {
        this.id = id;
        this.name = name;
        this.firstName = firstName;
        this.email = email;
        this.bob = bob;
    }

    public Student(String name, String firstName, String email, LocalDate bob) {
        this.name = name;
        this.firstName = firstName;
        this.email = email;
        this.bob = bob;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBob() {
        return bob;
    }

    public void setBob(LocalDate bob) {
        this.bob = bob;
    }

    public int getAge() {
        return Period.between(this.bob, LocalDate.now()).getYears();
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", bob=" + bob +
                ", age=" + age +
                '}';
    }

    public static int getAge(LocalDate dob){
        return LocalDate.now().getYear() - dob.getYear();
    }

}
