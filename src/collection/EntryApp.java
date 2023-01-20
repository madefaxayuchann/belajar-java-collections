package collection;

import java.util.*;

public class EntryApp {
  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();
    map.put("Niken", "Ayu");
    map.put("Mujni", "chan");
    map.put("Sedang", "Menangis");
    map.put("Agusti", "Chan");

    System.out.println(map.entrySet());

  }
}
