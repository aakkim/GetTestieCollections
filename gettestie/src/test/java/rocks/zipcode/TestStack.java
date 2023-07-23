package rocks.zipcode;

import org.junit.Assert;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {
    /*
    Stack: class represents a last-in-first-out (LIFO) stack of objects.
    It extends class Vector with 5 operations that allow a vector to be treated as a stack.
     */

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        Assert.assertEquals(false, stack.isEmpty()); // false
    }

    @org.junit.Test
    public void TestStackPush() {
        Stack<String> stack = new Stack<>();
        String actual = stack.push("Hello world"); // add element to the top of the stack with push method/ also returns the element that was added
        Assert.assertEquals("Hello world", actual);
    }

    @org.junit.Test
    public void TestStackPop() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.push("Hi");
        stack.push("Hey");
        String expected = stack.push("Herro");
        String actual = stack.pop(); // remove element from top of the stack/ also return the element that was removed as the value of the function
        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void TestStackPeek() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.push("Hi");
        stack.push("Hey");
        String expected = stack.push("Herro");
        String actual = stack.peek(); // looks at the object at the top of the stack without removing it from the stack
        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void TestStackSearch() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.push("Hi");
        stack.push("Hey");
        stack.push("Herro");
        int actual = stack.search("Herro"); // search for an element (int) and get its distance from the TOP
        Assert.assertEquals(1, actual);
    }

    @org.junit.Test
    public void TestStackSearch2() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.push("Hi");
        stack.push("Hey");
        stack.push("Herro");
        int actual = stack.search("Hey"); // search for an element (int) and get its distance from the TOP
        Assert.assertEquals(2, actual);
    }

    @org.junit.Test
    public void TestStackEmpty() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.push("Hi");
        stack.push("Hey");
        stack.push("Herro");
        boolean actual = stack.empty(); // tests if the stack is empty
        Assert.assertEquals(false, actual);
    }
}
