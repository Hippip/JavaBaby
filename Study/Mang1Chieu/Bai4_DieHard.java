package Study.Mang1Chieu;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Bai4_DieHard {
  static boolean check(int a[], int n){
    int d25 = 0 , d50 = 0;
    for(int i = 0 ; i < n; i++){
      if(a[i] == 25){
        d25++;
      }
      else if(a[i] == 50){
        if(d25 > 0){
          d25--;
          d50++;
        }
        else{
          return false;
        }
      }
      else{
        if(d50 > 0 && d25 > 0){
          d25--;
          d50--;
        }
        else if(d25 >= 3){
          d25 -= 3;
        }
        else{
          return false;
        }
      }
    }
    return true;
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int[] a = new int[n];
    for(int i = 0 ; i < n ; i++){
      a[i] = input.nextInt();
    }
    if(check(a, n)) System.out.println("YES");
    else System.out.println("NO");
  }
}
