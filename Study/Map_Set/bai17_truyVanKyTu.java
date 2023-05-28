package Study.Map_Set;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class bai17_truyVanKyTu {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String s = input.nextLine();
    Map<Character, Integer> mp = new TreeMap<>();
    for(int i = 0 ; i < s.length(); i++){
      char key_v = s.charAt(i);
      if(mp.containsKey(key_v)){
        int value_v = mp.get(key_v);
        mp.put(key_v, value_v + 1);
      }
      else{
        mp.put(key_v, 1);
      }
    }
    int max_v = Integer.MIN_VALUE;
    char ans_max = ' ';
    int min_v = Integer.MAX_VALUE;
    char ans_min = ' ';
    for(char c: mp.keySet()){
      int ans = mp.get(c);
      if(ans > max_v){
        max_v = ans;
        ans_max = c;
      }
      if(ans <= min_v){
        min_v = ans;
        ans_min = c;
      }
    }
    System.out.println(Character.toString(ans_max) + " " + max_v);
    System.out.println(Character.toString(ans_min) + " " + min_v);
    System.out.println(mp.size());
  }
}
