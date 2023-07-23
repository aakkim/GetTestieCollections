package rocks.zipcode;

import org.junit.Assert;

import java.util.ArrayList;


public class ListTest {
    /*
    List: ordered collection/sequence.
    unlike sets, allows duplicate elements

    ArrayList: resizable-array implementation/dynamic array for storing elements
    maintains INSERTION order, works on index basis, CANNOT use primitive types, requires wrapper classes

     */

    @org.junit.Test
    public void TestArrayListAddRemove() {
        ArrayList<String> list = new ArrayList<>();
        list.add("mango");
        list.add("strawberry");
        list.add("apple");
        list.add("plum");
        list.add("grape");
        list.add("peach");
        list.remove("grape");//remove element
        list.remove(0);//remove at index
        System.out.println(list);
        int actual = list.size(); // return the number of elements in the set/size of element
        Assert.assertEquals(4, actual);
    }

    @org.junit.Test
    public void TestArrayListGetSet() {
        ArrayList<String> list = new ArrayList<>();
        list.add("mango");
        list.add("strawberry");
        list.add("apple");
        list.add("plum");
        list.add("grape");
        list.add("peach");
        list.set(2, "apricot"); //replace element at specified index with specified element
        System.out.println(list);

        Assert.assertEquals(true, list.contains("apricot"));
        Assert.assertEquals("peach", list.get(5)); //returns element at specified index
    }

}
