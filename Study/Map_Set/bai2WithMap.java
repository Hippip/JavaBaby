package Study.Map_Set;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class bai2WithMap {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    Map<Integer, Integer> mp = new TreeMap<>();
    for(int i = 0 ; i < n ; i++){
      int x = input.nextInt();
      mp.put(x, null);
    }

    
    
    int t = input.nextInt();
    while(t != 0){
      int k = input.nextInt();
      if(mp.containsKey(k))System.out.println("YES");
      else System.out.println("NO");
      t--;
    }
  }
}
