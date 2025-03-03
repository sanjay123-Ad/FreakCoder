/*The program must accept an integer matrix of size R*C and an integer K as the input. The values of R and C are always divisible by K. The given R*C matrix contains only 0s and 1s. The program must form an alphabet matrix of size (R/K)*(C/K) starting from "a" being present in the bottom left corner. Then the program must modify the submatrices of size K*K diagonally. In each integer submatrix of size K*K, all 1s must be replaced with the related upper case alphabet in the alphabet matrix and all 0s must be replaced with the related lower case alphabet in the alphabet matrix. If "z" has reached while filling the alphabet matrix then "a" must be considered as the next alphabet in circular fashion while forming the alphabet matrix. Finally, the program must print the integer matrix replaced with the corresponding alphabets as the output. 
Boundary Condition(s): 
2 <= R, 
C <= 50
Input Format: The first line contains R and C separated by a space. 
The next R lines, each contains C integer values separated by a space. 
The (R+2)nd line contains K. 
Output Format: 
The first R lines, each contains C alphabets separated by a space. 
Example Input/Output 1: 
Input: 
9 9 
0 0 1 0 0 0 0 1 1 
0 0 1 1 1 1 1 0 1 
0 1 1 1 1 1 0 1 1 
1 1 1 1 1 0 1 1 1 
0 1 1 0 0 0 1 1 0 
0 0 0 1 0 1 1 0 0 
0 0 1 1 0 1 1 1 1 
0 1 1 0 1 1 1 0 0 
0 0 1 1 1 1 0 1 1 
3 
Output: 
d d D g g g i I I 
d d D G G G I i I 
d D D G G G i I I 
B B B E E e H H H 
b B B e e e H H h 
b b b E e E H h h 
a a A C c C F F F 
a A A c C C F f f 
a a A C C C f F F 
Explanation: Here R = 9, C = 9 and K = 3. So the size of the alphabet matrix to be formed is (9/3)*(9/3). The alphabet matrix of size 3*3 is given below. 
d g i 
b e h 
a c f 
In the above alphabet matrix, the alphabets starting from 'a' are filled diagonally in the top-left to bottom-right diagonals starting the bottom-left corner. After replacing the submatrices with their corresponding alphabets based on the given conditions, the matrix 
Example Input/Output 2: 
Input: 
6 8 
1 0 1 0 0 1 0 0 
0 1 1 1 1 1 0 1 
0 0 0 0 1 0 1 0 
1 1 1 0 0 0 1 1 
1 0 1 1 1 0 0 0 
1 1 1 0 0 1 1 0 
2 
Output: 
D d G g j J l l 
d D G G J J l L 
b b e e H h K k 
B B E e h h K K 
A a C C F f i i 
A A C c f F I i 
Explanation: 
Here R = 6, C = 8 and K = 2. So the size of the alphabet matrix to be formed is (6/2)*(8/2). The alphabet matrix of size 3*4 is given below.
d g j l 
b e h k 
a c f i 
In the above alphabet matrix, the alphabets starting from 'a' are filled diagonally in the top-left to bottom-right diagonals starting the bottom-left corner. After replacing the submatrices with their corresponding alphabets based on the given conditions, the matrix becomes 
Example Input/Output 3: 
Input: 
10 12 
0 1 0 1 0 1 0 1 1 0 0 1 
0 0 0 1 0 0 0 0 1 1 0 0 
0 0 0 0 1 1 0 1 0 0 0 0 
0 0 0 0 0 0 0 1 1 0 1 0 
1 1 0 1 0 1 0 0 1 0 1 0 
1 0 1 0 1 1 0 0 0 1 0 1 
0 1 0 0 1 0 0 0 1 1 1 0 
1 1 0 1 0 0 1 0 0 0 0 0 
0 1 1 0 0 1 0 1 1 0 0 0 
1 0 0 1 0 0 0 0 1 0 1 0 
2 
Output: 
k K p P u U y Y B b d D 
k k p P u u y y B B d d 
g g l l Q Q v V z z c c 
g g l l q q v V Z z C c 
D D h H m M r r W w A a 
D d H h M M r r w W a A 
b B e e I i n n S S X x 
B B e E i i N n s s x x 
a A C c f F j J O o t t 
A a c C f f j j O o T t
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
		int r,c;
		r=in.nextInt();
		c=in.nextInt();
		int[][] mat=new int[r+1][c+1];
		int i,j;
		for(i=1;i<=r;i++)
		{
		    for(j=1;j<=c;j++)
		    {
		        System.out.println("enter the num "+i+j+": ");
		        mat[i][j]=in.nextInt();
		    }
		}
		for(i=1;i<=r;i++)
		{
		    for(j=1;j<=c;j++)
		    {
		        System.out.print(mat[i][j]+" ");
		    }
		    System.out.println();
		}
		int k=in.nextInt();
		char[][] ch=new char[(r/k)+1][(c/k)+1];
			for(i=1;i<=r/k;i++)
		{
		    for(j=1;j<=c/k;j++)
		    {
		        System.out.print(ch[i][j]+" ");
		    }
		    System.out.println();
		}
		int start=r/k,S=start;
		int end=1,E=end;
		int b=1,a=0;
		char ascii='a';
		for(i=1;i<=(r/k)+(c/k);i++)
		{
		   
		   while(start<(r/k)+1 && b<(c/k)+1)
		   {
		       a=0;
		       ch[start][b]=ascii;
		       
		      
		       start++;
		       b++;
		       if(ascii=='z')
		       {
		           ascii ='`';
		       }
		       ascii++;
		   }
		   if(S<=E)
		   {
		      start=1;
		      E++;
		      b=E;
		      
		   }
		   else{
		       S--;
		       start=S;
		       b=1;
		   }
		}
		for(i=1;i<=r/k;i++)
		{
		    for(j=1;j<=c/k;j++)
		    {
		        System.out.print(ch[i][j]+" ");
		    }
		    System.out.println();
		}
		char[][] up=new char[r+1][c+1];
		int A=1,B=1,o=(r/k)*(c/k),u=0,v=0;
		for(int h=1;h<=o;h++)
		{
		    
		    char n=ch[A][B];
		    for(i=1;i<=k;i++)
		    {
		        for(j=1;j<=k;j++)
		        {
		            up[i+u][j+v]=n;
		            
		        }
		        System.out.println();
		        
		    }

		    
		    if(v+k<c)
		    {
		        B++;
		        v+=k;
		    }
		    else{
		        B=1;
		        A++;
		        v=0;
		        u+=k;
		    }
		    
		}
		for(i=1;i<=r;i++)
		{
		    for(j=1;j<=c;j++)
		    {
		        System.out.print(up[i][j]+" ");
		    }
		    System.out.println();
		}
		for(i=1;i<=r;i++)
		{
		    for(j=1;j<=c;j++)
		    {
		        if(mat[i][j]==1)
		        {
		            char l=Character.toUpperCase(up[i][j]);
		            up[i][j]=l;
		        }
		    }
		}
			for(i=1;i<=r;i++)
		{
		    for(j=1;j<=c;j++)
		    {
		        System.out.print(up[i][j]+" ");
		    }
		    System.out.println();
		}
		
	}
}