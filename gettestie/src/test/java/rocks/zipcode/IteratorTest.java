package rocks.zipcode;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.Iterator;


public class IteratorTest {
    /*
    Iterator: interface that is practiced in order to iterate over a collection of objects.

    PriorityQueue: a class that provides processing of objects on the basis or priority.
    are unbounded queues, does NOT allow null value, can't create a priority queue of objects that are non-comparable.
    priority queue elements may not be sorted, but elements are retrieved in SORTED order (natural/ascending order)
    head of the queue will be the smallest element

     */

    @org.junit.Test
    public void TestIterator() {
        ArrayList<String> list = new ArrayList<>();
        list.add("tinky-winky");
        list.add("po");
        list.add("lala");
        list.add("dipsy");

        Iterator iterator = list.iterator();
        //hasNext() returns true if iteration has more elements
        while(iterator.hasNext()) {
            //next() returns the next element in the iteration
            System.out.print(iterator.next() + " ");
        }
        int actual = list.size(); // return the number of elements in the set/size of element
        Assert.assertEquals(4, actual);
    }

    @org.junit.Test
    public void TestIteratorRemove() {
        ArrayList<String> list = new ArrayList<>();
        list.add("tinky-winky");
        list.add("po");
        list.add("lala");
        list.add("dipsy");

        Iterator iterator = list.iterator();
        while(iterator.hasNext()) {
            iterator.next();
            //removes the last element returned by this iterator
            iterator.remove();
        }
        int actual = list.size(); // return the number of elements in the set/size of element
        Assert.assertEquals(0, actual);
    }

    @org.junit.Test
    public void TestIteratorForEachRemaining() {
        ArrayList<String> list = new ArrayList<>();
        list.add("tinky-winky");
        list.add("po");
        list.add("lala");
        list.add("dipsy");

        Iterator iterator = list.iterator();
        //performs given action for each remaining element until all elements are processed
        iterator.forEachRemaining((entry) -> System.out.print(entry + " "));
        int actual = list.size(); // return the number of elements in the set/size of element
        Assert.assertEquals(4, actual);
    }
}
