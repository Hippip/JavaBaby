package Study.Mang1Chieu;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class bai10 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int m = input.nextInt();
    Set<Integer> se1 = new TreeSet<>();
    Set<Integer> se2 = new TreeSet<>();
    for(int i = 0 ; i < n ; i++){
      int x = input.nextInt();
      se1.add(x);
    }

    for(int j = 0 ; j < m; j++){
      int x = input.nextInt();
      se2.add(x);
    }

    Set<Integer> se3 = new TreeSet<>();
    for(int x: se1){
      if(se2.contains(x)){
        se3.add(x);
      }
    }
    Set<Integer> se4 = new TreeSet<>();
    for(int x: se1){
      se4.add(x);
    }
    for(int y: se2){
      se4.add(y);
    }
    
    for(int x: se4){
      System.out.print(x + " ");
    }
    System.out.print("\n");

    for(int x: se3){
      System.out.print(x + " ");
    }
  }
}
