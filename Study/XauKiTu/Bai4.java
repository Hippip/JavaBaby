package Study.XauKiTu;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Bai4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String s = input.nextLine();
    Map<Character, Integer>mp = new TreeMap<>();
    for(int i = 0 ; i < s.length(); i++){
      mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0) + 1);
    }
    char kt_max = s.charAt(0);
    char kt_min = s.charAt(0);
    int ts_max = Integer.MIN_VALUE;
    int ts_min = Integer.MAX_VALUE;
    for(Character x: mp.keySet()){
      int value_x = mp.get(x);
      if(value_x >= ts_max){
        ts_max = value_x;
        kt_max = x;
      }
      if(value_x <= ts_min){
        ts_min = value_x;
        kt_min = x;
      }
    }
    System.out.println(kt_max + " " + ts_max);
    System.out.println(kt_min + " " + ts_min);
  }
}
