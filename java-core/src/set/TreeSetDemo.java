package set;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

  public static void main(String[] args) {
    Set<String> treeSet1 = new TreeSet<>();
    Set<String> treeSet2 = new TreeSet<>(Comparator.comparing(String::length));
    Set<String> syncTreeSet = Collections.synchronizedSet(treeSet1);

    treeSet1.add("Test1");
//    treeSet1.add(null);

    System.out.println(treeSet1.contains("Test1"));
    System.out.println(treeSet1.remove("Test1"));
    treeSet1.add("Test1");
    treeSet1.add("Test2");
    treeSet1.clear();
    System.out.println(treeSet1.isEmpty());

    //The Iterator throws a ConcurrentModificationException if the set is modified at any time
    // after the iterator is created in any way except through the iterator's remove() method.

//    treeSet2.add("First");
//    treeSet2.add("Second");
//    treeSet2.add("Third");
//    for (String s : treeSet2) {
//      treeSet2.remove("Second");
//    }

    treeSet2.add("First");
    treeSet2.add("Second");
    treeSet2.add("Third");
    Iterator<String> itr = treeSet2.iterator();
    while (itr.hasNext()) {
      String element = itr.next();
      if (element.equals("Second"))
        itr.remove();
    }

//    treeSet2.removeIf(element -> element.equals("Second"));


  }
}
