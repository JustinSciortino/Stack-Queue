//Justin Sciortino 40247931 Individual Question 1
public class Ass1_Q1 {
    private Node first, last;
    private int minItem;
    private class Node{
        int item;
        Node next;
    }
    public boolean isEmpty(){
        return first == null;
    }
    public void enqueue(int element){
        System.out.println("Enqueue: "+element);
        Node oldLast = last;
        last = new Node();
        last.item = element;
        if((oldLast == null) || (element<minItem)){
            minItem = element;
        }
        if(isEmpty()){
            first=last;
        }else{
            oldLast.next = last;
        }
    }

    public int dequeue(){
        if(isEmpty()){
            last = null;
            minItem = 0;
            System.out.println("Queue is empty");
            return 0;
        }
        int item = first.item;
        System.out.println("Dequeue: "+ item);
        first = first.next;

        if(isEmpty()){
            last = null;
            minItem = 0;
            return 0;
        }else {
            if (item == minItem) {
                Node currentNode = first;
                minItem = currentNode.item;
                while (currentNode != null) {
                    if (currentNode.item < minItem) {
                        minItem = currentNode.item;
                    }
                    currentNode = currentNode.next;
                }
            }
        }
        return item;
    }

    public int getMin(){
        if(isEmpty()){
            String msg = "Queue is empty. ";
            System.out.print(msg);
            System.out.println("The minimum element of the queue is "+ minItem+"/there is no minimum element.");
            return minItem;
        }
        System.out.println("The minimum element of the queue is "+ minItem);
        return minItem;
    }
}
