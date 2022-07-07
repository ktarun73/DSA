public class DoublyLL {
    Node head;
    class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
            next=null;
            prev=null;
        }
    }

    public void addFirst(int val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;

    }

    public void addLast(int val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
            return;
        }
        Node curNode=head;
        while(curNode.next!=null){
            curNode=curNode.next;
        }
        curNode.next=newNode;
        newNode.prev=curNode;
    }
    public void printList(){
        if(head==null){
            System.out.println("Empty List");
            return;
        }
        Node curNode=head;
        while (curNode.next!=null){
            System.out.print(curNode.val+" -> ");
            curNode=curNode.next;
        }
        System.out.println("null");
    }
    public void printRevList(){
        if(head==null){
            System.out.println("Empty List");
            return;
        }
        Node curNode=head;
        while (curNode.next!=null){
            curNode=curNode.next;
        }
        while (curNode.prev!=null){
            System.out.print(curNode.val+" -> ");
            curNode=curNode.prev;
        }
    }
    public void revList(){
        if(head==null){
            System.out.println("Empty List");
            return;
        }
        Node curNode=head;
        while (curNode.next!=null){
            curNode=curNode.next;
        }
        head=curNode;
        while (curNode.next!=null){
            Node temp=curNode.prev;
            curNode.prev=curNode.next;
            curNode.next=temp;
        }



    }
    public static void main(String[] args) {
        DoublyLL list=new DoublyLL();
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addFirst(0);
        list.revList();
        list.printList();
//        list.printRevList();
    }
}
