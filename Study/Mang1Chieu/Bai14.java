package Study.Mang1Chieu;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.security.KeyFactory;
import java.util.regex.*;

public class Bai14 {
  static boolean check(int n){
    ArrayList<Integer> v = new ArrayList<>();
    while(n != 0){
      v.add(n % 10);
      n /= 10;
    }
    Collections.reverse(v);
    for(int i = 0; i < v.size() - 1; i++){
      if(v.get(i) > v.get(i + 1)){
        return false;
      }
    }
    return true;
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

    List<Integer> a = new ArrayList<>(mp.values());
    Collections.sort(a);
    

    for(int k: mp.keySet()){
      int value_x = mp.get(k);
      System.out.println(k + " " + value_x);
    }
  }
}
