package rocks.zipcode;

import gettestie.src.main.java.rocks.zipcode.Person;
import org.junit.Assert;



public class ComparableTest {
    /*
    Comparable: interface used to order objects.
    provides single sorting sequence/sort elements on basis of single data member only
    comparable contains only one method compareTo(Object):
    - returns positive integer if current object is greater than specified object
    - returns negative integer if current object is less than specified object
    - returns zero if current object is equal to specified object

     */

    @org.junit.Test
    public void TestComparable() {
        Person bob = new Person("bob", 30);
        Person karen = new Person("karen", 31);

        Assert.assertEquals(-1, bob.compareTo(karen));
    }

    @org.junit.Test
    public void TestComparable2() {
        Person bob = new Person("bob", 30);
        Person karen = new Person("karen", 30);

        Assert.assertEquals(0, bob.compareTo(karen));
    }

    @org.junit.Test
    public void TestComparable3() {
        Person bob = new Person("bob", 35);
        Person karen = new Person("karen", 31);

        Assert.assertEquals(1, bob.compareTo(karen));
    }
}
