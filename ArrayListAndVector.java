/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.Vector;

/**
 *
 * @author sabiq
 */
public class AP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       HashSet<Integer> h = new HashSet<Integer>();
 
     //adding elements to HashSet
     h.add(11);
     h.add(11); // duplicate will not be added
 
     System.out.println("HashSet:");
     for(Integer temp : h){
        System.out.println(temp);
    
     }
     
     TreeSet<Integer> t = new TreeSet<Integer>();
 
     //adding elements to TreeSet
     t.add(11);
     t.add(11);  //duplicate remove
  
     System.out.println("TreeSet contains: ");
     for(Integer x : t){
        System.out.println(x);
     }
}
}