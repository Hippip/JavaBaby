package Study.Map_Set;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class bai1WithMap {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    ArrayList<Integer> a = new ArrayList<>();
    Map<Integer, Integer> mp = new HashMap<>();
    for(int i = 0 ; i < n; i++){
      int x = input.nextInt();
      a.add(x);
    }
    for(int i = 0 ; i < a.size(); i++){
      mp.putIfAbsent(a.get(i), Collections.frequency(a, a.get(i)));
    }
   
    System.out.print(mp.size());

  }
}
