package lec6_lists3;

public class SLListLauncher {
	public static void main(String[] args) {
		/* Specify 'String' as the type of stuff in this list.
		*  We need to specify only once, i.e.
		*  Write out desired type during declaration.
		*  Use the empty diamond operator <> during instantiation.*/
		SLList<String> s1 = new SLList<>("bone");
		s1.addFirst("thugs");	
	}
} 