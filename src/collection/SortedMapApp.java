package collection;

import java.util.*;

public class SortedMapApp {
  public static void main(String[] args) {
    SortedMap<String, String> set = new TreeMap<>(Comparator.reverseOrder());

    // key set is a method to get key of sortedSet

    set.put("Niken", "Ayu");
    set.put("NUdri", "Ucgs");
    set.put("Ayumi", "Medya");

    System.out.println(set.keySet());

    for (var key : set.keySet()) {
      System.out.println(key);
    }

//    immutable sortedmap
    SortedMap<String, String> immutable = Collections.unmodifiableSortedMap(set);
    SortedMap<String, String> empty = Collections.emptySortedMap();
  }
}
