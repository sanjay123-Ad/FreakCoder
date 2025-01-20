/*The program must accept an integer N as the input. The program must print YES if it not possible to form a prime number by replacing exactly one digit in N with any digit from 0 to 9. Else the program must print NO as the output. 
Note: The value of N is always a composite number. 
Boundary Condition(s): 
4 <= N <= 10^8 
Input Format: 
The first line contains N. 
Output Format: 
The first line contains YES or NO. 
Example Input/Output 1: 
Input: 
200 
Output: 
YES 
Explanation: 
Here N = 200. All possible integers that can be formed by replacing exactly one digit in 200 are given below. 
Replacing 1st digit -> 0, 100, 300, 400, 500, 600, 700, 800, 900 
Replacing 2nd digit -> 210, 220, 230, 240, 250, 260, 270, 280, 290 
Replacing 3rd digit -> 201, 202, 203, 204, 205, 206, 207, 208, 209 
It is not possible to form a prime integer from the given integer 200. So YES is printed as the output. 
Example Input/Output 2: 
Input: 
14 
Output: 
NO 
Explanation: 
Here N = 14. 
All possible integers that can be formed by replacing exactly one digit in 14 are given below. 
Replacing 1st digit -> 4, 24, 34, 44, 54, 64, 74, 84, 94 
Replacing 2nd digit -> 10, 11, 12, 13, 15, 16, 17, 18, 19 
The integers 11, 13, 17 and 19 are prime numbers. So NO is printed as the output.
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
	int n,d,l=0;
	n=in.nextInt();
	int a=n,b=n;
	int c=0;
	while(a!=0)
	{
	    a/=10;
	    c++;
	}
	System.out.println(c);
	int g=0;
	for(int i=1;i<=c;i++)
	{
	    d=i;
	    g+=fun(n,d,c,l);
	    System.out.println();
	}
    if(g==0)
    {
        System.out.println("YES");
    }
    else{
        System.out.println("NO");
    }
	}
	public static int fun(int n,int d,int c,int l)
	{
	    int i,b=n;
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
	    int num=tot;
	    if (isPrime(num)) {
            
            l++;
        }

	    tot=0;
	}
	return l;
	}
	
    public static boolean isPrime(int num) {
        if (num <= 1) return false; // 0 and 1 are not prime numbers
        for (int i = 2; i <= Math.sqrt(num); i++) { // Loop up to the square root of num
            if (num % i == 0) return false; // If divisible, not a prime
        }
        return true; // If no divisors found, it's prime
    }
}