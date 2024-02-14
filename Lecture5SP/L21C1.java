/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.cweek1;

import java.util.ArrayList;

/**
 *
 * @author Harish
 */
public class L21C1 {
    public static void main(String[] args){
        ArrayList<String> lang = new ArrayList<String>();
        lang.add("java");
        lang.add("c++");
        lang.add("python");
        
        lang.forEach(System.out::println);
    }
}
