/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treesetandhashset;

import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author sabiq
 */
public class TreesetAndHashSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         HashSet<Integer> h = new HashSet<Integer>();
 
     //add elements to HashSet
     h.add(11);
     h.add(11); // duplicate will not be added
 
     // Displaying HashSet elements
     System.out.println("HashSet:");
     for(Integer temp : h){
        System.out.println(temp);
    
     }
     
     TreeSet<Integer> t = new TreeSet<Integer>();
 
     //add elements to TreeSet
     t.add(11);
     t.add(11);  //duplicate remove
  
     // Displaying TreeSet elements
     System.out.println("TreeSet contains: ");
     for(Integer x : t){
        System.out.println(x);
     }
    }
    
}
