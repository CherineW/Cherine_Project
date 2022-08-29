package Services;

import java.util.List;

import Model.Student;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentByIdStudent(Long id);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);
    
}
