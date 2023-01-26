import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test 
	public void testReverse() {
    int[] input1 = {3, 4, 5};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{5, 4, 3}, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed1() {
    int[] input2 = {3, 4, 5, 6};
    assertArrayEquals(new int[]{6, 5, 4, 3}, ArrayExamples.reversed(input2));
  }

  @Test
  public void testLowestAverage() {
    double[] input3 = {1, 1, 1, 2, 3, 4, 5, 6};
    assertEquals(4.0, ArrayExamples.averageWithoutLowest(input3), 0);
  }

  
}
