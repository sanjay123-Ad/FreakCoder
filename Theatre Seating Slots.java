/*The booking status of R*C seats in a theatre is passed as the input. 1 indicates that the seat is booked and 0 indicates that the seat is not booked yet. The R*C seats are divided into three blocks column wise. The number of seats in a row of each block (X, Y and Z) is passed as the input (i.e., C = X + Y + Z). A family with K members wants to book continuous seats in the same row. The program must print the number of ways the family can book the seats as the output. 
Boundary Condition(s): 
1 <= R <= 50 
3 <= C <= 50 
X + Y + Z = C (X, Y and Z are always greater than 0) 
1 <= K <= Maximum value among X, Y and Z. 
Input Format: 
The first line contains R, C and K separated by a space. 
The next R lines, each contains C integer values separated by a space. 
The (R+2)th line contains X, Y and Z separated by a space. 
Output Format: 
The first line contains an integer representing the number of ways the family can book the seats. 
Example Input/Output 1:
Input: 
5 12 3 
1 1 1 0 0 1 1 0 0 0 1 1 
0 1 1 0 0 0 0 0 0 1 1 1 
0 0 0 0 1 1 1 1 1 1 0 0 
1 1 1 1 0 0 0 1 0 0 0 1 
1 0 1 1 1 1 1 1 1 0 1 1 
3 6 3 
Output: 
6 
Explanation: 
Here K = 3, X = 3, Y = 6 and Z = 3. 
The 5*12 seats can be divided into 3 blocks as given below. 
1 1 1 0 0 1 1 0 0 0 1 1 
0 1 1 0 0 0 0 0 0 1 1 1 
0 0 0 0 1 1 1 1 1 1 0 0 
1 1 1 1 0 0 0 1 0 0 0 1 
1 0 1 1 1 1 1 1 1 0 1 1 
1 1 In the block 1, there is only 1 possible way to book 3 seats in a row. In the block 2, there are 5 possible ways to book 3 seats in a row. In the block 3, there is no way to book 3 seats in a row. So the total number of ways is 6, which is printed as the output. 
Example Input/Output 2: 
Input: 
4 6 2 
1 0 0 0 1 1 
1 0 0 1 0 0 
1 0 1 0 1 0 
0 0 0 1 1 1 
2 3 1 
Output: 
2
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
		int m,n,k;
		m=in.nextInt();
		n=in.nextInt();
		k=in.nextInt();
		int[][] mat=new int[900][900];
		int i,j;
		for(i=1;i<=m;i++)
		{
		    for(j=1;j<=n;j++)
		    {
		        System.out.println("enter the mat "+i+j+":");
		        mat[i][j]=in.nextInt();
		    }
		}
		
		int[] arr=new int[4];
		for(i=1;i<=3;i++)
		{
		    arr[i]=in.nextInt();
		}
		int ways=0,col=0,x=0;
		for(i=1;i<=3;i++)
		{
		   x=arr[i];
		   ways+=fun(mat,arr,k,m,x,col);
		   
		   col+=x;
		}
		System.out.println("no.of ways is: "+ways);
	}
	public static int fun(int[][] mat,int[] arr,int k,int m,int n,int col)
	{
	    
	    int i,j,c=0,w=0,fp=0,K,b=0;
	    for(i=1;i<=m;i++)
	    {
	         K=1;
	        for(j=1;j<=n;j++)
	        {
	            if(mat[i][1+col]==K)
	            {
	                c=1;
	                K=0;
	            }
	            
	                if(mat[i][j+col]==0)
	                {
	                  c++;
	                  if(c>=k && ((mat[i][j+col+1]==1) && (j+1<=n)))
	                  {
	                     
	                     w+=c-(k-1); 
	                     b=1;
	                  }
	                }
	               
	               else{
	                   c=0;
	               }
	              
	               b=0;
	               
	            
	        }
	        
	        if(b==0)
	        {
	            
	            if(c>=k)
	        {
	            
	            w+=c-(k-1);
	            
	        }
	        }
	        
	        
	        c=0;
	        b=0;
	    }
	   
	    return w;
	}
}