package collectiondemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Demo {
   public static void main(String[] args) {
      List<String> list = Arrays.asList("Tom", "Jack", "Ryan", "Kevin", "Loki", "Thor");
      System.out.println("Initial List = "+list);
      System.out.println("Reverse...");
      Comparator<String> comp = (aName, bName) -> aName.compareTo(bName);
      list.stream().sorted(comp.reversed()) .forEach(System.out::println);
   }
}