package collectiondemo;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaSortCollectionTest {
   public static void main(String args[]) {
      Stream<Employee> emps = Stream.of(
         new Employee(12,"de",32),
         new Employee(12,"d",32),
         new Employee(12,"deds",32));
      
      Comparator<Employee> c1 = Comparator.comparing(e -> e.getName().length());
      Comparator<Employee> c2 = (e1, e2) -> e1.getName().compareTo(e2.getName());

      List<Employee> list = emps.sorted(c1.thenComparing(c2)).collect(Collectors.toList());
      System.out.println(list);
   }
}
