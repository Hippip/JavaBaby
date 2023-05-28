package Study.Mang1Chieu;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//cap so nt cung nhau la cap co cung ucln la 1
public class Bai6_DemCapSoNTCungNhau {
  static int ucln(int a, int b){
    if(b == 0)return a;
    else{
       return ucln(b, a % b);
    }
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int[] a = new int[n];
    
    for(int i = 0; i < n; i++){
      a[i] = input.nextInt();
    }

    int dem = 0;
    for(int i = 0; i < n - 1; i++){
      for(int j = i + 1; j < n; j++){
        if(ucln(a[i], a[j]) == 1)dem++;
      }
    }
    System.out.println(dem);

  }
}
