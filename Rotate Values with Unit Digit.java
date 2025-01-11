/*The program must accept the integer values in a matrix of size R*C. Then the program must rotate only the values in the border of the matrix having the same unit digit as the value in the bottom right corner element of the matrix by one position in clockwise direction. 
Boundary Condition(s): 
2 <= R, 
C <= 50 
1 <= Matrix element value <= 10^5
Input Format: 
The first line contains R and C separated by a space. The next R lines, each contains C integers separated by a space. 
Output Format: 
The first R lines, each contains C integers separated by a space. 
Example Input/Output 1: 
Input: 
4 5 
602 224 711 489 578 
127 987 808 343 479 
37 226 563 982 21 
426 587 917 547 31 
Output: 
602 224 31 489 578 
127 987 808 343 479 
37 226 563 982 711 
426 587 917 547 21 
Explanation: 
The bottom right corner element value is 31. The unit digit is 1. The values having unit digit as 1 along the matrix border are 711 21 31. These values alone must be rotated among them in clockwise direction. Hence the matrix becomes 
602 224 31 489 578 
127 987 808 343 479 
37 226 563 982 711 
426 587 917 547 21 
Example Input/Output 2: 
Input: 
5 3 
23 6 95 
66 1 76 
43 13 20 
26 16 30 
73 4 56 
Output: 
23 66 95 
26 1 6 
43 13 20 
56 16 30 
73 4 76
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int m,n;
		m=in.nextInt();
		n=in.nextInt();
		int[][] arr=new int[900][900];
		int i,j;
		int M=m,N=n;
		for(i=1;i<=m;i++)
		{
		    for(j=1;j<=n;j++)
		    {
		        System.out.println("enter the num"+i+j+":");
		        arr[i][j]=in.nextInt();
		    }
		}
		int U=arr[m][n]%10;
		int EL=n/2;
		int a=1;
			for(i=1;i<=M;i++)
		{
		    for(j=1;j<=N;j++)
		    {
		        System.out.print(arr[i][j]+" ");
		    }
		    System.out.println();
		}
		for(i=1;i<=EL;i++)
		{
		    fun(arr,U,a,m,n,M,N);
		    a++;
		    m--;
		    n--;
		}
		System.out.println("finally...");
		for(i=1;i<=M;i++)
		{
		    for(j=1;j<=N;j++)
		    {
		        System.out.print(arr[i][j]+" ");
		    }
		    System.out.println();
		}
		
	}
		public static void fun(int[][] arr,int U,int a,int m,int n,int M,int N)
	{
	    int i;
	    int[] TU=new int [900];
	    int y=1;
	    for(i=a;i<=n;i++)
	    {
	       int RU=arr[a][i];
	       if(RU%10==U)
	       {
	          TU[y]=arr[a][i];
	          y++;
	       }
	    }
	    for(i=a+1;i<=m;i++)
	    {
	        int RU=arr[i][n];
	        if(RU%10==U)
	        {
	          TU[y]=arr[i][n];
	          y++; 
	        }
	    }
	    for(i=n-1;i>=a;i--)
	    {
	        int RU =arr[m][i];
	        if(RU%10==U)
	        {
	            TU[y]=arr[m][i];
	            y++;
	        }
	    }
	    for(i=m-1;i>a;i--)
	    {
	        int RU =arr[i][a];
	        if(RU%10==U)
	        {
	            TU[y]=arr[i][a];
	            y++;
	        }
	    }
	    for(i=1;i<y;i++)
	    {
	        System.out.print(TU[i]+" ");
	    }
	     System.out.println();
	     
	    int temp=TU[y-1];
	    for(i=y-2;i>=1;i--)
	    {
	        TU[i+1]=TU[i];
	    }
	    TU[1]=temp;
	    for(i=1;i<y;i++)
	    {
	        System.out.print(TU[i]+" ");
	    }
	     System.out.println();
	     fun2(arr,TU,y,U,a,m,n,M,N);
	    
	}
	public static void fun2(int[][] arr,int[] TU, int y,int U,int a,int m,int n,int M,int N)
	{
	    int i,c=1;
	    for(i=a;i<=n;i++)
	    {
	       int RU=arr[a][i];
	       if(RU%10==U)
	       {
	          arr[a][i]=TU[c];
	          c++;
	       }
	    }
	     for(i=a+1;i<=m;i++)
	    {
	        int RU=arr[i][n];
	        if(RU%10==U)
	        {
	          arr[i][n]=TU[c];
	          c++; 
	        }
	    }
	    for(i=n-1;i>=a;i--)
	    {
	        int RU =arr[m][i];
	        if(RU%10==U)
	        {
	            arr[m][i]=TU[c];
	            c++;
	        }
	    }
	    for(i=m-1;i>a;i--)
	    {
	        int RU =arr[i][a];
	        if(RU%10==U)
	        {
	            arr[i][a]=TU[c];
	            c++;
	        }
	    }
	    for(i=1;i<=M;i++)
		{
		    for(int j=1;j<=N;j++)
		    {
		        System.out.print(arr[i][j]+" ");
		    }
		    System.out.println();
		}
	}
	
}