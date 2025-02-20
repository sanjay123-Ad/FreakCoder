/*The program must accept N unique integers which are sorted (in either ascending or descending order) and print the ranges present. 
Boundary Condition(s): 
1 <= N <= 10^5 
Input Format: 
The first line contains N. 
The second line contains N integers separated by a space. 
Output Format: 
The first line contains the ranges separated by a space. 
Example Input/Output 1: 
Input: 
8 
0 1 2 3 4 6 7 9 
Output: 
0-4 6-7 9-9 
Explanation: 
The integers in the range 0-4 are 0, 1, 2, 3 and 4. 
The integers in the range 6-7 are 6 and 7. 
The only integer in the range 9-9 is 9. 
Example Input/Output 2: 
Input: 
6 
6 5 4 3 2 1 
Output: 
1-6 
Example Input/Output 3: 
Input: 
8 
9 7 6 4 3 2 1 0 
Output: 
9-9 6-7 0-4
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
		LinkedList list = new LinkedList();
		int n=in.nextInt();
		int[] s=new int[n+1];
		for(int i=1;i<=n;i++)
		{
		    s[i]=in.nextInt();
		}
		for(int i=n;i>=1;i--)
		{
		    list.insertFirst(s[i]);
		}
		list.display();
		if(n==1)
		{
		    System.out.println(s[1]+"-"+s[1]);
		}
		else{
		    if(s[1]>s[2])
		{
		    list.check1();
		}
		else{
		    list.check();
		}
		}
	
		
	}
	
}
class Node{
	    int value;
	    Node next;
	    Node(int value)
	    {
	        this.value=value;
	        this.next=null;
	    }
	}

class LinkedList{
    private Node head;
    private Node Tail;
    private int size;
    public LinkedList()
    {
        this.size=0;
    }
    public void insertFirst(int val)
	{
	    Node newNode =new Node(val);
	    newNode.next=head;
	    head=newNode;
	    if(Tail==null)
	    {
	        Tail=head;
	    }
	    size++;
	}
	public void display()
	{
	    Node temp =head;
	    System.out.println("head value :"+head.value);
	    System.out.println("tail value :"+Tail.value);
	    while(temp!=null)
	    {
	        
	        System.out.print(temp.value +" -> ");
	        temp=temp.next;
	    }
	    System.out.println("Null");
	}
	public void check1()
	{
	    Node H=head;
	    Node T=head;
	    int s=size;
	    System.out.println(s);
	    System.out.println("H -> "+H.value);
	    System.out.println("T -> "+T.value);
	    while( T!=null)
	    {
	        if(T.value-1==T.next.value)
	        {
	            T=T.next;
	        }
	        else{
	            System.out.println("Tail -> "+T.value+"Head -> "+H.value);
	            H=T.next;
	            T=H;
	            
	           
	        }
	        s--;
	        if(s==1)
	        {
	            System.out.println("Tail -> "+T.value+"Head -> "+H.value);
	            break;
	        }
	    }
	}
	public void check()
	{
	    Node H=head;
	    Node T=head;
	    int s=size;
	    System.out.println(s);
	    System.out.println("H -> "+H.value);
	    System.out.println("T -> "+T.value);
	    while( T!=null)
	    {
	        if(T.value+1==T.next.value)
	        {
	            T=T.next;
	        }
	        else{
	            System.out.println("Head -> "+H.value+"Tail -> "+T.value);
	            H=T.next;
	            T=H;
	            
	           
	        }
	        s--;
	        if(s==1)
	        {
	            System.out.println("Head -> "+H.value+"Tail -> "+T.value);
	            break;
	        }
	    }
	}
    
}