/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.cweek1;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Harish
 */

class Program{
    static void Converter(int arg){
        System.out.println(Math.abs(arg));
    }
    void doAction(){
        List<Integer> numbers = Arrays.asList(5,-3,6,7,2,4);
        numbers.forEach(Program::Converter);
    }
}
public class L21C2 {
    public static void main(String[] args){
        Program obj = new Program();
        obj.doAction();
    }
}
