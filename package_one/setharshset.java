import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class setharshset {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Navin ");
        names.add("hello ");
        names.add("to the world");
        names.add("to the world");
        names.add("bye");
        names.add("walter");

        System.out.println(names);
        // names.remove("walter");
        // names.remove("to the world");
        names.remove(1); // this indexing methods are not useful in sets as the order of the elements
                         // aren't fixed it will not do what we expected to do

        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.contains("Navin")); // check that our set contains this
        System.out.println(names.isEmpty()); // this checks the set and return true or false

        // names.clear();
        // System.out.println(names);

        // for( String name : names)
        // {
        // System.out.println(name);
        // }

        // names.forEach(System.out::println);

        Iterator<String> namesiterator = names.iterator();
        while (namesiterator.hasNext()) {
            System.out.println(namesiterator.next());
        }

        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.add(7);
        numbers.add(4);
        numbers.add(6);
        numbers.add(2);
        // System.out.println(numbers); //list can contain the duplicate elements in it.

        Set<Integer> numberset = new HashSet<>(numbers);
        // numberset.addAll(numbers);
        System.out.print(numberset); // set did not contain the duplicate elements in it so is used to eliminate
                                     // duplicate elements.

        Set<String> ordered = new TreeSet<>(); // Treeset more slower than the hashset , treeset is used only we want
                                               // natural ordered output eg., alphabetical order.

        ordered.add("Navin ");
        ordered.add("hello ");
        ordered.add("to the world");
        ordered.add("to the world");
        ordered.add("bye");
        ordered.add("walter");

        System.out.println(ordered);
        Set<String> order = new LinkedHashSet<>(); // Linkedhashset is used when we require the ordered output. as fifo.
        order.add("Navin ");
        order.add("hello ");
        order.add("to the world");
        order.add("to the world");
        order.add("bye");
        order.add("walter");

        System.out.println(order);

    }
}
