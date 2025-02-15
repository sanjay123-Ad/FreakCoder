/*The program must accept a matrix of size R*C as the input. The matrix contains alphabets and integers. The program must replace each 3*3 submatrix having an alphabet in the middle with its transpose. Finally, the program must print the modified matrix as the output. Note: - Always the submatrices with an alphabet in the middle do not overlap in the given matrix. - No alphabets occur in the border of the given matrix. 
Boundary Condition(s): 
3 <= R, 
C <= 50 
Input Format: 
The first line contains R and C separated by a space. 
The next R lines, each contains C values(alphabets and integers) separated by a space. 
Output Format: 
The first R lines, each contains C values representing the modified matrix. 
Example Input/Output 1: 
Input: 
9 8 
8 0 9 4 5 1 3 3 
4 a 8 1 3 3 6 4 
3 2 6 2 H 9 4 3 
6 9 7 7 3 4 5 8 
4 1 0 6 9 1 9 7 
1 4 K 3 4 9 6 9 
1 1 2 6 2 0 0 2 
4 2 3 6 6 5 Z 9 
5 0 8 8 0 9 3 4 
Output: 
8 4 3 4 5 1 3 3 
0 a 2 1 2 7 6 4 
9 8 6 3 H 3 4 3 
6 9 7 3 9 4 5 8 
4 1 4 1 9 1 9 7 
1 0 K 2 4 9 6 9 
1 6 3 6 2 0 5 9 
4 2 3 6 6 0 Z 3 
5 0 8 8 0 2 9 4 
Explanation: 
All the 3*3 submatrices having an alphabet in the middle are highlighted below.
8 0 9 4 5 1 3 3 
4 a 8 1 3 3 6 4 
3 2 6 2 H 9 4 3 
6 9 7 7 3 4 5 8 
4 1 0 6 9 1 9 7 
1 4 K 3 4 9 6 9 
1 1 2 6 2 0 0 2 
4 2 3 6 6 5 Z 9 
5 0 8 8 0 9 3 4 
After transposing all the 3*3 submatrices having an alphabet in the middle, the matrix becomes 
8 4 3 4 5 1 3 3 
0 a 2 1 2 7 6 4 
9 8 6 3 H 3 4 3 
6 9 7 3 9 4 5 8 
4 1 4 1 9 1 9 7 
1 0 K 2 4 9 6 9 
1 6 3 6 2 0 5 9 
4 2 3 6 6 0 Z 3 
5 0 8 8 0 2 9 4
Example Input/Output 2: 
Input: 
7 6 
33 58 67 22 55 55 
55 48 P 68 45 29 
28 91 66 20 51 43 
86 62 99 31 70 67 
54 u 44 32 k 39 
53 29 39 51 91 27 
24 81 69 38 22 52 
Output: 
33 58 48 91 55 55 
55 67 P 66 45 29 
28 22 68 20 51 43 
86 54 53 31 32 51 
62 u 29 70 k 91 
99 44 39 67 39 27 
24 81 69 38 22 52
*/
/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner in=new Scanner(System.in);
	   int m,n;
	   m=in.nextInt();
	   n=in.nextInt();
	   int i,j;
	   Object[][] mat=new Object[900][900];
	   for(i=1;i<=m;i++)
	   {
	       for(j=1;j<=n;j++)
	       {
	           System.out.print("enter the num "+i+j+":");
	             if (in.hasNextInt()) {
                    mat[i][j] = in.nextInt();  // Read integer
                } else {
                    mat[i][j] = in.next().charAt(0);  // Read character
                }
	       }
	   }
	   int I=0,J=0;
	   for(i=1;i<=m;i++)
	   {
	       for(j=1;j<=n;j++)
	       {
	           System.out.print(mat[i][j]+" ");
	       }
	       System.out.println();
	   }
	  for(i=1;i<=m;i++)
	   {
	       for(j=1;j<=n;j++)
	       {
	           if(mat[i][j] instanceof Character)
	           {
	               I=i;
	               J=j;
	               fun(mat,I,J);
	           }
	           
	       }
	   }
	    for(i=1;i<=m;i++)
	   {
	       for(j=1;j<=n;j++)
	       {
	           System.out.print(mat[i][j]+" ");
	       }
	       System.out.println();
	   }
	   
	}
	public static void fun(Object[][] mat,int I,int J)
	{
	    int i,a=--I,b=--J,c=a,d=b,v=0;
	    for(i=1;i<=3;i++)
	    {
	        if(i!=3)
	        {
	             a++;d++;
	           swap(mat,a,b,c,d);
	        }
	        else{
	             v++;
	            b++;c++;
	            swap(mat,a,b,c,d);
	        }
	    }
	}
	public static void swap(Object[][] mat,int a,int b,int c,int d)
	{
	    
	    Object temp=mat[a][b];
	    mat[a][b]=mat[c][d];
	    mat[c][d]=temp;
	    
	}
}