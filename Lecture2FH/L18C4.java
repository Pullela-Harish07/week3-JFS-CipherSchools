/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.cweek1;

import java.io.File;

/**
 *
 * @author Harish
 */
public class L18C4 {
    public static void main(String[] args){
        File f = new File("D:\\Pictures_copy");
        String[] files = f.list();
        for(String file : files){
            System.out.println(file);
        }
        File[] files_arr = f.listFiles();
        for(File ff : files_arr){
            ff.delete();
        }
    }
}
