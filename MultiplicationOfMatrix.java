package matrixPrograms;

public class MultiplicationOfMatrix {


	public static void main(String args[]) {
	//creating two new matrix
			  //0 1 2	
	int a[][]={{1,3,4},  //0
			   {2,4,3},  //1
			   {3,4,5}}; //2
	
	int b[][]={{1,3,4},
			   {2,4,3},
			   {1,2,4}};

	
	//creating new matrix to store sum of above 2 matrix
	int c [][] = new int[3][3];
	
	
	for(int i=0; i<3; i++) {
		for(int j=0; j<3; j++) {
			
			c[i][j] = a[i][j] * b[i][j];
			System.out.print(c[i][j] + " ");
		}
		System.out.println(); // new line
	}
	
	
	
	}
}
