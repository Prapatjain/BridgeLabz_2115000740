import java.util.*;
class Q9_TwoDArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int columns = sc.nextInt();
		int[][] matrix = new int[rows][columns];
		int[] array = new int[rows*columns];
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++)
				matrix[i][j] = sc.nextInt();
		}
		int index = 0;
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++)
				array[index++] = matrix[i][j];
		}
	}
}