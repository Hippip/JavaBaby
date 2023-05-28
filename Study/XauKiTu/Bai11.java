package Study.XauKiTu;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Bai11 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String s = input.nextLine();
    ArrayList<String> v1 = new ArrayList<>();
    ArrayList<String> v2 = new ArrayList<>();
    String[] s1 = s.split(" ");
    for(String x: s1){
      v1.add(x);
      v2.add(x);
    }

    // so sanh 2 chuoi theo thu tu tu dien su dung ham compareTo
    Collections.sort(v1, new Comparator<String>() {
      public int compare(String a, String b){
        return a.compareTo(b);
      }
    });

    Collections.sort(v2, new Comparator<String>() {
      public int compare(String a, String b){
        if(a.length() == b.length()) return a.compareTo(b);
        else{
          return a.length() - b.length();
        }
      }
    });

    for(String x: v1){
      System.out.print(x + " ");
    }
    System.out.println();
    
    for(String x: v2){
      System.out.print(x + " ");
    }
  }
}
