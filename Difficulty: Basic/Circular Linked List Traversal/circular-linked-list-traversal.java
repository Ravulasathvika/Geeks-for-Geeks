//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
    
}
class GFG{
    public static void main(String args[]) throws IOException { 
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t > 0){
        
        	int n = sc.nextInt();
        
            Node head = new Node(sc.nextInt());
            Node tail = head;
        
            for(int i=0; i<n-1; i++)
            {
                Node newNode = new Node(sc.nextInt());
                newNode.next=head;
                head=newNode;
            }
            tail.next=head;
        
            Solution ob = new Solution();
            ob.printList(head);
            System.out.println();
            t--;
        
System.out.println("~");
}
    } 
} 
  
// } Driver Code Ends


//User function Template for Java


/* Node of a linked list
 class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
    
}
*/

class Solution
{
        /* Function to print nodes in a given Circular linked list */
	    void printList(Node head)
        {
             // Your code here
            if(head==null)
            {
                return;
            }
            Node temp=head;
            while(true)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
                if(temp==head)
                {
                    break;
                }
            }
             
           
	    }
}