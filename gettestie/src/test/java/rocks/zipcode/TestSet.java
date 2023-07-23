package rocks.zipcode;


import org.junit.Assert;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class TestSet {
    /*
    Set: a collection that contains no duplicate elements. Set interface extends from Collection interface.
    HashSet: a class used to create a collection that uses a hash table for storage.
    contains only unique elements, allows null value, doesn't maintain insertion order/inserted on basis of their hashcode.
    best approach for search operations.

    TreeSet: a class used to create a collection that uses a tree for storage.
    contains only unique elements like hashset, does NOT allow null value, maintains ascending order.
    only allow generic types that are comparable

     */

    @org.junit.Test
    public void TestHashSetAdd() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Hello"); //add element to set if it's not already present
        hashSet.add("Hi");
        hashSet.add("Hey");
        hashSet.add("Hey"); // will not include duplicates
        int actual = hashSet.size(); // return the number of elements in the set/size of element
        Assert.assertEquals(3, actual);
    }

    @org.junit.Test
    public void TestHashSetClear() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Hello"); //add element to set if it's not already present
        hashSet.add("Hi");
        hashSet.add("Hey");
        hashSet.clear(); // return the number of elements in the set
        Assert.assertTrue(hashSet.isEmpty()); // returns true if hashset is empty after clear()
    }

    @org.junit.Test
    public void TestHashSetClone() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Hello"); //add element to set if it's not already present
        hashSet.add("Hi");
        hashSet.add("Hey");
         //create a new hashset object
        HashSet<String> cloneSet = (HashSet)hashSet.clone(); //clone hashSet to cloneSet
        Assert.assertEquals(hashSet, cloneSet); // check if they are the same
    }

    @org.junit.Test
    public void TestHashSetContains() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Hello"); //add element to set if it's not already present
        hashSet.add("Hi");
        hashSet.add("Hey");
        Assert.assertTrue(hashSet.contains("Hey")); // returns true if "Hey" is an element of hashSet
    }

    @org.junit.Test
    public void TestHashIterator() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Hello"); //add element to set if it's not already present
        hashSet.add("Hi");
        hashSet.add("Hey");
        //create an iterator
        Iterator iterator = hashSet.iterator(); //returns an iterator over the elements in hashset/returned in no particular order
        String actual = "";
        while(iterator.hasNext()) { //returns true if iteration has more elements
            actual += iterator.next() + " "; //returns next element in the iteration
        }
        Assert.assertEquals("Hi Hello Hey ", actual); // check if they are the same
    }

    @org.junit.Test
    public void TestHashSetRemove() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Hello"); //add element to set if it's not already present
        hashSet.add("Hi");
        hashSet.add("Hey");
        hashSet.remove("Hi"); //remove element if it's present in hashset
        Assert.assertFalse(hashSet.contains("Hi")); // returns false if "Hi" is not present in hashset
    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    @org.junit.Test
    public void TestTreeSetAdd() {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Hello"); //add element to set if it's not already present
        treeSet.add("Hi");
        treeSet.add("Hey");
        treeSet.add("Hey"); // will not include duplicates
        int actual = treeSet.size(); // return the number of elements in the set/size of element
        Assert.assertEquals(3, actual);
    }

    @org.junit.Test
    public void TestTreeSetAddAll() {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Hello"); //add element to set if it's not already present
        treeSet.add("Hi");
        treeSet.add("Hey");
        treeSet.add("Hey"); // will not include duplicates
        // create new tree set
        TreeSet<String> anotherSet = new TreeSet<>();
        anotherSet.add("Herro");
        anotherSet.add("Hiii");
        treeSet.addAll(anotherSet);
        Assert.assertEquals(5, treeSet.size());
    }

    @org.junit.Test
    public void TestTreeSetCeiling() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(3); //add element to set if it's not already present
        treeSet.add(26);
        treeSet.add(14);
        treeSet.add(72);
        int actual = treeSet.ceiling(15); //returns the least element in this set greater than or equal to the given amount
        // returns null if there is no such element
        Assert.assertEquals(26, actual);
    }

    @org.junit.Test
    public void TestTreeSetClear() {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Hello"); //add element to set if it's not already present
        treeSet.add("Hi");
        treeSet.add("Hey");
        treeSet.clear(); // return the number of elements in the set/size of element
        Assert.assertEquals(0, treeSet.size()); //checks the number of elements/size of element
    }

    @org.junit.Test
    public void TestTreeSetFirst() {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Hello"); //add element to set if it's not already present
        treeSet.add("Hi");
        treeSet.add("Hey");
        //returns the first(lowest) element in this set
        Assert.assertEquals("Hello", treeSet.first());
    }

    @org.junit.Test
    public void TestTreeSetLast() {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Hello"); //add element to set if it's not already present
        treeSet.add("Hi");
        treeSet.add("Hey");
        //returns the last(highest) element in this set
        Assert.assertEquals("Hi", treeSet.last());
    }

    @org.junit.Test
    public void TestTreeSetSubSet() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(3); //add element to set if it's not already present
        treeSet.add(4);
        treeSet.add(18);
        treeSet.add(2);
        treeSet.add(20);
        TreeSet<Integer> expected = new TreeSet<>();
        expected.add(2);
        expected.add(18);
        expected.add(3);
        expected.add(4);
        //create a subset tree that returns a portion of the set whose elements range from fromElement (inclusive) to toElement (exclusive)
        TreeSet<Integer> subSet = (TreeSet<Integer>) treeSet.subSet(2,20);
        Assert.assertEquals(expected, subSet);
    }

    @org.junit.Test
    public void TestTreeSetHeadSet() {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Hello"); //add element to set if it's not already present
        treeSet.add("Hi");
        treeSet.add("Hey");
        treeSet.add("Herro");
        // headSet returns portion of the set whose elements are strictly less than given element
        TreeSet<String> subSet = (TreeSet<String>) treeSet.headSet("Hey");
        Assert.assertEquals(subSet, treeSet.subSet("Hello", "Hey"));
    }

    @org.junit.Test
    public void TestTreeSetTailSet() {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Hello"); //add element to set if it's not already present
        treeSet.add("Hi");
        treeSet.add("Hey");
        treeSet.add("Herro");
        TreeSet<String> expected = new TreeSet<>();
        expected.add("Herro");
        expected.add("Hey");
        expected.add("Hi");
        //tailSet returns the portion of the set whose elements are greater than/equal to given element
        TreeSet<String> subSet = (TreeSet<String>) treeSet.tailSet("Herro");
        Assert.assertEquals(subSet, expected);
    }
}
