package lec6_lists3;

/** ArrayBasics
 *  @author Josh Hug
 */

/* Notes: Array basic
* Arrays are a special kind of object which consists of
  a numbered sequence of memory boxes.
* Array has a fixed length which cannot be changed.
* All items in an array must hold the same type of value.
* Like other classes, we get one reference when its created.
* Unlike other classes, arrays don't have methods.
*/

/* Notes : Array vs Class
* Array boxes can be accessed using [] notation.
* Class boxes can be accessed using dot notation.
* Array indices can be computed at runtime.
* e.g. ind = 2, x = k[2]
* But class member variable CANNOT be computed at runtime
* e.g. ind = name, x = class.ind  WILL NOT WORK.
* */

public class ArrayBasics {
    /** ArrayBasics */
    public static void main(String[] args) {
        int[] z = null;
        int[] x, y;

        x = new int[]{1, 2, 3, 4, 5};
        y = x;
        x = new int[]{-1, 2, 5, 4, 99};
        y = new int[3];
        z = new int[0];
        /* Find the length of array.*/
        int xl = x.length;

        /* Each item in s is a reference to some string.*/
        String[] s = new String[6];
        s[4] = "ketchup";
        s[x[3] - x[1]] = "muffins";

        /* Another way to declare (only) new array.*/
        int[] b = {9, 10, 11};
        /* Copy from sub-array in b staring from srcPos = 0 with length = 2,
        *  to array c at destPos = 3.*/
        System.arraycopy(b, 0, x, 3, 2);
    }
}