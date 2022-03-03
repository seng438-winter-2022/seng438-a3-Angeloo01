package org.jfree.data.test;

import static org.junit.Assert.*; 
import org.jfree.data.Range; 
import org.junit.*;

public class RangeTest {
    private Range exampleRange;
    @BeforeClass public static void setUpBeforeClass() throws Exception {
    }


    @Before
    public void setUp() throws Exception { exampleRange = new Range(-1, 1);
    }


    @Test
    public void centralValueShouldBeZero() {
        assertEquals("The central value of -1 and 1 should be 0",
        0, exampleRange.getCentralValue(), .000000001d);
    }
    
    @Test
    public void getLengthShouldBeTwo() {
       // fail("Not yet implemented");
    	assertEquals("The length should be 2",
    	        2, exampleRange.getLength(), .000000001d);
    }
    
    @Test
    public void getLowerBoundShouldBeNegOne() {
        //fail("Not yet implemented");
    	assertEquals("The lower bound should be -1",-1,exampleRange.getLowerBound(), .000000001d);
    }
    
    @Test
    public void getUpperBoundShouldBeOne() {
        //fail("Not yet implemented");
    	assertEquals("The upperbound should be 1",
    	        1, exampleRange.getUpperBound(), .000000001d);
    }
    
    @Test
    public void intersectsShouldBeTrueALessThanLower() {
        //fail("Not yet implemented");
    	Range exampleRange2 = new Range(-2, 2);
    	
    	assertTrue(exampleRange.intersects(exampleRange2));
    }
    
    @Test
    public void intersectsShouldBeFalseAGreaterThanUpper() {
        //fail("Not yet implemented");
    	Range exampleRange2 = new Range(3, 4);
    	
    	assertFalse(exampleRange.intersects(exampleRange2));
    }
    
    @Test
    public void intersectsShouldBeTrueABetweenBounds() {
        //fail("Not yet implemented");
    	Range exampleRange2 = new Range(0, 4);
    	
    	assertTrue(exampleRange.intersects(exampleRange2));
    }
    
    //BVT
    @Test
    public void intersectsShouldBeTrueAEqualLower() {
        //fail("Not yet implemented");
    	Range exampleRange2 = new Range(-1, 2);
    	
    	assertTrue(exampleRange.intersects(exampleRange2));
    }
    
    @Test
    public void intersectsShouldBeTrueAEqualUpper() {
        //fail("Not yet implemented");
    	Range exampleRange2 = new Range(1, 2);
    	
    	assertFalse(exampleRange.intersects(exampleRange2));
    }
    
    //Robustness
    @Test
    public void intersectsShouldBeTrueABLB() {
        //fail("Not yet implemented");
    	Range exampleRange2 = new Range(-1.01, 2);
    	
    	assertTrue(exampleRange.intersects(exampleRange2));
    }
    
    @Test
    public void intersectsShouldBeFalseAAUB() {
        //fail("Not yet implemented");
    	Range exampleRange2 = new Range(1.01, 2);
    	
    	assertFalse(exampleRange.intersects(exampleRange2));
    }
  
//    @Test
//    public void lessThanSmallerLargerGreater() {
//        //fail("Not yet implemented");
//    	Range exampleRange2 = new Range(0, 4);
//    	
//    	assertTrue(exampleRange.intersects(exampleRange2));
//    }
//    
    @Test
    public void falseEqualBounds() {
        //fail("Not yet implemented");
    	Range exampleRange2 = new Range(-1, -1);
    	
    	assertFalse(exampleRange.intersects(exampleRange2));
    }
//    @Test
//    public void falseEqualBounds2() {
//        //fail("Not yet implemented");
//    	Range exampleRange2 = new Range(2, 3);
//    	
//    	assertFalse(exampleRange.intersects(exampleRange2));
//    }
    
    @Test(expected = IllegalArgumentException.class)
    public void rangeCtorLowerGreaterThanUpper() throws Exception {
        //fail("Not yet implemented");
    	Range exampleRange2 = new Range(4, 2);
    }
 
    @Test(expected = IllegalArgumentException.class)
    public void rangeCtorInvalidArgument() throws Exception{
        //fail("Not yet implemented");
    	Range exampleRange2 = new Range('L',3);
    }
    
    @Test
    public void rangeCtorValidArgument() throws Exception{
        //fail("Not yet implemented");
    	Range exampleRange2 = new Range(1,3);
    }
    
    //BVT
    @Test
    public void rangeCtorAEqualB() {
    	Range exampleRange2 = new Range(1,1);
    }
    
    //Robustness
    @Test
    public void rangeCtorABLB(){
    	Range exampleRange2 = new Range(.9999,1);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void rangeCtorAAUB() throws Exception{
    	Range exampleRange2 = new Range(1.1111,1);
    }

    @After
    public void tearDown() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }
}