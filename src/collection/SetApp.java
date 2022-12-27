package collection;

import data.Person;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;

public class SetApp {
  public static void main(String[] args) {
    Set<Integer> s = new java.util.HashSet<>();
    s.add(12);
    s.add(10);
    s.add(10);

    Set<Integer> d = new LinkedHashSet<>();
    d.add(49);
    d.add(34);

    System.out.println(d);

//    immutable sett
    Set<Integer> e = Set.of(1, 2, 34, 5, 6);
    e.add(9);
    System.out.println(e);
  }

}
