package Study.Map_Set;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class bai4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    ArrayList<Integer> v = new ArrayList<>();
    for(int i = 0; i < n; i++){
      int x = input.nextInt();
      v.add(x);
    }
    int q = input.nextInt();
    while(q != 0){
      int k = input.nextInt();
      if(k == 1){
        int tmp = input.nextInt();
        v.add(tmp);
      }
      else if(k == 2){
        int tmp = input.nextInt();
        if(v.contains(tmp)){  
          v.remove(v.indexOf(tmp)); // indexOf: trả về vị trí xuất hiện đầu tiên trong List
        }
      }
      else{
        int tmp = input.nextInt();
        if(v.contains(tmp))System.out.println("YES");
        else System.out.println("NO");
      }
      q--;
    }
  }
}
