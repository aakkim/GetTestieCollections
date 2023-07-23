package rocks.zipcode;

import org.junit.Assert;

import java.util.Vector;


public class VectorTest {
    /*
    Vector: a class that implements a growable array of objects/ can access using indexes like arrays.
    like a dynamic array, allows duplicates.


     */

    @org.junit.Test
    public void TestVectorAddClear() {
        Vector<Integer> vector = new Vector<>();
        vector.add(6); //add element to queue, if its full it throws an exception
        vector.add(4);
        vector.add(4);
        vector.add(1,2); //add element at specified index(1)
        vector.addElement(3);
        System.out.println(vector);
        int actual = vector.size(); // return the number of elements in the set/size of element
        Assert.assertEquals(5, actual);

        vector.clear();
        Assert.assertTrue(vector.isEmpty());
    }

    @org.junit.Test
    public void TestVectorRemoveReplaceSet() {
        Vector<Integer> vector = new Vector<>();
        vector.add(6); //add element to queue, if its full it throws an exception
        vector.add(4);
        vector.add(5);
        vector.add(1,2); //add element at specified index(1)
        vector.addElement(3);
        vector.addElement(9);
        vector.addElement(7);
        System.out.println(vector);
        vector.remove(6); //remove at specified index
        vector.removeElement(9);
        vector.removeElementAt(1);
        System.out.println(vector);
        vector.set(0,0); //replace element at specified index with specified element
        System.out.println(vector);

        int actual = vector.size(); // return the number of elements in the set/size of element
        Assert.assertEquals(4, actual);

        vector.clear();
        Assert.assertTrue(vector.isEmpty());
    }
}
