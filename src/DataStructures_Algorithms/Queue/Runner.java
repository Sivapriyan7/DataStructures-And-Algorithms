package DataStructures_Algorithms.Queue;

public class Runner {

    public static void main(String[] args) {
        Queue q = new Queue();
        q.Enqueue(5);
        q.Enqueue(5);
        q.Enqueue(5);
        q.Dequeue();
//        q.Dequeue();
//        q.Dequeue();
//        q.Dequeue();
        q.show();
    }
}
