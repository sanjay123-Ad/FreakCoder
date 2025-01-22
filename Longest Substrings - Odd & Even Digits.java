/*The program must accept a string S containing only digits as the input. The program must print the longest substring with alternating odd/even or even/odd digits. If two or more substrings have the same length, then the program must print the substring that occurs first. 
Note: At least one odd digit and one even digit are always present in the string S. 
Boundary Condition(s): 
2 <= Length of S <= 1000 
Input Format: 
The first line contains S. 
Output Format: 
The first line contains the longest substring with alternating odd/even or even/odd digits. 
Example Input/Output 1: 
Input: 
336535383274365585552449775932 
Output: 
383274365 
Explanation: 
Here the given string is 336535383274365585552449775932. The longest substring with alternating odd/even digits is highlighted below. 336535383274365585552449775932 So 383274365 is printed as the output. 
Example Input/Output 2: 
Input: 
001234567890098765432100 
Output: 
01234567890

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
	    String s=in.next();
	    int len=s.length();
	    int i;
	    int[] num=new int[len+1];
	    int[] count=new int[len+1];
	    for(i=0;i<len;i++)
	    {
	        char[] ch=s.toCharArray();
	        num[i]=Character.getNumericValue(ch[i]);
	        count[i]=1;
	        
	    }
	    for(i=0;i<len;i++)
	    {
	       System.out.println(num[i]+" "+count[i]); 
	    }
	    System.out.println("after ....");
	    for(i=0;i<len;i++)
	    {
	        if((num[i]%2==0 && num[i+1]%2!=0)||(num[i]%2!=0 && num[i+1]%2==0))
	        {
	            count[i+1]+=count[i];
	        }
	        else
	        {
	            count[i+1]=1;
	        }
	    }
	    int max=0,index=0,start;
	    for(i=0;i<len;i++)
	    {
	       if(max<count[i])
	       {
	           max=count[i];
	           index=i;
	       }
	       
	    }
	    System.out.println(max);
	    start=index-max+1;
	    for(i=start;i<=index;i++)
	    {
	        System.out.print(num[i]);
	    }
	    
	}
}