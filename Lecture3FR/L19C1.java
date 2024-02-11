/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.cweek1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Harish
 */
public class L19C1 {
    public static void main(String[] args)throws IOException{
        FileReader fr = new FileReader("D:\\testfile.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        System.out.println(line);
        line = br.readLine();
        System.out.println(line);
        line = br.readLine();
        System.out.println(line);
    }
}
