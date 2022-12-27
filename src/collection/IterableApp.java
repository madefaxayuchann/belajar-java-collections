package collection;

import java.util.*;

public class IterableApp {
    public static void main(String[] args) {
        Iterable<String> iterable = List.of("Niken","Medya","Ayu");
        for (var z: iterable){
            System.out.println();
        }
    }
}
