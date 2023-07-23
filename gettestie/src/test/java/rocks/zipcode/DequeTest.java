package rocks.zipcode;

import org.junit.Assert;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class DequeTest {
    /*
    Deque: a collection that supports element insertion and removal at both ends (aka double ended queue)

    LinkedList: a class that uses doubly linked list to store elements.
    can contain duplicates, maintains INSERTION order, can be used as a list, stack or queue

    ArrayDeque:

     */

    @org.junit.Test
    public void TestLinkedListAdd() {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("cat");//add element at end of list
        ll.add("dog");
        ll.add("duck");
        ll.add("horse");
        //add element at specified index
        ll.add(1,"bird");
        System.out.print(ll);
        int actual = ll.size(); // return the number of elements in the set/size of element
        Assert.assertEquals(5, actual);
    }


}
