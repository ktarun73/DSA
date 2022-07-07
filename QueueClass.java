public class QueueClass {
    static class queue{
        static int[] ar;
        static int size;
        static int rear=-1;
        queue(int size){
            this.size=size;
            ar=new int[size];
            rear=-1;
        }

        public static boolean isEmpty(){
            return rear==-1;
        }

        public static boolean isFull(){
            return rear==size-1;
        }

        public static void enqueue(int data){
            if(isFull()){
                System.out.println("OverFlow");
                return;
            }
            ar[++rear]=data;
        }

        public static  int dequeue(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            int front=ar[0];
            for (int i = 0; i < rear; i++) {
                ar[i]=ar[i+1];
            }
            rear--;
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return ar[0];
        }

    }
    public static void main(String[] args) {
        queue queue=new queue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        while (!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.dequeue();
        }

    }
}
