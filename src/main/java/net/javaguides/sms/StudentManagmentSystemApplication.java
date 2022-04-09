package net.javaguides.sms;

import net.javaguides.sms.entity.Student;
import net.javaguides.sms.repositore.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagmentSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagmentSystemApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public void run(String... args) throws Exception {
       /* Student student1 = new Student("Maxim", "Mur","maxim.mur@mail.ru");
        studentRepository.save(student1);

        Student student2 = new Student("Alex", "Mar","Alex@mail.ru");
        studentRepository.save(student2);

        Student student3 = new Student("Vlad", "Pes","pes@mail.ru");
        studentRepository.save(student3);
        */

    }
}
