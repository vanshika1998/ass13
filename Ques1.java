import java.util.*;
 class Ques1 {
  public static void main(String[] args) {
     
        HashSet<String> H1 = new HashSet<String>(); // First empty HashSet

          // use add() method to add values in the hash set
          H1.add("C");
          H1.add("C++");
          H1.add("JAVA");
          H1.add("PYTHON");
          System.out.println("\nFirst HashSet content: "+H1);

          //Second Empty HashSet
          HashSet<String>H2 = new HashSet<String>();
          H2.add("RUBY");
          H2.add("JAVA");
          H2.add("JAVASCRIPT");
          H2.add("C++");
          System.out.println("\nSecond HashSet content: "+H2);
          
          //Retain Elements
          H1.retainAll(H2);
          System.out.print("\nHashSet content:");
          System.out.print(H1);
     }
}