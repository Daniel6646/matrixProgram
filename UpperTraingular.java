package matrixPrograms;

public class UpperTraingular {
  
	    public static void main(String[] args) {    
	        int rows, cols;    
	            
	        //Initialize matrix a    
	        int a[][] = {       
	                        {1, 2, 3},   // 0,0 0,1 0,2 			 		
	                        {8, 6, 4},    // 1,0 1,1 1,2
	                        {4, 5, 6}    //2,0 2,1 2,2
	                    };    
	              
	          //Calculates number of rows and columns present in given matrix    
	          rows = a.length;    
	        cols = a[0].length;    
	            
	        if(rows != cols){    
	            System.out.println("Matrix should be a square matrix");    
	        }    
	        else {    
	            //Performs required operation to convert given matrix into upper triangular matrix    
	            System.out.println("Upper triangular matrix: ");    
	            for(int i = 0; i < rows; i++){    
	                for(int j = 0; j < cols; j++){    
	                  if(i > j)   //1>0 print 0.1>1 no so a[]i[j] not the value of a[]i[j] but the value of i and j 
	                    System.out.print("0 ");    
	                  else    
	                    System.out.print(a[i][j] + " ");    
	                }    
	                System.out.println();    
	            }    
	        }    
	    }    
	}    