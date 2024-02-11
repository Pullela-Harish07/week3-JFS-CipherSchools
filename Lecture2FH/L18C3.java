/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.cweek1;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Harish
 */
public class L18C3 {
    public static void main(String[] args)throws IOException{
        FileWriter fw = new FileWriter("D:\\testfile.txt");
        
            fw.write("I am Harish");
            fw.write("I Love Water");
            fw.write("And Trees");
            fw.flush();
            fw.close();
            System.out.println("file prepared!");
    }
}    
    

