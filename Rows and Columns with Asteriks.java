/*The program must accept a character matrix of size N*N containing only alphabets and Q queries as the input. Each query contains two integers X and Y. For each query, the program must modify the rows and columns of the matrix based on the following conditions. 
- All characters present in the rows from X to Y must be replaced with asterisks. If some characters are asterisks when replacing, then those asterisks must be replaced with the original alphabets.
 - All characters present in the columns from X to Y must be replaced with asterisks. If some characters are asterisks when replacing, then those asterisks must be replaced with the original alphabets. Finally, the program must print the modified matrix as the output. 
Boundary Condition(s): 
2 <= N <= 50 
1 <= Q <= 100 
1 <= X <= Y <= N 
Input Format: 
The first line contains N. The next N lines, each contains N alphabets separated by a space. The (N+2)nd line contains Q. The next Q lines, each contains X and Y separated by a space. 
Output Format: 
The first N lines, each contains N characters separated by a space. 
Example Input/Output 1: 
Input: 
7 
x d x r j x x 
a f f w x t h 
u k b m g x p
 g o u d t r w 
c z w p q r g 
w c o m u k u 
f g q o r t h 
2 
2 3 
5 7 
Output: 
x * * r * * * 
* f f * x t h 
* k b * g x p 
g * * d * * * 
* z w * q r g 
* c o * u k u 
* g q * r t h 
Explanation: 
Here Q = 2. 1st query -> 2 3 After modifying the rows from 2 to 3, 
the matrix becomes 
x d x r j x x 
* * * * * * * 
* * * * * * * 
g o u d t r w 
c z w p q r g 
w c o m u k u 
f g q o r t h 
After modifying the columns from 2 to 3, 
the matrix becomes 
x * * r j x x 
* f f * * * * 
* k b * * * * 
g * * d t r w 
c * * p q r g 
w * * m u k u 
f * * o r t h 
2nd query -> 5 7 After modifying the rows from 5 to 7, 
the matrix becomes 
x * * r j x x 
* f f * * * * 
* k b * * * * 
g * * d t r w 
* z w * * * * 
* c o * * * * 
* g q * * * * 
After modifying the columns from 5 to 7, 
the matrix becomes 
x * * r * * * 
* f f * x t h 
* k b * g x 
p g * * d * * 
* * z w * q r 
g * c o * u k 
u * g q * r t h 
Example Input/Output 2: 
Input: 
4 
a h u C 
s w I i 
C a Q w 
M Y E h 
3 
1 1 
4 4 
1 4 
Output: 
a * * C 
* w I * 
* a Q * 
M * * h
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
		int n=in.nextInt();
		int i,j;
		char[][] mat=new char[900][900];
		for(i=1;i<=n;i++)
		{
		  for(j=1;j<=n;j++)
		  {
		      System.out.println("enter the char"+i+j+": ");
		      mat[i][j]=in.next().charAt(0);
		  }
		}
		int t=in.nextInt();
		int[][] arr=new int[t+1][3];
		for(i=1;i<=t;i++)
		{
		    for(j=1;j<=2;j++)
		    {
		        System.out.println("enter the num"+i+j+": ");
		        arr[i][j]=in.nextInt();
		    }
		}
		char[][] upd=new char[900][900];
		for(i=1;i<=n;i++)
		{
		    for(j=1;j<=n;j++)
		    {
		        upd[i][j]=mat[i][j];
		        System.out.print(mat[i][j]+" ");
		    }
		    System.out.println();
		}
		for(i=1;i<=t;i++)
		{
		    int a=arr[i][1];
		    int b=arr[i][2];
		    fun(mat,a,b,n,upd);
		}
		for(i=1;i<=n;i++)
		{
		    for(j=1;j<=n;j++)
		    {
		        System.out.print(upd[i][j]+" ");
		    }
		    System.out.println();
		}
		
	}
	public static void fun(char[][] mat,int a,int b,int n,char[][] upd)
	{
	    int i,j,k,A=a;
	    for(k=a;k<=b;k++)
	    {
	        for(i=1;i<=n;i++)
	        {
	            for(j=1;j<=n;j++)
	            {
	                if(i==k)
	                {
	                   if(upd[i][j]!='*')
	                   {
	                      upd[i][j]='*';
	                   }
	                   else
	                   {
	                      upd[i][j]=mat[i][j];
	                   } 
	                }
	            }
	        }
	    }
		 for(k=a;k<=b;k++)
	    {
	        for(i=1;i<=n;i++)
	        {
	            for(j=1;j<=n;j++)
	            {
	                if(j==k)
	                {
	                   if(upd[i][j]!='*')
	                   {
	                      upd[i][j]='*';
	                   }
	                   else
	                   {
	                      upd[i][j]=mat[i][j];
	                   } 
	                }
	            }
	        }
	    }
		
	}
}