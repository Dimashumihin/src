import java.util.*;

class Main {

    public static void main(String[] args) {
        Institution institution = new Institution("Институт", "г. Город");

        institution.addCourse(new Course("Физика"));
        institution.addCourse(new Course("Математика"));
        institution.addCourse(new Course("Информатика"));

        institution.addLecturer(new Lecturer("Физик"));
        institution.addLecturer(new Lecturer("Математик"));
        institution.addLecturer(new Lecturer("Информатик Петренко Вениамин Фёдорович"));

        institution.addStudent(new Student("Иванов Иван Иванович"));
        institution.addStudent(new Student("Петров Петр Петрович"));
        institution.addStudent(new Student("Сидоров Сидор Сидорович"));

        for (int i = 1; i < 4; i++) {
            new LecturerForCourseAssigner(institution.getLecturer(i), institution.getCourse(i)).assign();
            for (int j = 1; j < 4; j++) {
                new StudentForCourseAssigner(institution.getStudent(j), institution.getCourse(i)).assign();
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
    }

}