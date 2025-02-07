
public class Course {
    String courseName ;
    double duration;
    Course(String courseName, double duration){
        this.courseName = courseName;
        this.duration = duration;
    }
    void display(){
        System.out.println("Course details:\n course name= "+courseName+"\nduration= "+duration);
    }
}
