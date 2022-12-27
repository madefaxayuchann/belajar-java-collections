package collection;

import data.Person;

import java.util.List;

public class MutableApp {
  public static void main(String[] args) {
    Person person = new Person("Niken");
    person.addHobby("Coding");
    person.addHobby("Watch Anime");

    doSomethingWithHobby(person.getHobbies());
    for (var i: person.getHobbies()){
      System.out.println(i);
    }
  }
  public static void doSomethingWithHobby(List<String> hobby){
  }
}
