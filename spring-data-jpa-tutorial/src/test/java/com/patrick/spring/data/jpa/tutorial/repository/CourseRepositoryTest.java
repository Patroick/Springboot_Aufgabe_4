package com.patrick.spring.data.jpa.tutorial.repository;

import com.patrick.spring.data.jpa.tutorial.entity.Course;
import com.patrick.spring.data.jpa.tutorial.entity.Student;
import com.patrick.spring.data.jpa.tutorial.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

@SpringBootTest
class CourseRepositoryTest {

    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void printCourses() {
        List<Course> courses = courseRepository.findAll();
        System.out.println("courses: " + courses);
    }

    @Test
    public void saveCourseWithTeacher(){

        Teacher teacher = Teacher.builder().firstName("Patrick").lastName("sdf").build();

        Course course = Course.builder()
                .title("Spring Boot")
                .credit(5)
                .teacher(teacher)
                .build();

        courseRepository.save(course);
    }

    @Test
    public void findAllPagination(){
        Pageable firstPagewithThreeRecords = PageRequest.of(0, 3);
        Pageable secondPagewithTwoRecords = PageRequest.of(1, 2);

        List<Course> courses = courseRepository.findAll(firstPagewithThreeRecords).getContent();

        Long totalElement = courseRepository.findAll(firstPagewithThreeRecords).getTotalElements();

        int totalPages = courseRepository.findAll(firstPagewithThreeRecords).getTotalPages();

        System.out.println("totaPages" + totalPages);

        System.out.println("totalElement" + totalElement);

        System.out.println("courses: " + courses);
    }

    @Test
    public void findAllSorting(){
        Pageable sortByTitle = PageRequest.of(0, 3, Sort.by("title"));
        Pageable sortByCreditDesc = PageRequest.of(0, 3, Sort.by("credit").descending());
        Pageable sortByTitleAndCredit = PageRequest.of(0, 3, Sort.by("title", "credit"));

        List<Course> courses = courseRepository.findAll(sortByTitle).getContent();
        System.out.println("courses: " + courses);
    }

    @Test
    public void printfindByTitleContaining() {
        Pageable firstPageTenRecords = PageRequest.of(0, 10);

        List<Course> courses = courseRepository.findByTitleContaining("Spring", firstPageTenRecords).getContent();

        System.out.println("courses: " + courses);
    }

    @Test
    public void saveCourseWithStudentAndTeacher(){

        Teacher teacher = Teacher.builder().firstName("Patsrick").lastName("ssdf").build();

        Student student = Student.builder().firstName("ricsk").lastName("sdf").emailId("sdfsdfsd").build();

        Course course = Course.builder().title("AaI").credit(12).teacher(teacher).build();

        course.addStudents(student);

        courseRepository.save(course);
    }
}