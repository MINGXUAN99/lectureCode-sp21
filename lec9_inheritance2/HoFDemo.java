package lec9_inheritance2;

/**
 * Created by hug on 2/6/2017.
 * Demonstrates higher order functions in Java.
 */

/** Logic Here:
 *  Interface IntUnaryFunction: any unary functions
 *  Class TenX(): return 10 times of the argument.
 *  Object tenX: we have to instantiate, not using a class name.
 *  do_twice(): HOF, takes an interface but not a method as argument.
 * */
public class HoFDemo {
    public static int do_twice(IntUnaryFunction f, int x) {
        return f.apply(f.apply(x));
    }

    public static void main(String[] args) {
        IntUnaryFunction tenX = new TenX();
        System.out.println(do_twice(tenX, 2));
    }
}
