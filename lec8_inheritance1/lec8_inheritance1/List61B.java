package lec8_inheritance1;

/** Notes: Hyponym Relationships in Java
 * 1. Define a reference type for our hypernym
 * 2. Specify that SLLists and ALists are hyponyms of that type.
*/

/* Not class here, but interface. */
public interface List61B<Item> {
        public void insert(Item x, int position);
        public void addFirst(Item x);
        public void addLast(Item x);
        public Item getFirst();
        public Item getLast();
        public Item get(int i);
        public int size();
        public Item removeLast();

        /* (Only) default method could have body. */
        default public void print() {
            for (int i = 0; i < size(); i += 1) {
                System.out.print(get(i) + " ");
            }
        }
}
