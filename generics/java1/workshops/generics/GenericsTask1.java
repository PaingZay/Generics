package java1.workshops.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsTask1 {
   public static void main(String[] args) {
      List<Integer> intList = new ArrayList<>();
      intList.add(1);
      intList.add(2);
      
      Swap.swap(intList);
      // output must be 2 1
      for (Integer n : intList) {         
         System.out.println(n);
      }
      
      List<String> strList = new ArrayList<>();
      strList.add("First");
      strList.add("Second");
      
      Swap.swap(strList);
      // output must be Second First
      for (String st : strList) {         
         System.out.println(st);
      }
   }
}

class Swap {
   // To do:
   // Write a method swap, given a list of a generic type, swap the values
   // of the first two element
   public static <T> void swap(List<T> list) {
      T tmp = list.get(0);
      list.set(0, list.get(1));
      list.set(1, tmp);
   }
}
