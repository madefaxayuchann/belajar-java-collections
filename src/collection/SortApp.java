package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortApp {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>(List.of("Medya", "Ayumi", "Zidane"));
    list.sort(Comparator.naturalOrder());
    System.out.println(list);
  }
}
