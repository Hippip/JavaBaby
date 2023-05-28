package Study.Map_Set;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class bai28_demTanXuat {
  static boolean check1(TreeMap<Integer, Integer>mp){
    ArrayList<Integer> a = new ArrayList<>();
    a.addAll(mp.keySet());
    int ts_check = mp.firstKey();
    for(int x: a){
      if(x != ts_check) return false;
    }
    return true;
  }

  static boolean check2(TreeMap<Integer, Integer>mp){
    ArrayList<Integer> a = new ArrayList<>();
    a.addAll(mp.keySet());
    int ts_check = mp.firstKey();
    for(int i = 0 ; i < a.size(); i++){
      
    }
    return true;
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    ArrayList<Integer> v = new ArrayList<>();
    TreeMap<Integer, Integer> mp = new TreeMap<>();
    for(int i = 0 ; i < n ;i++){
      int x = input.nextInt();
      v.add(x);
    } 

    for(int i = 0 ; i < v.size(); i++){
      int key_v = v.get(i);
      if(mp.containsKey(key_v)){
        mp.put(key_v, v.get(key_v)+1);
      }
      else{
        mp.put(key_v, 1);
      }
    }
    if (check1(mp)){
      System.out.println("YES");
    }
    else{
      System.out.println("NO");
    }
    
  }
}
