package Study.XauKiTu;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Bai2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String s = input.nextLine();
    Map<Character, Integer>mp1 = new TreeMap<>();
    Map<Character, Integer>mp2 = new LinkedHashMap<>();
    for(int i = 0; i < s.length(); i++){
      mp1.put(s.charAt(i), mp1.getOrDefault(s.charAt(i), 0) + 1);
      mp2.put(s.charAt(i), mp2.getOrDefault(s.charAt(i), 0) + 1);
    }

    for(Character x : mp1.keySet()){
      int value_x = mp1.get(x);
      System.out.println(x + " " + value_x);
    }
    System.out.print("\n");

    for(Character y: mp2.keySet()){
      int value_y = mp2.get(y);
      System.out.println(y + " " + value_y);
    }
  }
}
