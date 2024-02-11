/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.cweek1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Harish
 */
public class L17C5 {
    public static void main(String[] args){
      
        HashMap<String, String> states = new HashMap<String, String>();
        
        states.put("Tx", "Texas");
        states.put("Al", "Alabama");
        states.put("Ar", "Arizona");
        states.put("Ca", "California");
        System.out.println(states);
        for(Map.Entry<String, String> e: states.entrySet()){
            System.out.println(e.getKey()+"--"+e.getValue());
        }
    }    
}
