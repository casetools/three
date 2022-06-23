/**
 * input java assertion
 */
import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * import junit test
 */
import org.junit.Test;
/**
 * class test
 * @author Exams
 *
 */
public class test {
	@Test
	/**
	 * test method
	 */
	public void test() {
		/**
		 * object of reversearray
		 */
		reversearray a = new reversearray();
		/**
		 * declare array arr
		 */
		int arr[] = {10,20,30,40};
		/**
		 * declare array actual
		 */
		int actual[] = a.reverse(arr);
		/**
		 * declare array expected
		 */
		int expected[] = {40,30,20,10};
		/**
		 * assertequal function
		 */
		assertEquals(expected,actual);
		
	}
}
