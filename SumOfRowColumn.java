package matrixPrograms;

public class SumOfRowColumn {
	
	public static void main(String args[]) {
		
		int row,col,columnSum,rowSum;
		
		int a[][] = {       
                {1, 2, 3},    
                {4, 5, 6},    
                {7, 8, 9}    
            };    
		
		row = a.length;
		col = a[0].length;
		
		
		for(int i=0; i<row; i++) {
			rowSum =0;
			for(int j=0; j<col; j++) {
			rowSum =rowSum + a[i][j];
		}
			System.out.println("Sum of " + (i+1) +" row " + rowSum);
	 }
		
		for(int i=0;i<col; i++) {
			columnSum =0;
			for(int j=0; j<row; j++ ) {
				columnSum = columnSum +a[j][i];
			}
		System.out.println("Sum of " + (i+1) +" column " +columnSum);		
		}
   }

}
