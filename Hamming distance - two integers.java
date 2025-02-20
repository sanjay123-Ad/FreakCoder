/*The program must accept two integer values A and B. Then the program must print the Hamming Distance between them. 
Note: The Hamming distance between two integers is the number of positions at which the bits are different. 
Boundary Condition(s): 
1 <= A, 
B <= 10^8 
Input Format: 
The first line contains A and B separated by a space. 
Output Format: 
The first line contains an integer representing the Hamming Distance between A and B. 
Example Input/Output 1: 
Input: 
12 4 
Output: 
1 
Explanation: 
The binary representation of 12 is 1100. 
The binary representation of 4 is 0100. 
The bits are different only in the first position. 
Example Input/Output 2: 
Input: 
10 5 
Output: 
4
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
		int a,b;
		a=in.nextInt();
		b=in.nextInt();
		String A=Integer.toBinaryString(a);
		String B=Integer.toBinaryString(b);
		System.out.println(a+" "+A);
		System.out.println(b+" "+B);
		int la=A.length();
		int lb=B.length();
		System.out.println(la+" "+lb);
		if(la<lb)
		{
		    int p=lb-la;
		    for(int i=1;i<=p;i++)
		    {
		        A="0"+A;
		    }
		}
		else{
		    int p=la-lb;
		    for(int i=1;i<=p;i++)
		    {
		        B="0"+B;
		    }
		}
		System.out.println(a+" "+A);
		System.out.println(b+" "+B);
		char[] ch1=A.toCharArray();
		char[] ch2=B.toCharArray();
		int c=0;
		int len=A.length();
		for(int i=0;i<len;i++)
		{
		    System.out.println(ch1[i]+" "+ch2[i]);
		    if(ch1[i]!=ch2[i])
		    {
		        c++;
		    }
		}
	    System.out.println(c);
	}
}