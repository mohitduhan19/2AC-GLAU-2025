package AC.Lec15_Theory;
import java.util.*;

class QueueNode{
    int data;
    QueueNode next;
    QueueNode(int a)
    {
        data = a;
        next = null;
    }
}

public class Queue_Using_Linked_List {
    QueueNode front;
    QueueNode rear;

    void push(int a){
        if (rear==null){
            rear = new QueueNode(a);
            front = rear;
        }
        else{
            QueueNode temp = new QueueNode(a);
            rear.next=temp;
            rear=temp;
        }
    }
    int pop(){
        QueueNode temp = front;

        if(temp==null)
            return -1;
        if(temp.next != null){
            temp = temp.next;
            int k = front.data;
            front = temp;
            return k;
        }
        else{
            int k = front.data;
            front = null;
            rear = null;
            return k;
        }
    }
}