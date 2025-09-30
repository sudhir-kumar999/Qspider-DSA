//package Linked List;

public class Define_ll {
    Node head;

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    // add - first 
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;

        }
        newNode.next=head;
        head= newNode;
    }
    public static void main(String[] args) {
        Define_ll list = new Define_ll();
        list.addFirst("a");
        list.addFirst("b");
        list.addFirst();
        
    }
    
}
