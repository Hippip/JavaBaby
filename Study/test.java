

package Study;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class test {
  public static void main(String[] args) {
    int a[] = { 1, 13, 4, 1, 41, 31, 31, 4, 13, 2 };
  
    // put all elements in arraylist
    ArrayList<Integer> aa = new ArrayList();
    for (int i = 0; i < a.length; i++) {
        aa.add(a[i]);
    }

    Map<Integer, Integer> h = new HashMap<>();

    // counting occurrence of numbers
    for (int i = 0; i < aa.size(); i++) {
        h.putIfAbsent(aa.get(i), Collections.frequency(aa, aa.get(i)));
    }
    System.out.println(h);
  }
  
}
