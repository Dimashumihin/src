import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;

class Main {

  public static void main(String[] args) throws IOException {
    Charset charset = Charset.forName("UTF-8");
    String studentsFileName = "res/students.txt";
    List<String> studentsNames = Files.readAllLines(Paths.get(studentsFileName), charset);
    
    Institution institution = new Institution("Институт", "г. Город");
    
    studentsNames.forEach(name -> institution.addStudent(new Student(name)));
    
    
    institution.addCourse(new Course("Химия"));
    institution.addCourse(new Course("Теория вероятности"));
    institution.addCourse(new Course("Программирование"));

    institution.addLecturer(new Lecturer("Химик"));
    institution.addLecturer(new Lecturer("Логинова"));
    institution.addLecturer(new Lecturer("Программист"));

    institution.addStudent(new Student("Корчагин Максим Юрьевич"));
    institution.addStudent(new Student("Петров Петр Петрович"));
    institution.addStudent(new Student("Сидоров Сидор Сидорович"));
      }
    }

    Student s = institution.getStudent(1);
    System.out.println();
    System.out.println(s.getName() + " изучает предметы:");
    s.getCourses().forEach(c -> System.out.println(c.getName()));

    System.out.println("\nпредмет " + institution.getCourse(1).getName() + " изучают:\n");
    institution.getCourse(1).getStudents().forEach(st -> System.out.println(st.getName()));
    
    System.out.println("\nпредмет " + institution.getCourse(3).getName() + " ведёт:");
    System.out.println(institution.getCourse(3).getLecturer().getName());
    
    institution.getCourse(3).assignLecturer(institution.getLecturer(3));
    
  }
}
