package Study.XauKiTu;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class bai21 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String s = input.nextLine();
    String t = input.nextLine();

    s = s.toLowerCase();
    t = t.toLowerCase();

    String[] s1 = s.split("\\s+");
    String[] t1 = t.split("\\s+");

    TreeSet<String>se = new TreeSet<>();
    TreeSet<String>te = new TreeSet<>();

    for(String x: s1){
      se.add(x);
    }

    for(String x: t1){
      te.add(x);
    }
    
    TreeSet<String> ans = new TreeSet<>();
    for(String x: se){
      if(te.contains(x)){
        ans.add(x);
      }
    }

    for(String x: ans){
      System.out.print(x + " ");
    }
    
  }
}
