public class VolOfEarth {
    public static void main(String[] args) {
        int r = 6378;
        final double PI= 3.14159;
        double vol=((double)4/3)*PI*r*r*r;
        double miles = (double)6378/(1.6);
        double volInMiles=((double)4/3)*PI*miles*miles*miles;
        System.out.println(" The volume of earth in cubic kilometers is "+vol+" and cubic miles is "+volInMiles);
    }
}
