package pratice;

public class MatrixMultiplication {
	
	public static void main(String[] args)
	{
		int a[][]={{1,3,4},{6,4,2},{8,6,4}};    
		int b[][]={{1,5,4},{5,3,1},{7,5,3}};    
		    
		int c[][]=new int[3][3];  //3 rows and 3 columns  
		    
		//multiplying and printing multiplication of 2 matrices  
		
		for(int i=0;i<3;i++)
		{    
		for(int j=0;j<3;j++){    
		c[i][j]=0;      
		for(int k=0;k<3;k++)      
		{      
		c[i][j]+=a[i][k]*b[k][j];      
		}//end of k loop  
		
		System.out.print(c[i][j]+" "); 
		}//end of j loop 
		
		System.out.println();//new line    
		}    
		}
		
	}


