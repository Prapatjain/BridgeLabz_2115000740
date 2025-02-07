
public class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;
    OnlineCourse(String courseName, double duration, String platform, boolean isRecorded){
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded=isRecorded;
    }
    @Override
    void display(){
        super.display();
        System.out.println("\nPlatform= "+platform+"\n Recorded or Not= "+isRecorded);
    }
}
