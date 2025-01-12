/*The program must accept the position of a queen and the position of a knight in a chess board of size 8*8 as the input. The program must generate a matrix of size 8*8 representing the chess board and fill the matrix based on the following conditions. - The position of the queen must be filled with the character Q. - The position of the knight must be filled with the character K. - All positions where the queen can move must be filled with the character q. - All positions where the knight can move must be filled with the character k. - If both queen and knight meet in a position(other than the positions of the queen and the knight), then it must be filled with the character x. - All remaining positions must be filled with 0. Finally, the program must print the matrix as the output. 
Note: In Chess, queen can move any direction diagonally. The queen can also move left or right along the row it is present. The queen can also move up or down along the column it is present. The movement can happen till the end of the board is reached. In Chess, knight can move two squares vertically and one square horizontally, or two squares horizontally and one square vertically (with both forming the shape of an L). 
Input Format: 
The first line contains two integer values representing the position of a queen in a chess board. The second line contains two integer values representing the position of a knight in a chess board. 
Output Format: 
The lines contain a matrix representing the chess board. 
Example Input/Output 1: 
Input: 
2 2 
4 8 
Output:
q q q 0 0 0 0 0 
q Q q q q q x q 
q q q 0 0 k 0 0 
0 q 0 q 0 0 0 K
0 q 0 0 q k 0 0 
0 q 0 0 0 q k 0 
0 q 0 0 0 0 q 0
0 q 0 0 0 0 0 q
Explanation: 
The position of the queen is (2, 2), which is filled with the character Q. The position of the knight is (4, 8), which is filled with the character K. All positions where the queen can move are filled with the character q. All positions where the knight can move are filled with the character k. The only position where both the queen and the knight meet is (2, 7), which is filled with the character x. All remaining positions are filled with 0. 
Example Input/Output 2: 
Input: 
3 1 
5 5 
Output: 
q 0 q 0 0 0 0 0 
q q 0 0 0 0 0 0 
Q q q x q x q q 
q q k 0 0 0 k 0 
q 0 q 0 K 0 0 0 
q 0 k q 0 0 k 0 
q 0 0 k q k 0 0 
q 0 0 0 0 q 0 0 
Example Input/Output 3: 
Input: 
3 3 
4 5 
Output: 
q 0 q 0 q 0 0 0 
0 q q x 0 k 0 0 
q q Q q q q x q 
0 q q q K 0 0 0 
q 0 x 0 q 0 k 0 
0 0 q k 0 x 0 0 
0 0 q 0 0 0 q 0 
0 0 q 0 0 0 0 q
*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int qp1,qp2,kp1,kp2;
		qp1=in.nextInt();
		qp2=in.nextInt();
		kp1=in.nextInt();
		kp2=in.nextInt();
		char[][] CB=new char[900][900];
		int i,j;
		for(i=1;i<=8;i++)
		{
		    for(j=1;j<=8;j++)
		    {
		        if(i==qp1 && j==qp2)
		        {
		            CB[i][j]='Q';
		        }
		        else if(i==kp1 && j==kp2)
		        {
		            CB[i][j]='K';
		        }
		        else 
		        {
		            CB[i][j]='0';
		        }
		    }
		}
		//lets write for queen tracks
		int l=qp1,q=qp2;
		while(l>=1)
		{
		    l--;
		}
		l++;
		while(l<=8)
		{
		    if(l==qp1 && q==qp2)
		    {
		        CB[l][q]='Q';
		    }
		    else if(l==kp1 && q==kp2)
		    {
		        CB[l][q]='K';
		    }
		    else{
		        CB[l][q]='q';
		    }
		    l++;
		    
		}
		while(q>=1)
		{
		    q--;
		}
		q++;
		l=qp1;
		while(q<=8)
		{
		   if(l==qp1 && q==qp2)
		    {
		        CB[l][q]='Q';
		    }
		    else if(l==kp1 && q==kp2)
		    {
		        CB[l][q]='K';
		    }
		    else{
		        CB[l][q]='q';
		    }
		    q++;
		    
		}
		
		int a=qp1,b=qp2;
		while(a>=1 && b>=1)
		{
		    if(a>=1 && b>=1)
		    {
		        
		      a--;
		      b--;  
		    }
		    
		}
		a++;b++;
		System.out.println(a+" "+b);
		while(a<=8 && b<=8)
		{
		    if(a==qp1 && b==qp2)
		    {
		      CB[a][b]='Q';
		    }
		    else if(a==kp1 && b==kp2)
		    {
		        CB[a][b]='K';
		    }
		    else{
		        CB[a][b]='q';
		    }
		    a++;b++;
		    
		}
		
		a=qp1;
		b=qp2;
		while(a>=1 && b<=8)
		{
		    if(a>=1 && b<=8)
		    {
		        
		      a--;
		      b++;  
		    }
		    
		}
		a++;
		b--;
		System.out.println(a+" "+b);
		while(a<=8 && b>=1)
		{
		    if(a==qp1 && b==qp2)
		    {
		      CB[a][b]='Q';
		    }
		    else if(a==kp1 && b==kp2)
		    {
		        CB[a][b]='K';
		    }
		    else{
		        CB[a][b]='q';
		    }
		    a++;b--;
		    
		}
		
		
		int c=kp1,d=kp2;
		if(c-1>=1 && d-2>=1)
		{
		    if(CB[c-1][d-2]=='q')
		    {
		        CB[c-1][d-2]='x';
		    }
		    else if(CB[c-1][d-2]!='Q')
		    {
		        CB[c-1][d-2]='k';
		    }
		}
		if(c+1<=8 && d-2>=1)
		{
		    if(CB[c+1][d-2]=='q')
		    {
		        CB[c+1][d-2]='x';
		    }
		    else if(CB[c+1][d-2]!='Q')
		    {
		        CB[c+1][d-2]='k';
		    }
		}
		if(c-1>=1 && d+2<=8)
		{
		    if(CB[c-1][d+2]=='q')
		    {
		        CB[c-1][d+2]='x';
		    }
		    else if(CB[c-1][d+2]!='Q')
		    {
		        CB[c-1][d+2]='k';
		    }
		}
		if(c+1<=8 && d+2<=8)
		{
		    if(CB[c+1][d+2]=='q')
		    {
		        CB[c+1][d+2]='x';
		    }
		    else if(CB[c+1][d+2]!='Q')
		    {
		        CB[c+1][d+2]='k';
		    }
		}
		if(c-2>=1 && d-1>=1)
		{
		    if(CB[c-2][d-1]=='q')
		    {
		        CB[c-2][d-1]='x';
		    }
		    else if(CB[c-2][d-1]!='Q')
		    {
		        CB[c-2][d-1]='k';
		    }
		}
		if(c-2>=1 && d+1<=8)
		{
		    if(CB[c-2][d+1]=='q')
		    {
		        CB[c-2][d+1]='x';
		    }
		    else if(CB[c-2][d+1]!='Q')
		    {
		        CB[c-2][d+1]='k';
		    }
		}
		if(c+2<=8 && d-1>=1)
		{
		    if(CB[c+2][d-1]=='q')
		    {
		        CB[c+2][d-1]='x';
		    }
		    else if(CB[c+2][d-1]!='Q')
		    {
		        CB[c+2][d-1]='k';
		    }
		}
		if(c+2<=8 && d+1<=8)
		{
		    if(CB[c+2][d+1]=='q')
		    {
		        CB[c+2][d+1]='x';
		    }
		    else if(CB[c+2][d+1]!='Q')
		    {
		        CB[c+2][d+1]='k';
		    }
		}

		for(i=1;i<=8;i++)
		{
		    for(j=1;j<=8;j++)
		    {
		       
		       System.out.print(CB[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}