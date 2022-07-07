public class CircularQueueAr {
    static class queue{
        static int[] ar;
        static int size;
        static int rear=-1;
        static int front=-1;
        queue(int size){
            this.size=size;
            ar=new int[size];
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        public static void enqueue(int data){
            if(isFull()){
                System.out.println("OverFlow");
                return;
            }

            if(front==-1){
                front=0;
            }

            rear=(rear+1)%size;
            ar[rear]=data;
        }
        
        public static int deQueue(){
    
            if(isEmpty()){
                System.out.println("Empty Queue");
               return -1;
            }
            int res=ar[front];
            if(front==rear){
                front=-1;
                rear=-1;
            }else{
                front=(front+1)%size;
            }
            return res;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return ar[front];
        }
    }
    public static void main(String[] args) {
        queue queue=new queue(4);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        while (!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.deQueue();

        }
        queue.deQueue();

    }
}
