package Study.Map_Set;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class bai2WithBinarySearch {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n ; i++){
      a[i] = input.nextInt();
    }

    Arrays.sort(a);
    int t = input.nextInt();
    while(t != 0){
      int k = input.nextInt();
      if(Arrays.binarySearch(a, k) >= 0) System.out.println("YES");
      else System.out.println("NO");
      t--;
    }
  }
}
