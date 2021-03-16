//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Carolyn Savas

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class HistogramRunner
{
 public static void main( String args[] ) throws IOException
 {
  //add test cases  
   Histogram one = new Histogram("a b c d e f g h i a c d e g h i h k");
   System.out.println(one);
   Histogram two = new Histogram("1 2 3 4 5 6 1 2 3 4 5 1 3 1 2 3 4");
   System.out.println(two);
   Histogram three = new Histogram("Y U I O Q W E R T Y");
   System.out.println(three);
   Histogram four = new Histogram("4 T # @ ^ # # # # # # # # #");
   System.out.println(four);
 }
}