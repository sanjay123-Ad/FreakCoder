/*The program must accept the pattern and the key of a digital lock as the input. The key of the digital lock contains only digits. The pattern of the digital lock contains four rows of 0s and 1s, where each column(from top to bottom) represents the 4-bit binary representation of the corresponding digit in the key. The program must print YES if the pattern matches the key. Else the program must print NO as the output. Note: The length of each row in the pattern and the length of the key are always equal. 
Boundary Condition(s): 
1 <= Length of the key <= 100 
Input Format: 
The first four lines contain the pattern. The fifth line contains the key. 
Output Format: 
The first line contains Yes or No. 
Example Input/Output 1: 
Input: 
011000 
100010 
100001 
111011 
799053 
Output: 
YES 
Explanation: 
1st digit: 7 -> 0111 (1st column) 
2nd digit: 9 -> 1001 (2nd column) 
3rd digit: 9 -> 1001 (3rd column) 
4th digit: 0 -> 0000 (4th column) 
5th digit: 5 -> 0101 (5th column) 
6th digit: 3 -> 0011 (6th column) 
Here the pattern matches the key, so YES is printed as the output. 
Example Input/Output 2: 
Input: 
00001000100 
01010110010 
11010111011 
11001101011 
37069673872 
Output: 
NO
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
		String[] key=new String[5];
		
		int i,j;
		for(i=0;i<4;i++)
		{
		    System.out.println("enter the key "+(i+1)+" : ");
		    key[i]=in.next();
		}
		String digit=in.next();
		int size=key[0].length();
		for(i=0;i<4;i++)
		{
		    System.out.println(key[i]);
		}
		
		char[][] C=new char[4][size];
		int c;
		for(i=0;i<4;i++)
		{
		    char[] ch=key[i].toCharArray();
		    System.out.println(key[i].length());
		    for(j=0;j<size;j++)
		    {
		        C[i][j]=ch[j];
		    }
		}
		for(i=0;i<4;i++)
		{
		    for(j=0;j<size;j++)
		    {
		        System.out.print(C[i][j]+" ");
		    }
		    System.out.println();
		}
		char[] S1=digit.toCharArray();
		int tot=0,v=4-1,b=1;
		System.out.println("size: "+size);
		for(i=0;i<size;i++)
		{
		    System.out.println("I: "+i);
		    for(j=0;j<4;j++)
		    {
		        int a = Character.getNumericValue(C[j][i]);
		        if(a==1)
		        {
		            tot+=a*Math.pow(2,v);
		        }
		        else{
		            tot+=0;
		        }
		        v--;
		    }
		    System.out.println(i+" "+tot+" ");
		    v=4-1;
		    int S=Character.getNumericValue(S1[i]);
		    if(S!=tot)
		    {
		        b=0;
		        break;
		    }
		    tot=0;
		}
		if(b==1)
		{
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}
		
		
	}
}