package amir.wone.sn.students;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String firstName;
    private String email;
    private LocalDate bob;
    private int age;

    public Student() {
    }

    public Student(String name, String firstName, String email, LocalDate bob, int age) {
        this.name = name;
        this.firstName = firstName;
        this.email = email;
        this.bob = bob;
        this.age = age;
    }

    public Student(Long id, String name, String firstName, String email, LocalDate bob, int age) {
        this.id = id;
        this.name = name;
        this.firstName = firstName;
        this.email = email;
        this.bob = bob;
        this.age = age;
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
        return age;
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
}
