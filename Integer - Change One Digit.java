/*The program must accept two integers N and K as the input. The program must form 10 integers by changing the Kth digit in the integer N. Then the program must print the 10 integers in sorted order as the output. 
Note: The value of K is always less than or equal to the number of digits in N. 
Boundary Condition(s): 
1 <= N <= 10^8 
Input Format: 
The first line contains N and K separated by a space. 
Output Format: 
The first line contains 10 integers separated by a space. 
Example Input/Output 1: 
Input: 
1234 2 
Output: 
1034 1134 1234 1334 1434 1534 1634 1734 1834 1934 
Explanation: 
Here N = 1234 and K = 2. 
The 10 integers formed by changing the 2nd digit in 1234 are given below. 
1034 1134 1234 1334 1434 1534 1634 1734 1834 1934 
So these 10 integers are printed in sorted order.
 Example Input/Output 2: 
Input: 
105 1
Output: 
5 105 205 305 405 505 605 705 805 905
*/
// Using Java Code
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n,d;
	n=in.nextInt();
	d=in.nextInt();
	int a=n,b=n;
	int c=0;
	while(a!=0)
	{
	    a/=10;
	    c++;
	}
	System.out.println(c);
	int i;
	int[] arr=new int[9000];
	for(i=c;i>=1;i--)
	{
	   arr[i]=b%10;
	   b/=10;
	}
	
	int r=0,t=c-1,tot=0;
	for(i=0;i<=9;i++)
	{
	    for(int j=1;j<=c;j++)
	    {
	        if(d==j)
	        {
	            arr[j]=r;
	        }
	       tot += arr[j] * Math.pow(10, t);
	       t--;
	    }
	    t=c-1;
	    r++;
	    System.out.print(tot+" ");
	    tot=0;
	}
	}
}