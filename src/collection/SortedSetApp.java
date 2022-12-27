package collection;

import data.Person;
import data.PersonComparator;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
  public static void main(String[] args) {
    SortedSet<Person> people = new TreeSet<>(new PersonComparator().reversed());
    people.add(new Person("Niken"));
    people.add(new Person("Ayu"));

    for (var i : people) {
      System.out.println(i.getName());
    }

    // immutable sortedSet

    SortedSet<Person> people1 = Collections.unmodifiableSortedSet(people);
    people1.add(new Person("Ayumi"));

  }
}
