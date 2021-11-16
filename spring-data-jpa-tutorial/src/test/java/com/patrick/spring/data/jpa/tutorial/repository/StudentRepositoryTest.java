package com.patrick.spring.data.jpa.tutorial.repository;

import com.patrick.spring.data.jpa.tutorial.entity.Guardian;
import com.patrick.spring.data.jpa.tutorial.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent() {
        Student student = Student.builder()
                .emailId("hawkeggg1@gmail.com")
                .firstName("Hawes")
                .lastName("Potter")
                //.guardianName("Harry")
                //.guardianEmail("harry@gmail.com")
                //.guardianMobile("1234567890")
                .build();

        studentRepository.save(student);
    }

    @Test
    public void saveStudentWithGuardian() {

        Guardian guardian = Guardian.builder()
                .email("dsf")
                .name("dsf")
                .mobile("123456789")
                .build();

        Student student = Student.builder()
                .firstName("Harry")
                .lastName("Potter")
                .emailId("sdf")
                .guardian(guardian)
                .build();

        studentRepository.save(student);
    }

    @Test
    public void printAllStudents() {
        List<Student> studentList = studentRepository.findAll();

        System.out.println("Student List: " + studentList);
    }

    @Test
    public void printStudentByFirstName() {
        List<Student> studentList = studentRepository.findByFirstName("Harry");
        System.out.println("Student List: " + studentList);
    }

    @Test
    public void printStudentByFirstNameContaining() {
        List<Student> studentList = studentRepository.findByFirstNameContaining("Harry");
        System.out.println("Student List: " + studentList);
    }

    @Test
    public void printStudentBasedOnGuardian() {
        List<Student> studentList = studentRepository.findByGuardianName("Harry");
        System.out.println("Student List: " + studentList);
    }

    @Test
    public void printStudentByEmailAddress() {
        Student student = studentRepository.getStudentByEmailAddress("dsdf");
        System.out.println("Student: " + student);
    }

    @Test
    public void printgetStudentFirstNameByEmailAddress() {
        String firstName = studentRepository.getStudentFirstnameByEmailAddress("dsdf");
        System.out.println("Student First Name: " + firstName);
    }

    @Test
    public void printgetStudentByEmailAddressNative() {
        Student student = studentRepository.getStudentByEmailAddressNative("dsdf");
        System.out.println("Student Last Name: " + student);
    }

    @Test
    public void printgetStudentByEmailAddressNamedParam(){
        Student student = studentRepository.getStudentByEmailAddressNativeNamedParam("dsdf");

        System.out.println("Student Last Name: " + student);
    }

    @Test
    public void updateStudentNameByEmailIdTest(){
        studentRepository.updateStudentNameByEmailId("dsdf", "Harry"); }
}
