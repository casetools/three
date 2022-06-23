/**
 * import java util
 */
import java.util.*;
/**
 * class reverse array		
 * @author Exams
 *
 */
			public class reversearray {
				/**
				 * reverse methods
				 * @param arr
				 * @return
				 */
			public int reverse(int arr[]) {
				Collections.reverse(Arrays.asList(arr));
				return reverse(arr); 
			}
		}
		
		
		
		

