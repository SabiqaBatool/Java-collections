/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setandlist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author sabiq
 */
public class SetAndList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //set
        Set<Integer> set = new HashSet<Integer>(); 
        set.add(1); 
        set.add(2); 
        set.add(2); 
        set.add(3); 
         
        System.out.print("duplicates are removed"); 
        System.out.println(set); 
        
        //list       
        List<Integer> l1 = new ArrayList<Integer>(); 
        l1.add(0, 10);
        l1.add(1, 20);  
        System.out.println(l1);   
  
        l1.remove(1);      
        System.out.println(l1); 
    }
    
}
