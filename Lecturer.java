import java.util.ArrayList;

class Lecturer {

  private static int count = 0;
  private int id;
  private final String name;
  private ArrayList<Course> courses = new ArrayList<>();
  
  public Lecturer(String name) {
    this.id = ++count;
    this.name = name;
  }
  
  public int getId() {
    return this.id;
  }
  
  public String getName() {
    return name;
  }
  
  public void addCourse(Course course) {
    courses.add(course);
  }
  
  public ArrayList<Course> getCourses() {
    return courses;
  }

}
