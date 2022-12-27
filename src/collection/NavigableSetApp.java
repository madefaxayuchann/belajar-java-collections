package collection;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
  public static void main(String[] args) {
    NavigableSet<String> name = new TreeSet<>();
    name.addAll(Set.of("Niken", "Ayu", "Medya", "Agustina", "Dwi"));

    System.out.println(name.descendingSet());
    // fetch data from front
    System.out.println(name.headSet("Medya", false));
    // fetch data from back
    System.out.println(name.tailSet("Dwi", false));

    NavigableSet<String> mutable = Collections.unmodifiableNavigableSet(name);

  }
}
