package Study.Map_Set;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class bai5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = Integer.parseInt(input.nextLine());
    Map<String, String>mp = new TreeMap<>();
    for(int i = 0 ; i < n ; i++){
      String msv = input.nextLine();
      String ten = input.nextLine();
      mp.put(msv, ten);
    }
    int q = Integer.parseInt(input.nextLine());
    while( q != 0){
      String msv_find = input.nextLine();
      if(mp.containsKey(msv_find)){
        System.out.println(mp.get(msv_find));
      }
      else{
        System.out.println("NOT FOUND");
      }
      q--;
    }

  }
}
