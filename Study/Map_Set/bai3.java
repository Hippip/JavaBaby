package Study.Map_Set;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class bai3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    Set<Integer> se = new LinkedHashSet<>();
    for(int i = 0 ; i < n ; i++){
      int x = input.nextInt();
      se.add(x);
    }

    for(Integer x : se){
      System.out.print(x + " ");
    }
  }
}
