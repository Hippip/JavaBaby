package Study.Mang1Chieu;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class bai9 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int[] a = new int[n];
    Map<Integer, Integer> mp1 = new TreeMap<>();
    Map<Integer, Integer> mp2 = new LinkedHashMap<>();
    for(int i = 0; i < n ; i++){
      a[i] = input.nextInt();
    }
    for(int x: a){
      mp1.put(x, mp1.getOrDefault(x, 0) + 1);
      mp2.put(x, mp2.getOrDefault(x, 0) + 1);
    }

    for(int x: mp1.keySet()){
      int value_x = mp1.get(x);
      System.out.println(x + " " + value_x);
    }
 
    for(int key_x : mp2.keySet()){
      int value_x = mp2.get(key_x);
      System.out.println(key_x + " " + value_x);
    }
  }
}
