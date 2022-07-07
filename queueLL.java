public class queueLL {

    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            next=null;
        }
    }

    static class queue{
        static Node head=null;
        static Node tail=null;

        public static boolean isEmpty(){
            return head==null && tail==null;
        }
        public static void add(int data){
            Node newNode=new Node(data);
            if(isEmpty()){
                head=newNode;
                tail=newNode;
            }
            else{
                tail.next=newNode;
                tail=newNode;
            }
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            if(head==tail){
                tail=null;
            }
            int val= head.val;
            head=head.next;
            return val;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }

            return head.val;
        }
    }



    public static void main(String[] args) {
            queue queue=new queue();
            queue.add(1);
            queue.add(2);
            queue.add(3);
            queue.add(4);
            while (!queue.isEmpty()){
                System.out.println(queue.peek());;
                queue.remove();
            }
            queue.remove();
    }
}
