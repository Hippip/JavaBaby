package Study.Map_Set;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class bai1WithSort {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int[] a = new int[n];
    for(int i = 0 ; i < n; i++){
      a[i] = input.nextInt();
    }
    Arrays.sort(a);
    int dem = 1;
    for(int i = 0 ; i < n - 1; i++){
      if(a[i] != a[i + 1]){
        dem++;
      }
    }
    System.out.print(dem);
  }
}
