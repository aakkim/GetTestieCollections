package rocks.zipcode;

import org.junit.Assert;

import java.util.*;

public class DequeTest {
    /*
    Deque: a collection that supports element insertion and removal at both ends (aka double ended queue)

    LinkedList: a class that uses doubly linked list to store elements.
    can contain duplicates, maintains INSERTION order, can be used as a list, stack or queue

    ArrayDeque: a class that is a resizable-array implementation of the deque interface.'
    cannot contain null value.

     */

    @org.junit.Test
    public void TestLinkedListAddOfferPush() {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("cat");//add element at end of list
        ll.add("dog");
        ll.add("duck");
        //adds element as the tail (last element) of list
        ll.offer("horse");
        //adds element at front of list
        ll.offerFirst("squirrel");
        //adds element at the end of list
        ll.offerLast("rabbit");
        //add element at specified index
        ll.add(1,"bird");
        //pushes an element to the stack represented by this list
        ll.push("chipmunk");
        System.out.print(ll);
        int actual = ll.size(); // return the number of elements in the set/size of element
        Assert.assertEquals(8, actual);
    }

    @org.junit.Test
    public void TestLinkedListRemovePop() {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("cat");//add element at end of list
        ll.add("dog");
        ll.add("duck");
        ll.add("horse");
        ll.add("rabbit");
        ll.add("bear");
        //add specified element at specified index
        ll.add(1,"bird");
        //pushes an element to the stack represented by this list
        ll.push("chipmunk");
        System.out.println("after push: " + ll);
        ll.remove("horse");
        //remove element at specified index
        ll.remove(0);
        System.out.println("after remove: " + ll);
        //pops an element from the stack/list
        ll.pop();
        System.out.println("after pop: " + ll);

        int actual = ll.size(); // return the number of elements in the set/size of element
        Assert.assertEquals(5, actual);
    }

    @org.junit.Test
    public void TestLinkedListSet() {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("cat");//add element at end of list
        ll.add("dog");
        ll.add("duck");
        ll.set(0,"turtle");
        System.out.println(ll);
        int actual = ll.size(); // return the number of elements in the set/size of element
        Assert.assertEquals(3, actual);

    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    @org.junit.Test
    public void TestArrayDequeAdd() {
        Deque<String> ad = new ArrayDeque<>();
        ad.add("cat");//add element at end of deque
        //add to front of deque
        ad.addFirst("dog");
        //add to end of deque
        ad.addLast("frog");
        //add to end of deque
        ad.offer("toad");
        ad.offerFirst("rabbit");
        ad.offerLast("monster");
        System.out.println(ad);
        int actual = ad.size(); // return the number of elements in the set/size of element
        Assert.assertEquals(6, actual);
    }

    @org.junit.Test
    public void TestArrayDequeDescendingIterator() {
        Deque<String> ad = new ArrayDeque<>();
        ad.add("cat");//add element at end of deque
        //add to front of deque
        ad.addFirst("dog");
        //add to end of deque
        ad.addLast("frog");
        //add to end of deque
        ad.offer("toad");
        ad.offerFirst("rabbit");
        ad.offerLast("monster");
        System.out.println(ad);
        Iterator iterator = ad.descendingIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        int actual = ad.size(); // return the number of elements in the set/size of element
        Assert.assertEquals(6, actual);
    }
}
