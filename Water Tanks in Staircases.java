/*There are R*C water tanks arranged as a matrix. The water tanks are connected diagonally from top-left to bottom-right like staircases (i.e., If a water tank overflows, then the water will flow into the tank at its bottom-right). The maximum capacity and the amount of water in each water tank are passed as the input to the program. The program must print the amount of water in each tank after adding X litres of water to the first tank(top-most) in each staircase as the output. The value of X is also passed as the input to the program. 
Boundary Condition(s): 
2 <= R, 
C <= 50 
1 <= Maximum capacity of each tank, 
X <= 1000 
Input Format: 
The first line contains R and C separated by a space. T
he next R lines, each contains C integers representing the maximum capacities of the R*C tanks. 
The next R lines from the (R+2)th line, each contains C integers representing the amount of water in the R*C tanks. The (2*R+2)th line contains X. Output Format: 
The first R lines, each contains C integers representing the amount of water in the R*C tanks after adding X litres of water based on the given conditions. 
Example Input/Output 1: 
Input: 
3 3 
10 15 20 
10 15 20 
10 15 20 
7 12 18 
8 14 13 
10 13 16 
4 
Output: 
10 15 20 
10 15 14 
10 15 16 
Explanation: Here X = 4. 
The maximum capacities of the 3*3 tanks are given below. 
10 15 20 
10 15 20 
10 15 20 
Staircase 1: 
After adding 4 litres of waters, the matrix becomes 
7 12 18 
8 14 13 
10 13 16 
Staircase 2: 
After adding 4 litres of waters, the matrix becomes 
7 12 18 
10 14 13 
10 15 16 
Staircase 3: 
After adding 4 litres of waters, the matrix becomes 
10 12 18 
10 15 13 
10 15 16 
Staircase 4: 
After adding 4 litres of waters, the matrix becomes 
10 15 18 
10 15 14 
10 15 16 
Staircase 5: 
After adding 4 litres of waters, the matrix becomes
10 15 20 
10 15 14 
10 15 16
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int m,n;
    m = in.nextInt();
    n = in.nextInt();
    int[][] cap = new int[900][900];
    int[][] start = new int[900][900];
	int i,j;
	System.out.println("give me each water capacity level...");
	for(i=1;i<=m;i++)
	{
	    for(j=1;j<=n;j++)
	    {
	        System.out.println("cap"+i+j+":");
	        cap[i][j]=in.nextInt();
	    }
	}
	System.out.println("give me each water initial level...");
	
	for(i=1;i<=m;i++)
	{
	    for(j=1;j<=n;j++)
	    {
	        System.out.println("start"+i+j+":");
	        start[i][j]=in.nextInt();
	    }
	}
	for(i=1;i<=m;i++)
	{
	    for(j=1;j<=n;j++)
	    {
	        System.out.print(start[i][j]+" ");
	    }
	    System.out.println();
	}
	int k=in.nextInt();
	for(i=m;i>=1;i--)
	{
	    fun(start,i,k,cap,m);
	}
	for(i=2;i<=n;i++)
	{
	    funn(start,i,k,cap,n);
	}
	
	for(i=1;i<=m;i++)
	{
	    for(j=1;j<=n;j++)
	    {
	        System.out.print(start[i][j]+" ");
	    }
	    System.out.println();
	}
	}
	public static void fun(int[][] start,int h,int k,int[][] cap,int m)
	{
	    int b=1;
	    for(int i=h;i<=m;i++)
	    {
	         int v = start[i][b]+k;
	         if(v>=cap[i][b])
	         {
	             start[i][b]=cap[i][b];
	             k=v-cap[i][b];
	             b++;
	         }
	         else{
	             start[i][b]=v;
	             break;
	         }
	    }
	}
	public static void funn(int[][] start,int h,int k,int[][] cap,int n)
	{
	    int b=1;
	    for(int i=h;i<=n;i++)
	    {
	         int v = start[b][i]+k;
	         if(v>=cap[b][i])
	         {
	             start[b][i]=cap[b][i];
	             k=v-cap[b][i];
	             b++;
	         }
	         else{
	             start[b][i]=v;
	             break;
	         }
	    }
	}
}