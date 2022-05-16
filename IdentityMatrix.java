package matrixPrograms;

public class IdentityMatrix {
 
	public static void main(String args[]) {
		
		int row,col;
		boolean flag = true;
		
		int a[][] = {
				{1,0,0},
				{0,1,0},
				{0,0,1} //an identity matrix
			
				
		};
		
		row = a.length;
		col = a[0].length;
		
		
		if(row != col) {
			
			System.out.println("Following matrix is not a square matrix");
			
		}
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				if(i==j && a[i][j] != 1) {
					flag = false;
					break;
				}
				
				if(i != j && a[i][j] != 0) {
					flag =false;
					break;
					
				}
			}
		}
		
		if(flag) {
			
			System.out.println("This is a identity matrix ");
			
		}
		
		else {
			
			System.out.println("This is not a identity matrix");
		}
		
		}
		
	}
