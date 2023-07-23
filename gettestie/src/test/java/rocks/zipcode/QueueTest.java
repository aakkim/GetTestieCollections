package rocks.zipcode;

import org.junit.Assert;
import java.util.PriorityQueue;

public class QueueTest {
    /*
    Queue interface: a collection designed for holding elements prior to processing.
    keeps elements that are processed in first-in-first-out (FIFO) manner

    PriorityQueue: a class that provides processing of objects on the basis or priority.
    are unbounded queues, does NOT allow null value, can't create a priority queue of objects that are non-comparable.
    priority queue elements may not be sorted, but elements are retrieved in SORTED order (natural/ascending order)
    head of the queue will be the smallest element

     */

    @org.junit.Test
    public void TestPriorityQueueAddOffer() {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(6); //add element to queue, if its full it throws an exception
        priorityQueue.add(4);
        priorityQueue.offer(3);
        priorityQueue.offer(9);
        priorityQueue.offer(9); //add element to queue, if its full it returns false
        int actual = priorityQueue.size(); // return the number of elements in the set/size of element
        Assert.assertEquals(5, actual);
    }

    @org.junit.Test
    public void TestPriorityQueueRemovePoll() {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(6); //add element to queue, if its full it throws an exception
        priorityQueue.add(4);
        priorityQueue.offer(3);
        priorityQueue.offer(9); //add element to queue, if its full it returns false
        //removes the specified element from queue
        priorityQueue.remove(3);
        //removes and returns the head of queue
        priorityQueue.poll();
        Assert.assertEquals(2, priorityQueue.size());
    }

}
