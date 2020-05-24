class StudentForCourseAssigner {

    private Student student;
    private Course course;

    public StudentForCourseAssigner(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public void assign() {
        student.addCourse(course);
        course.addStudent(student);
    }

}