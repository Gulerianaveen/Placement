
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
class Solution {
    Node insertAtEnd(Node head, int x) {
        if(head==null){
            return new Node(x);
        }
        
        Node newNode=new Node(x);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return head;
    }
}