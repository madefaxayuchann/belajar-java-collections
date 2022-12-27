package collection;

import java.util.*;

public class CollectionApp {
  /* Collections are Interface. Collection using for manipulation
  data collection like a add, delete or check a data. implements collection like a list, Set & Queue
  contrak untuk memanipulasi data si struktur data di java
   */
  public static void main(String[] args) {

    Collection<String> name = new ArrayList<>();
    name.add("Niken");
    name.add("aYU");
    name.addAll(Arrays.asList("Budi", "Agus", "Ipan", "Andre"));

    name.removeAll(Arrays.asList("Ipan", "Mas Andre"));
    name.removeIf(n -> n.length() == 4);
    System.out.println(
            name.containsAll(Arrays.asList("Andre", "Medya"))
    );

    for (var i : name) {
      System.out.println(i);
    }
  }

}
