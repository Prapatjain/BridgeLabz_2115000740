public class Circle {
    private double radius;
    Circle(double radius){
        this.radius= radius;
    }
    double calculateArea()
    {
        final double PI = 3.14;
        double area = PI*radius*radius;
        return area;
    }
    double calculateCircumference(){
        final double PI = 3.14;
        double circumference = 2*PI*radius;
        return circumference;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    public double getRadius()
    {
        return this.radius;
    }
    void displayDetails(){
        System.out.println("Area of circle: "+ calculateArea());
        System.out.println("circumference of circle: "+calculateCircumference());
    }
}
