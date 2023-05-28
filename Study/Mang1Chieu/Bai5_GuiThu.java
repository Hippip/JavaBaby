package Study.Mang1Chieu;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Bai5_GuiThu {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
      a[i] = input.nextInt();
    }

   
    for(int i = 0 ; i < n; i++){
    int gt_max = Integer.MIN_VALUE, gt_min = Integer.MAX_VALUE;
      for(int j = 0; j < n; j++){
        if(a[i] != a[j]){
          int ans = Math.abs(a[i] - a[j]);
          if(ans > gt_max){
            gt_max = ans;
          }
          if( ans < gt_min){
            gt_min = ans;
          }
        }
      }
      System.out.println(gt_min + " " + gt_max);
    }
  }
}
