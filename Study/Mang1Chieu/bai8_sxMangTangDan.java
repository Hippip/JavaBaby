package Study.Mang1Chieu;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class bai8_sxMangTangDan {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
  int n = input.nextInt();
  int m = input.nextInt();
  int[] a = new int[n];
  int[] b = new int[m];
  ArrayList<Integer> v = new ArrayList<>();
  for(int i = 0; i < n; i++){
    a[i] = input.nextInt();
  }
  for(int j = 0 ; j < m; j++){
    b[j] = input.nextInt();
  }
  int t = 0 , k = 0;
  while(t < n && k < m){
    if(a[t] < b[k]){
      v.add(a[t]);
      t++;
    }
    else{
      v.add(b[k]);
      k++;
    }
  }
  while(t < n){
    v.add(a[t]);
    t++;
  }
  while(k < m){
    v.add(b[k]);
    k++;
  }
  for(int x: v){
    System.out.print(x + " ");
  }
  }
  
}
