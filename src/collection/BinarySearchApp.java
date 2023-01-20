package collection;

import java.util.*;

public class BinarySearchApp {
  public static void main(String[] args) {
    Set<Integer> set = new LinkedHashSet<>(Set.of(1, 2, 3, 4, 5, 7, 8, 9, 0));
    System.out.println(set);

    List<Integer> arr = new ArrayList<>(1000);
    for (int i = 1; i <= 1000; i++) {
      arr.add(i);
    }
    int index = Collections.binarySearch(arr, 762);
    System.out.println(index);
  }
}
