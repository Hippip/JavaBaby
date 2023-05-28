package Study.Mang1Chieu;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Bai7_SapXepChanLe {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Integer n = input.nextInt();
    Integer[] a = new Integer[n];
    for(int i = 0; i < n ; i++){
      a[i] = input.nextInt();
    }

    Arrays.sort(a, new Comparator<Integer>() {
      public int compare(Integer a, Integer b){
        if(a % 2 == 0  && b % 2 == 0){
          return a - b;
        }
        else if(a % 2 != 0 && b % 2 != 0){
          return b - a;
        }
        else if( a % 2 != 0){
          return -1;
        }
        else{
          return 1;
        }
      }
    });
     
    for(int x: a){
      System.out.print(x + " ");
    }
  }
}
