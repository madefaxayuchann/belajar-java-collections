package collection;

import java.util.NavigableMap;
import java.util.TreeMap;

public interface NavigableSetMapApp {
  public static void main(String[] args) {
    NavigableMap<String, String> map = new TreeMap<>();

    map.put("Niken", "Ayu");
    map.put("Ayumi", "23");
    map.put("medya", "Agustina");
    map.put("Gusti", "sama");

    for (var i : map.values()) {
      System.out.println(i);
    }

    System.out.println(map.lowerKey("medya"));
    System.out.println(map.higherKey("Gusti"));
    System.out.println(map.floorKey("Ayumi"));
    System.out.println(map.ceilingKey("Medya"));
  }
}
