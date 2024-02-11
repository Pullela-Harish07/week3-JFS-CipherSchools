/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.cweek1;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 *
 * @author Harish
 */
public class L17C4 {
    public static void main(String[] args){
        HashSet mys = new HashSet();
        mys.add("Ironman");
        mys.add("Thor");
        mys.add("Hulk");
        mys.add("Hulk");
        System.out.println(mys);
     
        LinkedList myll = new LinkedList();
        myll.add("green");
        myll.add("red");
        myll.add("orange");
        myll.add("red");
        System.out.println(myll);
       
        TreeSet myt = new TreeSet();
        myt.add("Ironman");
        myt.add("Thor");
        myt.add("Hulk");
        myt.add("Loki");
        System.out.println(myt);
    }    
}
