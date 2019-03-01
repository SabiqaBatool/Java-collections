/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayandlist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sabiqa
 */
public class ArrayAndList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Integer[] arr = new Integer [2]; 
         arr[0] = 10; 
         arr[1] = 20;
          
         //dereferencing
         System.out.println("elements are:");  
       for (int i = 0; i < arr.length; i++) 
         System.out.println(arr[i]); 
       
       //list
        List<Integer> l1 = new ArrayList<Integer>(); 
        l1.add(0, 10);
        l1.add(1, 20);  
        System.out.println(l1);   
  
        // Removes element from index 1 
        l1.remove(1);      
        System.out.println(l1); 
  
     
    } 
}
