/*The program must accept 4 array elements with the size of the arrays as A, B, C and D. The program must find the count N of the quadruplets P, Q, R and S where P belongs to A, Q belongs to B, R belongs to C and S belongs to D, and the sum of any two values is equal to the sum of other two values. 
Boundary Condition(s): 
1 <= A, B, C, D <= 50 
1 <= Each integer value <= 10^5 
Input Format: 
The first line contains A, B, C and D separated by a space. 
The second line contains A integer values separated by a space. 
The third line contains B integer values separated by a space. 
The fourth line contains C integer values separated by a space. 
The fifth line contains D integer values separated by a space. 
Output Format: 
The first line contains N. 
Example Input/Output 1: 
Input: 
2 4 1 2 
3 8 
1 3 8 4 
5 
3 6 
Output: 
4 
Explanation: 
The possible combinations of the quadruplets are given below. (3, 1, 5, 3) (3, 1, 5, 6) (3, 3, 5, 3) (3, 3, 5, 6) (3, 8, 5, 3) (3, 8, 5, 6) (3, 4, 5, 3) (3, 4, 5, 6) (8, 1, 5, 3) (8, 1, 5, 6) (8, 3, 5, 3) (8, 3, 5, 6) (8, 8, 5, 3) (8, 8, 5, 6) (8, 4, 5, 3) (8, 4, 5, 6) There are 4 quadruplets where the sum of any values is equal to the other two value.
 (3, 1, 5, 3) -> 3+3 = 1+5 = 6 
(3, 8, 5, 6) -> 3+8 = 5+6 = 11 
(3, 4, 5, 6) -> 3+6 = 5+4 = 9 
(8, 3, 5, 6) -> 8+3 = 5+6 = 11 
Example Input/Output 2: 
Input: 
3 3 3 3 
1 8 2 
4 2 8 
6 4 7 
3 5 6 
Output: 
18
/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int[] C=new int[5];
		int i,j;
		for(i=1;i<=4;i++)
		{
		    System.out.println("enter the count "+i+": ");
		    C[i]=in.nextInt();
		}
		int[][] mat=new int[900][900];
		for(i=1;i<=4;i++)
		{
		    for(j=1;j<=C[i];j++)
		    {
		        System.out.println("enter the num "+i+j+":");
		        mat[i][j]=in.nextInt();
		    }
		}
		for(i=1;i<=4;i++)
		{
		    for(j=1;j<=C[i];j++)
		    {
		        System.out.print(mat[i][j]+" ");
		    }
		    System.out.println();
		}
		int k,l;
		int[] tot=new int[900];
		int t=0;
		
		for(i=1;i<=C[1];i++)
		{
		    int p=mat[1][i];
		    for(j=1;j<=C[2];j++)
		    {
		        int q=mat[2][j];
		        for(k=1;k<=C[3];k++)
		        {
		            int r=mat[3][k];
		            for(l=1;l<=C[4];l++)
		            {
		                int s=mat[4][l];
		                System.out.println("P : "+p+" Q: "+q+" R : "+r+" S : "+s);
		               if(p+q == r+s || p+s == q+r ||p+r == s+q)
		               {
		                   t++;
		               }
		            }
		        }
		    }
		}
		System.out.println(t);
	}
}