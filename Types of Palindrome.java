/*The program must accept a string S as the input. The program must calculate the palindrome points for the given string S based on the following conditions. 
- If all alphabets in S form a palindrome, then it has 1 point. - If all digits in S form a palindrome, then it has 1 point. 
- If the string S itself is a palindrome, then it has 1 point. The program must print the output based on the following conditions.
 - If S has 3 palindrome points, then the program must print the string value "Triple Palindrome". 
- If S has 2 palindrome points, then the program must print the string value "Double Palindrome". 
- If S has 1 palindrome point, then the program must print the string value "Single Palindrome". 
- If S has no palindrome points, then the program must print the string value "No Palindrome".
Boundary Condition(s): 
2 <= Length of S <= 100 
Input Format: 
The first line contains S. 
Output Format: 
The first line contains a string value as per the given conditions.
Example Input/Output 1: 
Input: 
m7ada7m 
Output: 
Triple Palindrome 
Explanation: 
Here the given string is m7ada7m, which is a palindrome. So the palindrome points become 1. All alphabets in the string m7ada7m form the palindrome madam. So the palindrome points become 2. All digits in the string m7ada7m form the palindrome 77. So the palindrome points become 3. Hence the output is Triple Palindrome 
Example Input/Output 2: 
Input: 
a34bc143ba 
Output: 
Double Palindrome 
Example Input/Output 3: 
Input: 
A99S74DF799ASDF 
Output: 
Single Palindrome 
Example Input/Output 4: 
Input: 
skillrack 
Output: 
No Palindrome
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
		int count=0;
		for(int i=1;i<=3;i++)
		{
		    if(i==1)
		    {
		        System.out.println("overall part");
		        int len=s.length();
		        System.out.println(len);
		         if(len==0)
		        {
		            //do nothing
		        }
		        else{
		            count+=fun(s,len);
		        }
		    }
		    else if(i==2)
		    {
		        System.out.println("character part");
		        String a=s.replaceAll("\\d", "");
		        int len=a.length();
		        
		         if(len==0)
		        {
		            //do nothing
		        }
		        else{
		            System.out.println("function call");
		            count+=fun(a,len);
		        }
		    }
		    else if(i==3)
		    {
		        System.out.println("digit part");
		        String a=s.replaceAll("\\D+", "");
		        int len=a.length();
		        System.out.println(len);
		        System.out.println("digitlength"+len);
		        if(len==0)
		        {
		           //do nothing
		        }
		        else{
		            count+=fun(a,len);
		        }
		        
		    }
		}
		if(count==0)
		{
		    System.out.println("No Palindrome");
		}
		else if(count==1)
		{
		    System.out.println("Single Palindrome");
		}
		else if(count==2)
		{
		    System.out.println("Double Palindrome");
		}
		else 
		{
		    System.out.println("Triple Palindrome");
		}
	}
	public static int fun(String s, int len)
	{
	    System.out.println("fun :"+s);
	    int i,l=len-1,v=0;
	    char[] ch=s.toCharArray();
	    for(i=0;i<=len/2;i++)
	    {
	        if(ch[i]==ch[l])
	        {
	            System.out.println(ch[i]+" "+ch[l]);
	            v++;
	        }
	        else{
	            break;
	        }
	        l--;
	    }
	    System.out.println(v);
	    if(v==(len/2)+1)
	    {
	        return 1;
	    }
	    else{
	        return 0;
	    }
	}
}