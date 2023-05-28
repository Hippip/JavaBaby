package Study.Mang1Chieu;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class bai13_doiTienThamLam {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] a = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
    long n = input.nextLong();
    long dem = 0;
    int i = 0;
    while(n != 0){
      if(n >= a[i]){
        dem += n / a[i];
        n = n % a[i];
      }
      else{
        i++;
      }
    }
    System.out.println(dem);
  }
}
