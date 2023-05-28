package Study.XauKiTu;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class bai13 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String s = input.nextLine();
    String []s1 = s.split("\\s+");
    Map<String, Integer>mp1 = new TreeMap<>();
    Map<String, Integer> mp2 = new LinkedHashMap<>();
    for(int i = 0; i < s1.length; i++){
      mp1.put(s1[i], mp1.getOrDefault(s1[i], 0) + 1);
      mp2.put(s1[i], mp2.getOrDefault(s1[i], 0) + 1);
    }

    for(String x: mp1.keySet()){
      int value_x = mp1.get(x);
      System.out.println(x + " " + value_x);
    }
    System.out.print("\n");

    for(String x: mp2.keySet()){
      int value_x = mp2.get(x);
      System.out.println(x + " " + value_x);
    }
    System.out.print(s1);
  }
}
