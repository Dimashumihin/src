class LecturerForCourseAssigner {

    private Lecturer lecturer;
    private Course course;

    public LecturerForCourseAssigner(Lecturer lecturer, Course course) {
        this.lecturer = lecturer;
        this.course = course;
    }

    public void assign() {
        lecturer.addCourse(course);
        course.assignLecturer(lecturer);
    }

}