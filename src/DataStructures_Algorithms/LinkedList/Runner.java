package DataStructures_Algorithms.LinkedList;

public class Runner {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insert(3);
        list.insert(2);
        list.insert(1);
        list.insert(0);
        list.insertAtStart(11);
        list.insertAt(2,24);
        list.deleteAt(2);

        list.show();
    }
}
