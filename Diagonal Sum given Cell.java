/*
The program must accept an integer matrix of size RxC and two integers M and N as the input. The integers M and N represent the position of a cell C in the matrix. The program must print the sum of integers which are present in the top-left to bottom-right diagonal having the cell C in the matrix. 
Boundary Condition(s): 
2 <= R, 
C <= 50 
1 <= Matrix element value <= 1000 
1 <= M <= R 
1 <= N <= C 
Input Format: 
The first line contains R and C separated by a space. The next R lines, each contains C integers separated by a space. The (R+2)nd line contains M and N separated by a space. Output Format: The first line contains an integer representing the sum of integers which are present in the top-left to bottom-right diagonal with the cell C in the matrix. 
Example Input/Output 1: 
Input: 
5 5 
4 8 9 3 6 
1 4 2 9 1 
3 5 6 2 6 
5 7 8 9 3 
8 4 3 2 1 
3 4 
Output: 
15 
Explanation: 
In 5x5 matrix, the top-left to bottom-right diagonal with the cell(3, 4) is highlighted below, 
4 8 9 3 6 
1 4 2 9 1 
3 5 6 2 6 
5 7 8 9 3
 8 4 3 2 1 
So their sum is 15 (8+2+2+3) which is printed as the output. 
Example Input/Output 2: 
Input: 
3 4 
79 37 68 34 
36 65 52 22 
56 79 25 12 
2 2 
Output: 
169
*/
/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	 Scanner in=new Scanner(System.in);
        int r,c;
        r=in.nextInt();
        c=in.nextInt();
        int[][] s=new int[900][900];
        int i,j;
        for(i=1;i<=r;i++)
        {
            for(j=1;j<=c;j++)
            {
                s[i][j]=in.nextInt();
            }
        }
        int m,n;
        m=in.nextInt();
        n=in.nextInt();
        int a,b;
        a=m;b=n;
        int tot=0;
        while(a>=1 && b>=1)
        {
           tot+=s[a][b];
           System.out.println(s[a][b]);
           a--;
           b--;
           
        }
        int C,d;
        C=m;d=n;
        while(C+1<=r && d+1<=c)
        {
            
            C++;
            d++;
             System.out.println(s[C][d]);
            tot+=s[C][d];
        }
        System.out.println(tot);
	}
}

