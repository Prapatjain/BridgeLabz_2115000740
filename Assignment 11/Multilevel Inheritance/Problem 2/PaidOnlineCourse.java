
public class PaidOnlineCourse extends OnlineCourse {
    int fee;
    double discount;
    PaidOnlineCourse(String courseName, double duration, String platform, boolean isRecorded, int fee, double discount){
        super(courseName, duration, platform, isRecorded);
        this.fee= fee;
        this.discount=discount;
    }
    @Override
    void display(){
        super.display();
        System.out.println("\nCourse Fee: "+fee+"\n Special discount: "+ discount);
    }
}
