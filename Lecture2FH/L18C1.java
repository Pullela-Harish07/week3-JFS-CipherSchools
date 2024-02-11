/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.cweek1;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Harish
 */
public class L18C1 {
    public static void main(String[] args){
        File f = new File("d:\\testfile.txt");
        //for creating file we call createnew file() method
        try{
            f.createNewFile();
        } catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("file created successfully");
    }
}
