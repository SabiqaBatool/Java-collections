/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashsetandsortedset;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author sabiq
 */
public class HashSetAndSortedSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //hash set 
        HashSet<String> h = new HashSet<String>(); 
        h.add("Sammar"); 
        h.add("Wajeeha"); 
        h.add("Noor"); 
        h.add("Wajeeha");
  
        // Displaying the HashSet without duplicates 
        System.out.println(h); 
        // sorted set
          SortedSet<String> sortedNames = new TreeSet<>();
          sortedNames.add("X");
          sortedNames.add("A");
          sortedNames.add("C");
          sortedNames.add("Z");

    // Sorted alphabets will be printed
    System.out.println(sortedNames);
  }
  
    }
    
}
