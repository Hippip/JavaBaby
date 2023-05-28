package Study.XauKiTu;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class bai14 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String s = input.nextLine();
    String []s1 = s.split("\\s+");
    TreeMap<String, Integer>mp = new TreeMap<>();
    for(int i = 0 ; i < s1.length; i++){
      mp.put(s1[i], mp.getOrDefault(s1[i], 0) + 1);
    }
    int ts_max = Integer.MIN_VALUE , ts_min = Integer.MAX_VALUE;
    String str_max = " ", str_min = " ";
    for(String x: mp.keySet()){
      int value_x = mp.get(x);
      if(value_x >= ts_max){
        ts_max = value_x;
        str_max = x;
      }
      if(value_x <= ts_min){
        ts_min = value_x;
        str_min = x;
      }
    }

    System.out.println(str_max + " " + ts_max);
    System.out.println(str_min + " " + ts_min);

  }
}
