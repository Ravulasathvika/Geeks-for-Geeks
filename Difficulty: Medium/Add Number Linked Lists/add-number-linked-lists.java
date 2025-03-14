//{ Driver Code Starts
// driver

import java.io.*;
import java.util.*;


// } Driver Code Ends

/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution {
    static Node addTwoLists(Node num1, Node num2) {
        // code here
        Node dummy=new Node(0);
        Node curr=dummy;
        int carry=0;
        Node head1=reverse(num1);
        Node head2=reverse(num2);
        while(head1!=null || head2!=null || carry>0)
        {
            int sum=carry;
            if(head1!=null)
            {
                sum+=head1.data;
                head1=head1.next;
            }
            if(head2!=null)
            {
                sum+=head2.data;
                head2=head2.next;
            }
            carry=sum/10;
            curr.next=new Node(sum%10);
            curr=curr.next;
        }
        Node result=reverse(dummy.next);
        while (result != null && result.data == 0 && result.next != null) {
            result = result.next;
        }
        return result;
        
        
        
    }
    private static Node reverse(Node num)
    {
        Node next=null,prev=null;
        while(num!=null)
        {
            next=num.next;
            num.next=prev;
            prev=num;
            num=next;
            
            
        }
        return prev; 
    }
}


//{ Driver Code Starts.

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG {

    static void printList(Node n) {
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(read.readLine());
        while (T-- > 0) {

            String str[] = read.readLine().trim().split(" ");
            int n = str.length;

            Node num1 = new Node(Integer.parseInt(str[0]));
            Node tail = num1;
            for (int i = 1; i < n; i++) {
                int val = Integer.parseInt(str[i]);
                tail.next = new Node(val);
                tail = tail.next;
            }

            String str2[] = read.readLine().trim().split(" ");
            int m = str2.length;

            Node num2 = new Node(Integer.parseInt(str2[0]));
            tail = num2;
            for (int i = 1; i < m; i++) {

                tail.next = new Node(Integer.parseInt(str2[i]));
                tail = tail.next;
            }

            Solution g = new Solution();
            Node res = g.addTwoLists(num1, num2);
            printList(res);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends