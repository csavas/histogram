//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Carolyn Savas

import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Set;
import static java.lang.System.*;

public class Histogram
{
 private Map<String,Integer> histogram;

 public Histogram()
 {
   histogram = new TreeMap<String, Integer>();
 }

 public Histogram(String sent)
 {
   histogram = new TreeMap<String, Integer>();
   String[] list = sent.split(" ");
   for(String i : list){
     if(histogram.containsKey(i)){
       histogram.put(i, histogram.get(i)+1);
     }
     else{
       histogram.put(i, 1);
     }
   }
 }
 public String toString()
 {
  String output="char 1---5----10 \n";
  String allStars="";
  Set<String> hSet = new TreeSet<String>();
  hSet = histogram.keySet();
   for(String i : hSet){
    output += i + "    ";
    int k = Integer.valueOf(histogram.get(i));
    for(int y =0; y < k; y++){
      output +="*";
    }
    output+="\n";
  }
  return output+"\n\n";
 }
}