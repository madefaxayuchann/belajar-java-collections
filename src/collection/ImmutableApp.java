package collection;

import java.util.Collections;
import java.util.List;

public class ImmutableApp {
  public static void main(String[] args) {

    //this is method immutable list
    List<String> one = Collections.singletonList("Niken");
    List<String> second = Collections.emptyList();

    List<String> immutable = List.of("Ayumi", "Saiko");



  }
}
