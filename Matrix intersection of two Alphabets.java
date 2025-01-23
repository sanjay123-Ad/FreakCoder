/*The program must accept two string values S1 and S2 of equal length as the input. The program must form a matrix of size 26*26 based on the following conditions.
- The 1st row contains the 26 alphabets from a to z.
 - The 2nd row contains the 26 alphabets from b to a circularly.
 - The 3rd row contains the 26 alphabets from c to b circularly. 
- The 4th row contains the 26 alphabets from d to c circularly.
 - Similarly, the remaining rows in the matrix must be formed. 
Each column has a name, which is similar to the first alphabet in that column. 
Each row has a name, which is similar to the first alphabet in that row. 
Then the program must print the output based on the following conditions. 
- The alphabets in S1 represent the names of the rows and the alphabets in S2 represent the names of the columns. 
- For the alphabets in the same position in S1 and S2 (left to right), the program must print the alphabet present at the intersection of those two alphabets in the matrix. 
Note: The string values S1 and S2 contain only lower case alphabets. 
Boundary Condition(s): 
1 <= Length of S1, 
S2 <= 10^4 
Input Format: 
The first line contains S1. 
The second line contains S2. 
Output Format: The first line contains a string value based on the given conditions. 
Example Input/Output 1: 
Input: 
pollution 
wrestling 
Output: 
lfpdneqbt 
Explanation: The 26*26 matrix is given below. 
abcdefghijklmnopqrstuvwxyz 
bcdefghijklmnopqrstuvwxyza 
cdefghijklmnopqrstuvwxyzab 
defghijklmnopqrstuvwxyzabc 
efghijklmnopqrstuvwxyzabcd 
fghijklmnopqrstuvwxyzabcde
ghijklmnopqrstuvwxyzabcdef 
hijklmnopqrstuvwxyzabcdefg 
ijklmnopqrstuvwxyzabcdefgh 
jklmnopqrstuvwxyzabcdefghi 
klmnopqrstuvwxyzabcdefghij 
lmnopqrstuvwxyzabcdefghijk 
mnopqrstuvwxyzabcdefghijkl 
nopqrstuvwxyzabcdefghijklm 
opqrstuvwxyzabcdefghijklmn 
pqrstuvwxyzabcdefghijklmno 
qrstuvwxyzabcdefghijklmnop 
rstuvwxyzabcdefghijklmnopq 
stuvwxyzabcdefghijklmnopqr 
tuvwxyzabcdefghijklmnopqrs 
uvwxyzabcdefghijklmnopqrst 
vwxyzabcdefghijklmnopqrstu 
wxyzabcdefghijklmnopqrstuv 
xyzabcdefghijklmnopqrstuvw 
yzabcdefghijklmnopqrstuvwx 
zabcdefghijklmnopqrstuvwxy 
The intersection of p and w contains l. So l is printed. The intersection of o and r contains f. So f is printed. Similarly, the remaining characters are printed as the output. 
Example Input/Output 2: 
Input: 
understand 
confidence 
Output:
wbqjzvxnph
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
		String s1,s2,res;
		s1=in.next();
		s2=in.next();
		res="";
		char[][] alpha=new char[27][27];
		int i,j;
		int start=97,a=97;
		for(i=1;i<=26;i++)
		{
		    for(j=1;j<=26;j++)
		    {
		        alpha[i][j]=(char)start;
		        start++;
		        if(start==123)
		        {
		            start=97;
		        }
		    }
		    a++;
		    start=a;
		    
		}
		for(i=1;i<=26;i++)
		{
		    for(j=1;j<=26;j++)
		    {
		        System.out.print(alpha[i][j]+" ");
		    }
		    System.out.println();
		    
		}
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		for(i=0;i<s1.length();i++)
		{
		    for(int k=1;k<=26;k++)
		    {
		        if(alpha[1][k]==ch1[i])
		        {
		            for(j=1;j<=26;j++)
		            {
		                if(alpha[j][1]==ch2[i])
		                {
		                    System.out.println(k+" "+j);
		                    res+=alpha[k][j];
		                }
		            }
		        }
		    }
		}
		System.out.println(res);
	}
}