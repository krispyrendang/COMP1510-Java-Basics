package ca.bcit.comp1510.lab07;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestThisTest {
    
    /**
     * The TestThis object to test.
     */
    private TestThis testLargest;
    
    /**
     * Creates a new TestThis object before each test is executed.
     * 
     * @throws Exception
     *             if a TestThis object cannot be created.
     */
    @BeforeEach
    public void setUp() throws Exception {
        testLargest = new TestThis();
    }

    /**
     * Tests the largest of 3 integers method.
     */
    @Test
    public void testLargestInt1() {
        int largest = testLargest.largest(1, 2, 3);
        assertEquals(3, largest);
    }

    /**
     * Tests the largest of 3 integers method.
     */
    @Test
    public void testLargestInt2() {
        int largest = testLargest.largest(1, 3, 2);
        assertEquals(3, largest);
    }
    
    /**
     * Tests the largest of 3 integers method.
     */
    @Test
    public void testLargestInt3() {
        int largest = testLargest.largest(3, 1, 2);
        assertEquals(3, largest);
    }
    
    /**
     * Tests the largest list  of integers method.
     */
    @Test
    public void testLargestListOfInteger1() {
        List<Integer> testList = new ArrayList<Integer>();
        testList.add(10);
        testList.add(9);
        testList.add(8);
        testList.add(7);
        testList.add(6);
        int max = testLargest.largest(testList);
        assertEquals(10, max);
    }
    
    /**
     * Tests the largest list  of integers method.
     */
    @Test
    public void testLargestListOfInteger2() {
        List<Integer> testList = new ArrayList<Integer>();
        testList.add(-10);
        testList.add(-9);
        testList.add(-8);
        testList.add(-7);
        testList.add(-6);
        int max = testLargest.largest(testList);
        assertEquals(-6, max);
    }
    
    /**
     * Tests the largest list  of integers method.
     */
    @Test
    public void testLargestListOfInteger3() {
        List<Integer> testList = new ArrayList<Integer>();
        testList.add(-10);
        testList.add(-10);
        testList.add(-9);
        testList.add(50);
        testList.add(50);
        int max = testLargest.largest(testList);
        assertEquals(50, max);
    }

}

