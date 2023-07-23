package rocks.zipcode;

import org.junit.Assert;

import java.util.HashSet;
import java.util.Iterator;

import static org.junit.Assert.*;

public class TestSet {
    /*
    Set: a collection that contains no duplicate elements. Set interface extends from Collection interface.
    HashSet: a class used to create a collection that uses a hash table for storage/inherits AbstractSet class and implements Set interface.
    contains only unique elements, allows null value, doesn't maintain insertion order/inserted on basis of their hashcode.
    best approach for search operations.

    TreeSet:

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
}
