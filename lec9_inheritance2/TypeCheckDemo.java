package lec9_inheritance2;

public class TypeCheckDemo {
    public static void main(String[] args){
        //sl: Static Type: SLList, Dynamic Type:VengefulSLList.
        VengefulSLList<Integer> vsl = new VengefulSLList<>(9);
        SLList<Integer> sl = vsl;

        sl.addLast(50); // SLList's method.
        sl.removeLast(); // Use VengefulSLList(dynamic type)'s method

        /** However, this will not compile.
        *  The static type(SLList) doesn't have this method.*/
        // sl.printLostItems();

        /** Neither does the following line.
        *  Because the static type of RHS is SLList,
        *  and an SLList is not necessarily a VengefulSLList,
        *  even if in this instance it is, still get compilation error.*/
        // VengefulSLList<Integer> vsl2 = sl;

        /** Casting: Put desired type in the parenthesis before the expression.*/
        VengefulSLList<Integer> vsl2 = (VengefulSLList<Integer>) sl;
    }
}
