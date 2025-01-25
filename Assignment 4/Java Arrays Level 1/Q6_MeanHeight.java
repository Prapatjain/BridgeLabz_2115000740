import java.util.*;
class Q6_MeanHeight{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double[] heights = new double[11];
		for(int i=0;i<heights.length;i++)
			heights[i] = sc.nextDouble();
		double meanHeight = 0.0d;
		for(int i=0;i<heights.length;i++)
			meanHeight += heights[i];
		meanHeight = meanHeight/11;
		System.out.println("Mean Height is : "+meanHeight);
	}
}