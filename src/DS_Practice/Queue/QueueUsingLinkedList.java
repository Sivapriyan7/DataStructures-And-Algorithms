package DS_Practice.Queue;

class QNode {
    int key;
    QNode next;

    public QNode(int data)
    {
        this.key = data;
        this.next = null;
    }
}

class Queue{
    QNode front,rear;
    int size;

    public Queue()
    {
        this.front=this.rear=null;
    }

    void Enqueue(int data)
    {
        QNode temp = new QNode(data);

        if(this.rear==null)
        {
            this.rear=this.front=temp;
        }
        else {
            this.rear.next = temp;
            this.rear = temp;
        }
        size++;
    }

    void Dequeue()
    {
        if(this.front==null)
        {
            System.out.println("No elements to Dequeue.");
        }
        else {
            QNode temp = this.front;
            this.front = this.front.next;
            System.out.println("Dequeued Element "+temp.key);
        }
        if(this.front==null)
        {
            this.rear=null;
        }
        size--;
    }

    void getSize()
    {
        System.out.println("Size of the queue "+size);
    }

    void printQueue()
    {
        QNode front1 = front;
        QNode rear1 = rear;
        System.out.println("Queue Elements ");
        while(front1 != rear1)
        {
            System.out.print(front1.key+" ");
            front1=front1.next;
        }
        System.out.print(front1.key);
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.Enqueue(23);
//        queue.Dequeue();
        queue.Enqueue(22);
        queue.Enqueue(21);
        queue.Enqueue(25);
        queue.Enqueue(27);
        queue.Dequeue();
        queue.getSize();
        queue.printQueue();
    }
}