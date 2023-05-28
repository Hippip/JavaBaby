package Study.Mang1Chieu;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class bai12 {
  static boolean check(int n){
    for(int i = 2; i <= Math.sqrt(n); i++){
      if(n % i != 0) return false;
    }
    return n > 1;
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Map<Integer, Integer> mp = new LinkedHashMap<>();
    while(input.hasNext()){
      int x = input.nextInt();
      if(check(x)){
        mp.put(x, mp.getOrDefault(x, 0) + 1);
      }
    }

    for(int x: mp.keySet()){
      int value_x = mp.get(x);
      System.out.println(x + " " + value_x);
    }
  }
}
