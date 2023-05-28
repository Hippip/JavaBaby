package Study.Map_Set;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class bai2WithSet {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    Set<Integer> se = new TreeSet<>();
    for(int i = 0; i < n ; i++){
      int x = input.nextInt();
      se.add(x);
    }
    int t = input.nextInt();
    while(t != 0){
      int k = input.nextInt();
      if(se.contains(k)) System.out.println("YES");
      else System.out.println("NO");
      t--;
    }
    
  }
}
