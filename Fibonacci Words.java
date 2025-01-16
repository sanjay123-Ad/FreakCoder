/*The program must accept an integer N as the input. The program must print the first N Fibonacci words formed by repeating them in the same way as generating Fibonacci numbers. The first term in the Fibonacci words must be "a" and the second term in the Fibonacci words must be "b". 
Boundary Condition(s): 
1 <= N <= 25 
Input Format: 
The first line contains N.
 Output Format: 
The first line contains the first N Fibonacci words. 
Example Input/Output 1: 
Input: 
6 
Output: 
a b ba bab babba babbabab 
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
		String s1,s2;
		s1="a";
		s2="b";
		int i;
		String[] words=new String[9000];
		words[1]="a";
		words[2]="b";
		for(i=3;i<=n;i++)
		{
		   words[i]=words[i-1]+words[i-2];
		}
		for(i=1;i<=n;i++)
		{
		    System.out.print(words[i]+" ");
		}
	}
}