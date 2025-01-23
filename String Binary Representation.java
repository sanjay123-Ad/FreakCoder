/*The program must accept two string values S1 and S2 as the input. The string S1 always contains only 8 lower case alphabets representing 8 bits of a byte. For each character in the string S2, the program must find the binary representation (8 bits) of its ASCII value. Then the program must convert the binary representation of each character to the string S1 based on the following condition. - Replace each bit with the corresponding alphabet in S1. If it is 0, then the alphabet must be in lower case. Else the alphabet must be in upper case. Finally, the program must print the string values obtained as the output. 
Boundary Condition(s): 
1 <= Length of S2 <= 100 
Input Format: 
The first line contains S1. 
The second line contains S2. 
Output Format: 
The first line contains the string values obtained separated by a space. 
Example Input/Output 1: 
Input: 
universe Hello 
Output: 
uNivErse uNIveRsE uNIvERse uNIvERse uNIvERSE 
Explanation: 
S1 = universe 
S2 = Hello 
ASCII value of H = 72 -> 01001000 -> uNivErse 
ASCII value of e = 101 -> 01100101 -> uNIveRsE 
ASCII value of l = 108 -> 01101100 -> uNIvERse 
ASCII value of l = 108 -> 01101100 -> uNIvERse 
ASCII value of o = 111 -> 01101111 -> uNIvERSE 
Example Input/Output 2: 
Input: 
goodluck 
123#5 
Output: 
goODlucK goODluCk goODluCK goOdluCK goODlUcK
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
		int i,j;
		int len=s2.length();
		char[] S1=s1.toCharArray();
		char a;
		for(i=0;i<len;i++)
		{
		    char[] ch=s2.toCharArray();
		    int ASC=(int) ch[i];
		    String BIT=Integer.toBinaryString(ASC);
		   
		    char[] bin=BIT.toCharArray();
		    int diff=s1.length()-BIT.length();
		    String add="";
		    for(int k=1;k<=diff;k++)
		    {
		      add+="0";  
		    }
		    add+=BIT;
		    for(j=0;j<add.length();j++)
		    {
		        char[] che=add.toCharArray();
		        if(che[j]=='1')
		        {
		           
		             a=Character.toUpperCase(S1[j]);
		        }
		        else{
		            a=S1[j];
		        }
		        System.out.print(a);
		    }
		    System.out.print(" ");
		}
	}
}