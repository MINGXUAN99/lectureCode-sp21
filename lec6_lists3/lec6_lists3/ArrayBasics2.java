package lec6_lists3;

/** ArrayBasics
 *  @author Josh Hug
 */

/* Notes: 2D-Array basic
*
*/
public class ArrayBasics2 {
	/** ArrayBasics
	 */

	public static void main(String[] args) {
		/* Create an array reference.*/
		int[][] pascalsTriangle;
		/* Create four boxes, each for an int array reference.*/
		pascalsTriangle = new int[4][];
		/* rowZero copies a null reference,
		   not the reference to 0-th row
		   because it has not been instantiated.*/
		int[] rowZero = pascalsTriangle[0];

		/* Filling each box with a reference to an int array.*/
		pascalsTriangle[0] = new int[]{1};
		pascalsTriangle[1] = new int[]{1, 1};
		pascalsTriangle[2] = new int[]{1, 2, 1};
		pascalsTriangle[3] = new int[]{1, 3, 3, 1};
		/* rowTwo copies the address of row two.*/
		int[] rowTwo = pascalsTriangle[2];
		/* Modify pascalsTriangle from other reference.*/
		rowTwo[1] = -5;

		int[][] matrix;
		matrix = new int[4][]; /* Create one array.*/
		matrix = new int[4][4]; /* Create 5 arrays.*/

		/* Declare and instantiate together.*/
		int[][] pascalAgain = new int[][]{{1}, {1, 1}, 
		{1, 2, 1}, {1, 3, 3, 1}};
	}
} 