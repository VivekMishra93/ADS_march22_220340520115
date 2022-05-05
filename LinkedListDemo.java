/* Question 2..
reverse linked list */

class LinkedListDemo{
 static Node head;
 static class Node{
   int data;
   Node next;
   Node(int a){
   data=a;
   next=null; 
   }

 }
  Node reverse(Node node)
  {
   Node pre=null;
    Node curr=node;
    Node next=null;
  
   while(curr !=null){
   
   next=curr.next;
   curr.next=pre;
   pre=curr;
   curr=next;
   
   }  
   node=pre;
   return node;
  
  
  }
  void printList(Node node){
  
  while(node !=null){
  System.out.println(node.data + " ");
  node=node.next;

  
  } 
  
  }
  public static void main(String args[]){
   LinkedListDemo l=new LinkedListDemo();
   l.head=new Node(1);
   l.head.next=new Node(2);
   l.head.next.next=new Node(3);
   l.head.next.next.next=new Node(4);
   l.head.next.next.next.next=new Node(5);
   System.out.println("Given linkedlist");
   l.printList(head);
   head=l.reverse(head);
   System.out.println(" ");
   System.out.println("Reverse linked list is");
   l.printList(head);
   
  
  
  }



}