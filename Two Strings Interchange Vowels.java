/*The program must accept two string values S1, S2 (both having equal number of vowels) and interchange the vowels in the string values in their order of occurrence. 
Boundary Condition(s): 
1 <= Length of S1, 
S2 <= 1000 
Input Format: 
The first line contains S1. 
The second line contains S2. 
Output Format: 
The first line contains S1 with the vowels interchanged. 
The second line contains S2 with the vowels interchanged. 
Example Input/Output 1: 
Input: 
apple 
rain 
Output:
appli 
raen 
Explanation: 
Here S1 = apple and S2 = rain. After interchanging the vowels in the string values in their order of occurrence, the string values become S1 = appli and S2 = raen. 
Example Input/Output 2: 
Input: 
PANCAKE 
Umbrella 
Output: 
PUNCeKa 
AmbrAllE
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
		String s1,s2;
		s1=in.next();
		s2=in.next();
		int i,j=0;
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		int c;
		for(i=0;i<s1.length();i++)
		{
		    System.out.print(c1[i]+" ");
		}
		System.out.println();
		for(i=0;i<s2.length();i++)
		{
		    System.out.print(c2[i]+" ");
		}
			System.out.println();
		for(i=0;i<s1.length();i++)
		{
		    if(isVowel(c1[i]))
		    {
		        
		       c=check(c1,c2,i,j); 
		       j=c;
		       
		    }
		}
			for(i=0;i<s1.length();i++)
		{
		    System.out.print(c1[i]+" ");
		}
		System.out.println();
		for(i=0;i<s2.length();i++)
		{
		    System.out.print(c2[i]+" ");
		}
			System.out.println();
	}
	public static boolean isVowel(char ch)
	{
	    return "aeiouAEIOU".contains(String.valueOf(ch));
	}
	public static int check(char[] c1,char[] c2, int a,int j){
	    int i;
	    for(i=j;i<c2.length;i++)
	    {
	        if(isVowel(c2[i]))
	        {
	            swap(c1,c2,a,i);
	            break;
	        }
	    }
	    
	    return i+1;
	}
	public static void swap(char[] c1,char[] c2,int a,int i)
	{
	    
	    char temp=c1[a];
	    c1[a]=c2[i];
	    c2[i]=temp;
	    
	}
}