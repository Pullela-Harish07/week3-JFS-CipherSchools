/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.cweek1;

/**
 *
 * @author Harish
 */
interface mathX{
    void add(int n1,int n2);
}

public class L21C4 {
    public static void main(String[] args){
         mathX obj = (int x, int y)->{
            System.out.println(x+y);
        };
        obj.add(10,20);
    }
}
