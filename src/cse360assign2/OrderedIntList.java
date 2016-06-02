package cse360assign2;
import java.io.File;
import java.util.Scanner;
/** Class OrderedIntList
 *  Places up to 10 integer values into an ordered list, 
 *  with the smallest value first and largest value last.
 *  @author Robert Holditch PIN #26
 *  @version May 31, 2016
 */

public class OrderedIntList 
{
	/** Integer array array1 holds 
	 * the sorted integer values
	 */
	protected int[] array1;  // array
	
	/** Integer count will hold the 
	 * number of integers stored in
	 * array1
	 */
	protected int count; // counter
	
	/** Boolean debug is used to control debugging
	 * 
	 */
	private boolean debug = true;
	
	
	
	/** Instanciation of array1
	 * as object of OrderedIntList,
	 * with max size of 10
	 * integers
	 */
	OrderedIntList ()
	{	Scanner scanner = new Scanner(System.in);
		array1 = new int[10];
                count = 0;
                
        System.out.println ("degug on? Enter y or n ");
        String result = scanner.nextLine();
        debug = result.charAt(0) == 'y';
	}
	
	/** Method insert(value)
	 * accepts integer value
	 * @param value, and places
	 * the value into the correct
	 * element
	 */
	public void insert(int value) {
		/** Integer currentPos
		 * points to the position
		 * of array1 currently pointed
		 * at by the control
		 */

		if (count == array1.length)
			grow();

		if (count == 0)
		{
			array1[0] = value;
			count = count + 1;
		}
		else
		{
			int index_j = 0;
		
			for(int index_i = 0; index_i < count; index_i = index_i + 1)
			{
				if(value > array1[index_i])
					index_j = index_j + 1;
			}

			for (int index_i = count; index_i > index_j; index_i = index_i - 1 )
			{ 
			
				if(index_i == array1.length)
				{
					index_i = array1.length - 1;
					count = count - 1;
				}	
				array1[index_i] = array1[--index_i];
			
			}
			array1[index_j] = value;
			count = count + 1;
		}
	}
	/** Method grow doubles the size of array1
	 *  by instatiating new integer array 
	 *  inserting the values of array1
`	 *  into the new array and then
	 *  reassigning array1 to the beginning
         *  of the newly created array
	*/
	
	private void grow()
	{
		int temp[] = new int[count * 2];
		for(int index = 0; index < count; index = index + 1)
			temp[index] = array1[index];
		array1 = temp;
	}
	
	/** Method printAllValues 
	 * prints the values stored in
	 * the elements of array1, with
	 * five elements per line.
	 */
	public void printAllValues ()
	{
		for (int index = 0; index < count; index = index + 1 ) {
			
			if (index%5 == 0){
				
				System.out.println();
			}
			
		System.out.print(array1[index] + "\t");	
		}
	}
}

