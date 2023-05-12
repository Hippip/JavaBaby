package Study.Map_Set;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class bai1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int[] a = new int[n];
    Set<Integer> s = new TreeSet<>();
    for(int i = 0; i < n ; i++){
      a[i] = input.nextInt();
      s.add(a[i]);
    }

    System.out.print(s.size());

  }
}
