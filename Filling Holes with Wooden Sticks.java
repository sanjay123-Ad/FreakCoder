/*The program must accept a character matrix of size R*C representing a wood as the input. The character asterisk (*) represents the hole. The character hash symbol (#) represents the wooden part. There are N wooden sticks of different heights used to fill the holes. The depth of a hole is equal to number of consecutive asterisks from the top of a column. A hole of depth X can be filled with a wooden stick of height X. The heights of the N wooden sticks are also passed as the input to the program. The program must fill as many holes as possible from left to right in the wood. Then the program must print the modified matrix and the heights of the remaining sticks as the output. If no sticks are left, then the program must print -1 as the output. 
Boundary Condition(s): 
2 <= R, 
C <= 50 
1 <= N <= 100 
Input Format: 
The first line contains R and C separated by a space. 
The next R lines, each containing C characters separated by a space. 
The (R+2)th line contains N. 
The (R+3)th line contains N integers separated by a space. 
Output Format: 
The first R lines, each containing C characters separated by a space. 
The (R+1)th line contains -1 or the heights of the remaining sticks separated by a space based on the given conditions. 
Example Input/Output 1: 
Input: 
7 5 
# * # * * 
# * # * * 
# * # # * 
# * # # * 
# # # # * 
# # # # *
# # # # # 
6 
2 3 4 5 6 7 
Output: 
# # # # # 
# # # # # 
# # # # # 
# # # # # 
# # # # # 
# # # # # 
# # # # # 
3 5 7 
Explanation: 
There are 3 holes in the given wood. Depth of the 1st hole = 4 Depth of the 2nd hole = 2 Depth of the 3rd hole = 6 All three holes can be filled with the given wooden sticks (4, 2, 6). Now the matrix becomes 
# # # # # 
# # # # # 
# # # # # 
# # # # # 
# # # # # 
# # # # # 
# # # # #
The remaining wooden sticks are 3, 5 and 7. 
Example Input/Output 2: 
Input: 
4 10 
# * # * # * # * * * 
# * # * # * # # # # 
# * # * # * # # # # 
# # # # # * # # # # 
7 
1 1 3 1 2 4 1 
Output: 
# # # * # # # # # # 
# # # * # # # # # # 
# # # * # # # # # # 
# # # # # # # # # # 
2 1 
Example Input/Output 3: 
Input: 
6 4 
* # * # 
* # * # 
* # * # 
# # * # 
# # * # 
# # # # 
1 
3 
Output: 
# # * # 
# # * # 
# # * # 
# # * # 
# # * # 
# # # # 
-1
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
		int m,n;
		m=in.nextInt();
		n=in.nextInt();
		char[][] mat=new char[900][900];
		int i,j;
		for(i=1;i<=m;i++)
		{
		    for(j=1;j<=n;j++)
		    {
		       System.out.println("enter the char "+i+j+" :");
		       mat[i][j]=in.next().charAt(0);
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
		int k=in.nextInt();
		int[] arr=new int[9000];
		for(i=1;i<=k;i++)
		{
		    System.out.println("enter the num "+i+" :");
		    arr[i]=in.nextInt();
		}
		int[] check=new int[9000];
		int[] con=new int[9000];
		int x=0;
		for(i=1;i<=n;i++)
		{
		    for(j=1;j<=m;j++)
		    {
		        if(mat[j][i]=='*')
		        {
		            x++;
		        }
		    }
		    check[i]=x;
		    x=0;
		}
		for(i=1;i<=n;i++)
		{
		    System.out.println(check[i]);
		}
		for(i=1;i<=n;i++)
		{
		    if(check[i]!=0)
		    {
		        for(j=1;j<=k;j++)
		        {
		            if(check[i]==arr[j])
		            {
		                arr[j]=0;
		                con[i]=1;
		                break;
		            }
		        }
		    }
		}
		for(i=1;i<=n;i++)
		{
		    System.out.println(check[i]+" "+con[i]);
		}
		for(i=1;i<=n;i++)
		{
		    if(check[i]!=0 && con[i]==1)
		    {
		        for(j=1;j<=m;j++)
		        {
		            mat[j][i]='#';
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
		int c=0;
		for(i=1;i<=k;i++)
		{
		    if(arr[i]!=0)
		    {
		        c++;
		    }
		}
		if(c!=0)
		{
		for(i=1;i<=k;i++)
		{
		    if(arr[i]!=0)
		    {
		        System.out.print(arr[i]+" ");
		    }
		}
	
		}
			else{
		    System.out.println("-1");
		}
		
		
		
	}
}