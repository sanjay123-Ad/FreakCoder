/*The program must accept two string values S and P containing only alphabets as the input. The program must print all possible substrings of S that match the pattern P. If a substring matches the pattern P, then the case of each alphabet in the pattern P matches with the corresponding alphabet in the substring. The substrings must be printed in the order of their occurrence. If there is no such substring in S, then the program must print -1 as the output. 
Boundary Condition(s): 
1 <= Length of P <= Length of S <= 1000 
Input Format: 
The first line contains S. 
The second line contains P. 
Output Format: 
The lines, each contains a substring matches the pattern P or the first line contains -1. 
Example Input/Output 1: 
Input: 
SkillRack 
Do 
Output: 
Sk 
Ra 
Explanation: 
Here the given pattern is Do. The case of each alphabet in the pattern Do matches the substrings Sk and Ra. Hence the output is Sk Ra 
Example Input/Output 2: 
Input: 
AtAAnTheIsWasWere 
IoT 
Output: 
AtA 
AnT 
IsW 
Example Input/Output 3: 
Input: 
Mountain 
HI 
Output: 
-1
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
		String s1=in.next();
		String s2=in.next();
		int len1=s1.length();
		int len2=s2.length();
		int i;
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		int[] arr1=new int[len1+1];
		int[] arr2=new int[len2+1];
		for(i=0;i<len1;i++)
		{
		    
		    if(Character.isUpperCase(ch1[i]))
		    {
		        arr1[i]=1;
		    }
		    else{
		        arr1[i]=0;
		    }
		}
		for(i=0;i<len2;i++)
		{
		    
		    if(Character.isUpperCase(ch2[i]))
		    {
		        arr2[i]=1;
		    }
		    else{
		        arr2[i]=0;
		    }
		}
		
	    String str="";
	    int b=1,c=0,a=1;
	    int v=len1-len2;
		for(i=0;i<len1;i++)
		{
		    
		    for(int j=i;b<=len2;j++)
		    {
		        
		        if(arr1[j]==arr2[b-1])
		        {
		            str+=ch1[j];
		            c++;
		        }
		        else 
		        {
		            break;
		        }
		        b++;
		    }
		    if(str.length()==len2)
		    {
		        a=0;
		        System.out.println(str);
		    }
		    str="";
		    c=0;
		    b=1;
		    if(v==i)
		    {
		        break;
		    }
		}
		if(a==1)
		{
		    System.out.println("-1");
		}
	}
}