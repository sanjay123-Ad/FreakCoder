/*The program must accept a matrix of size RxC containing only words as the input. All words in the matrix have the same length as 9. The program must form a character matrix of size (R*3)x(C*3) by expanding the each word to a 3*3 character matrix based on the following conditions. - The 1st row of the 3*3 matrix must be formed using the first 3 characters of the word. - The 2nd row of the 3*3 matrix must be formed using the middle 3 characters of the word. - The 3rd row of the 3*3 matrix must be formed using the last 3 characters of the word. Finally, the program must print the character matrix as the output. 
Boundary Condition(s): 
1 <= R, 
C <= 50 
Input Format: 
The first line contains R and C separated by a space. 
The next R lines, each contains C words separated by a space. 
Output Format: 
The first R*3 lines, each contains C*3 characters separated by a space.
Example Input/Output 1: 
Input: 
3 3 
skillrack chocolate IMPORTANT 
Knowledge Seventeen vegetable 
Crocodile nutrition Fireboard 
Output: 
s k i c h o I M P 
l l r c o l O R T 
a c k a t e A N T 
K n o S e v v e g 
w l e e n t e t a 
d g e e e n b l e 
C r o n u t F i r 
c o d r i t e b o 
i l e i o n a r d 
Explanation: 
Here 
R = 3 and C = 3. 
The word skillrack is expanded to a 3x3 character matrix as given below. 
s k i l l r a c k The word chocolate is expanded to a 3x3 character matrix as given below. 
c h o c o l a t e Similarly the remaining words are expanded to 3x3 character matrices. Hence the output is 
Example Input/Output 2: 
Input: 
3 4 
Challenge irregular PINEAPPLE halloween 
affection NUTRITION Crocodile beginning 
CONFUSION celebrity Delicious LIGHTNING 
Output: 
C h a i r r P I N h a l 
l l e e g u E A P l o w 
n g e l a r P L E e e n 
a f f N U T C r o b e g 
e c t R I T c o d i n n 
i o n I O N i l e i n g 
C O N c e l D e l L I G 
F U S e b r i c i H T N 
I O N i t y o u s I N G
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
		String[][] S=new String[r+1][c+1];
		
		int i,j,a=0,b=0;
		for(i=1;i<=r;i++)
		{
		    for(j=1;j<=c;j++)
		    {
		        S[i][j]=in.next();
		  
		    }
		}
		char[][] ch=new char[(r+1)*3][(c+1)*3];
		for(i=1;i<=r;i++)
		{
		    for(j=1;j<=c;j++)
		    {
		        String A=S[i][j];
		        fun(A,a,b,ch);
		        b+=3;
		    }
		    a+=3;
		    b=0;
		}
		for(i=1;i<=r*3;i++)
		{
		    for(j=1;j<=c*3;j++)
		    {
		        System.out.print(ch[i][j]+" ");
		    }
		    System.out.println();
		}
	}
	public static void fun(String A,int a,int b,char[][] ch)
	{
	    int i,j,z=0;
	    char[] v=A.toCharArray();
	    
	    for(i=1+a;i<=a+3;i++)
	    {
	        for(j=1+b;j<=b+3;j++)
	        {
	            ch[i][j]=v[z];
	            z++;
	        }
	    }
	    for(i=1+a;i<=a+3;i++)
	    {
	        for(j=1+b;j<=b+3;j++)
	        {
	            System.out.print(ch[i][j]+" ");
	        }
	        System.out.println();
	    }
	    
	}
}
