package matrixPrograms;

public class OddEvenNoMatrix {

	public static void main(String args[]) {
		
		int rows,cols,evenCount =0, oddCount =0;
		
		 int a[][] = {       
                 {4, 1, 3},    
                 {3, 5, 7},    
                 {8, 2, 6}    
             }; 
		 
		 rows =a.length;
		 cols = a[0].length;
		 
		 for(int i=0; i<rows;i++) {
			 for(int j=0; j<cols; j++) {
				 if(a[i][j] % 2 ==0) 
					 evenCount++;
					 else 
						 oddCount++; 	 
		}	 
	 }
		 
		 System.out.println("Frequency of even number in matrix: " +evenCount);
		 System.out.println("Frequency of Odd number in matrix: " +oddCount);
   }
}