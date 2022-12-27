package collection;

import java.util.List;
import java.util.*;

public class ListApp {
  /*
   * Element lists can be duplicated
   * The data in the list is ordered. based on the input data
   * List have an index
   * */
  public static void main(String[] args) {
    List<String> names = new ArrayList<>(List.of("Bayu", "Rahayu", "Ayumu", "Medyu"));
    names.set(2,"Nikenu");
    System.out.println(names);

  }
}
