package java1.workshops.generics;

import java.math.BigInteger;

public class GenericsTask2 {

   public static void main(String[] args) {
      System.out.println("Result: " + 
            Compute.compute("add", Long.valueOf(1), Long.valueOf(2)));
      System.out.println("Result: " + 
            Compute.compute("minus", Integer.valueOf(2), Integer.valueOf(1)));
      System.out.println("Result: " + 
            Compute.compute("mul", Float.valueOf("2.0"), Float.valueOf("5.5")));
      System.out.println("Result: " + 
            Compute.compute("div", Double.valueOf(8.0), Double.valueOf(0.0)));
      System.out.println("Result: " + 
            Compute.compute("div", Double.valueOf(8.0), Double.valueOf(2.0)));
      System.out.println("Result: " + 
            Compute.compute("div", BigInteger.valueOf(3), BigInteger.valueOf(1)));
   }
}

class Compute {
   public static <T extends Number> double compute(String op, T x, T y) {
      // Exercise 2: Implement all 4 operations (add/minus/mul/div)
      // as seen in static main(). For op "div", check for and handle
      // "divide by zero" errors (you can return 0.0 for such cases)
      if (x == null || y == null)
         return 0.0;
      
      double dx = x.doubleValue();
      double dy = y.doubleValue();
            
      switch (op) {
         case "add":
            return dx + dy;
            
         case "minus":
            return dx - dy;
            
         case "mul":
            return dx * dy;         
            
         case "div":
            if (dy == 0.0)
               return 0.0;          
            return dx / dy;                  
      }
      
      return 0.0;
   }
}
