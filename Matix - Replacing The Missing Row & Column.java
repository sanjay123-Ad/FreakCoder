/*The program must accept an integer matrix M and two integer arrays A1, A2 as the input. The size of the integer matrix M is R*C but exactly one row and one column are missing. The size of the integer array A1 is C, which represents the row that is not in the given matrix(i.e., the missing row). The size of the integer array A2 is R, which represents the column that is not in the given matrix(i.e., the missing column). The program must reconstruct the matrix with R rows and C columns. Then the program must print the matrix of size R*C as the output. Note: The matrix M always contains unique integers. 
Boundary Condition(s): 
2 <= R, 
C <= 50 
1 <= Matrix element value <= 10^4 
Input Format: 
The first line contains R and C separated by a space. 
The next R-1 lines, each contains C-1 integer values separated by a space. 
The (R+1)th line contains C integer values separated by a space. 
The (R+2)th line contains R integer values separated by a space. 
Output Format: 
The first R lines, each contains C integer values separated by a space. 
Example Input/Output 1: 
Input: 
6 7 
87 86 73 75 66 52 
24 35 10 44 58 74 
82 41 23 56 40 53 
25 72 36 37 42 90 
15 76 49 54 78 83 
81 68 48 64 28 77 47 
55 43 28 80 30 91 
Output: 
87 86 73 75 55 66 
52 24 35 10 44 43 
58 74 81 68 48 64 
28 77 47 82 41 23 
56 80 40 53 25 72 
36 37 30 42 90 15 
76 49 54 91 78 83 
Explanation: 
After reconstructing the matrix by adding the missing row and column, the matrix becomes 
87 86 73 75 55 66 
52 24 35 10 44 43 
58 74 81 68 48 64 
28 77 47 82 41 23 
56 80 40 53 25 72 
36 37 30 42 90 15 
76 49 54 91 78 83 

Example Input/Output 2: 
Input: 
7 5 
52 70 84 60 
37 75 49 62 
91 25 36 18 
53 68 86 90 
45 15 42 67 
77 28 92 71 
74 14 72 76 44 
47 72 31 29 13 99 97 
Output: 
52 70 47 84 60 
74 14 72 76 44 
37 75 31 49 62 
91 25 29 36 18 
53 68 13 86 90 
45 15 99 42 67 
77 28 97 92 71
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
		Scanner in=new Scanner (System.in);
		int r,c,i,j;
		r=in.nextInt();
		c=in.nextInt();
		int[][] mat=new int[900][900];
		
		for(i=1;i<r;i++)
		{
		    for(j=1;j<c;j++)
		    {
		       System.out.print("enter the mat "+i+j+":");
		       mat[i][j]=in.nextInt();
		    }
		   
		}
		int[] row=new int[900];
		int[] col=new int[900];
		for(i=1;i<=c;i++)
		{
		    System.out.println("row "+i+": ");
		    row[i]=in.nextInt();
		}
		for(i=1;i<=r;i++)
		{
		    System.out.println("col "+i+": ");
		    col[i]=in.nextInt();
		}
		int match=0,I=0,J=0;
		for(i=1;i<=c;i++)
		{
		    for(j=1;j<=r;j++)
		    {
		        if(row[i]==col[j])
		        {
		            match=row[i];
		            I=j;
		            J=i;
		            break;
		        }
		    }
		}
	
		int[][] upd=new int[r+1][c+1];
		int a=1;
		int b=1;
		for(i=1;i<=r;i++)
		{
		    for(j=1;j<=c;j++)
		    {
		        if(i==I)
		        {
		            upd[i][j]=row[a];
		            a++;
		        }
		        if(j==J)
		        {
		            upd[i][j]=col[b];
		            b++;
		        }
		    }
		}
		a=1;b=1;
		for(i=1;i<=r;i++)
		{
		    for(j=1;j<=c;j++)
		    {
		        if(upd[i][j]==0)
		        {
		            upd[i][j]=mat[a][b];
		            b++;
		        }
		        if(b>c-1)
		        {
		            a++;
		            b=1;
		        }
		    }
		}
		for(i=1;i<=r;i++)
		{
		    for(j=1;j<=c;j++)
		    {
		        System.out.print(upd[i][j]+" ");
		    }
		    System.out.println();
		}
		
	}
}