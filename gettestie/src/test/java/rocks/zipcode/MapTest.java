package rocks.zipcode;

import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class MapTest {
    /*
    Map: an object that maps keys to values, cannot contain duplicate keys, each key can map to at most one value
    HashMap: a class that implements map interface to store key/value pairs.
    may have only one null key and multiple null values, NO order maintained.

    TreeMap: a class that provides efficient means of storing key/value pairs in sorted order.
    only contains unique elements, NO null keys, but can have multiple null values, maintains ASCENDING order.

     */

    @org.junit.Test
    public void TestHashMapPutEntrySet() {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "bob");
        hashMap.put(2, "bobs");
        hashMap.put(3, "bobby");
        hashMap.put(3, "bobby"); // will not include duplicate keys
        //returns a set view of the mappings contained in the hashmap
        for(Map.Entry entry: hashMap.entrySet()) {
            System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
        }

        int actual = hashMap.size(); // return the number of elements in the set/size of element
        Assert.assertEquals(3, actual);
    }

    @org.junit.Test
    public void TestHashMapRemoveReplace() {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "bob");
        hashMap.put(2, "bobs");
        hashMap.put(3, "bobby");
        hashMap.put(3, "bobby"); // will not include duplicate keys
        hashMap.put(4, "bobster");
        hashMap.put(5, "bobski");
        hashMap.put(6, "boboo");

        hashMap.remove(2); //removes the mapping for specified key
        hashMap.remove(6, "boboo"); //removes the entry for specified key only if it is currently mapped to the specified value
        hashMap.replace(1, "bob", "Bob"); //replaces the entry for specified key only if its is currently mapped to specified value
        hashMap.replace(3, "Bobby"); //replaces the entry for specified key with specified value
        System.out.println(hashMap);
        int actual = hashMap.size(); // return the number of elements in the set/size of element
        Assert.assertEquals(4, actual);
    }

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    @org.junit.Test
    public void TestTreeMapPutRemoveReplace() {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "bob");
        treeMap.put(2, "bobs");
        treeMap.put(3, "bobby");
        treeMap.put(3, "bobby"); // will not include duplicate keys
        treeMap.put(4, "bobster");
        treeMap.put(5, "bobski");
        treeMap.put(6, "boboo");

        treeMap.remove(2); //removes the mapping for specified key
        treeMap.remove(6, "boboo"); //removes the entry for specified key only if it is currently mapped to the specified value
        treeMap.replace(1, "bob", "Bob"); //replaces the entry for specified key only if its is currently mapped to specified value
        treeMap.replace(3, "Bobby"); //replaces the entry for specified key with specified value
        //returns descending order
        System.out.println("descending order: " + treeMap.descendingMap());
        //returns portion of treemap whose keys are less than specified key (inclusive)
        System.out.println("headMap: " + treeMap.headMap(3, false));
        //returns portion of treemap whose keys are greater/equal to specified key (if inclusive is true, key is included)
        System.out.println("tailMap: " + treeMap.tailMap(3, true));
        //returns portion of treeMap whose keys range from fromKey(inclusive) to toKey(exclusive) - unless you add boolean for inclusive
        System.out.println("subMap: " + treeMap.subMap(3,5));


        int actual = treeMap.size(); // return the number of elements in the set/size of element
        Assert.assertEquals(4, actual);
    }
}
