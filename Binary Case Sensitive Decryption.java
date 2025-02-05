/*The program must accept a string S representing an encrypted message as the input. The program must decrypt the string S and print the message based on the following conditions. - The program must split the string S into substrings of equal length 5. - For each substring, the program must form a binary representation by replacing the lower case alphabets with 0 and the upper case alphabets with 1. Then the program must find the decimal equivalent of each binary representation and replace them with the characters as given below. 
From 0 to 25 -> a to z. 
26 -> . (dot) 
27 -> , (comma) 
28 -> a SPACE character 
29 -> ? (question mark symbol) 
30 -> ' (single quote) 
31 -> " (double quote) 
Note: The string S contains only alphabets and its length is always a multiple of 5. 
Boundary Condition(s): 1 <= Length of S <= 1000 
Input Format: 
The first line contains S. 
Output Format: 
The first line contains the decrypted string based on the given conditions. 
Example Input/Output 1: 
Input: 
abcDEtSAYtmaRKs 
Output: 
dog 
Explanation: 
The given string is abcDEtSAYtmaRKs. 
The 1st substring is abcDE. The binary representation is 00011. 3 -> d. 
The 2nd substring is tSAYt. The binary representation is 01110. 14 -> o. 
The 3rd substring is maRKs. The binary representation is 00110. 6 -> g. 
So the decrypted string is dog, which is printed as the output. 
Example Input/Output 2: 
Input: 
EytWGeqNKYcbNpqLSXcoAHCUIbgrarZzcpRPvoYGYOQIUQAsHh 
Output: 
the "art".
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
		String s=in.next();
		int len=s.length();
		int i,j,a=0,c=0,tot=0;
		char[] t=s.toCharArray();
		int e=4;
		int[] arr=new int[32];
	    char[] alpha=new char[32];
	    char A='a';
		for(i=0;i<=25;i++)
		{
		   arr[i]=i;
		   alpha[i]=A;
		   A++;
		}
		
		alpha[26]='.';
		alpha[27]=',';
		alpha[28]=' ';
		alpha[29]='?';
		alpha[30]='\'';
		alpha[31]='"';
		for(i=0;i<=31;i++)
		{
		    System.out.println(arr[i]+" "+alpha[i]);
		}
		for(i=1;i<=len/5;i++)
		{
		    for(j=a;c<5;j++)
		    {
		        
		        c++;
		        if(Character.isUpperCase(t[j]))
		        {
		            tot+= Math.pow(2,e);
		            e--;
		        }
		        else{
		            e--;
		        }
		    }
		    e=4;
		    
		    for(int v=0;v<=31;v++)
		    {
		        if(tot==v)
		        {
		            System.out.print(alpha[v]);
		            break;
		        }
		    }
		    tot=0;
		  
		    a+=5;
		    c=0;
		}
		
	}
}