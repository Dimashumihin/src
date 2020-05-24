import java.util.ArrayList;

class Institution {

  private String name;
  private String address;
  private ArrayList<Student> students = new ArrayList<>();
  private ArrayList<Lecturer> lecturers = new ArrayList<>();
  private ArrayList<Course> courses = new ArrayList<>();

  public Institution(String name, String address) {
    this.name = name;
    this.address = address;
  }

  public String getName() {
    return this.name;
  }

  public String getAddress() {
    return this.address;
  }

  public void addCourse(Course course) {
    courses.add(course);
  }

  public void addStudent(Student student) {
    students.add(student);
  }

  public void addLecturer(Lecturer lecturer) {
    lecturers.add(lecturer);
  }

  public Course getCourse(String name) {
    return courses.stream().filter(c -> c.getName().equals(name)).findFirst().get();
  }

  public Course getCourse(int id) {
    return courses.stream().filter(c -> c.getId() == id).findFirst().get();
  }

  public ArrayList<Course> getAllCourses() {
    return this.courses;
  }

  public Student getStudent(int id) {
    return students.stream().filter(s -> s.getId() == id).findFirst().get();
  }

  public ArrayList<Student> getAllStudents() {
    return students;
  }

  public Lecturer getLecturer(int id) {
    return lecturers.stream().filter(l -> l.getId() == id).findFirst().get();
  }

  public ArrayList<Lecturer> getAllLecturers() {
    return lecturers;
  }
}
