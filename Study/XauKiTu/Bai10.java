package Study.XauKiTu;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Bai10 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Set<String> se1 = new TreeSet<>();
    Set<String> se2 = new LinkedHashSet<>();
    while(input.hasNext()){
      String s = input.next();
      se1.add(s);
      se2.add(s);
    }

    for(String x: se1){
      System.out.print(x + " ");
    }

    for(String x: se2){
      System.out.print(x + " ");
    }
  }
}
