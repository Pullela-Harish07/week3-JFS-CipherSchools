/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.cweek1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 *
 * @author Harish
 */
public class L19C3 {
    public static void main(String[] args)throws IOException{
        FileReader fr = new FileReader("D:\\documents_copy\\CSE 4TH YEAR 2ND SEM\\WINTER PEP - JAVA FULLSTACK\\pokemon.csv");
        BufferedReader br = new BufferedReader(fr);
        
        String line;
        ArrayList<String> pokemons = new ArrayList<String>();
        br.readLine();
        while((line=br.readLine())!=null){
            //System.out.println(line);
            pokemons.add(line);
        }
        Scanner sc = new Scanner(System.in);
        String Type1 = sc.next();
        HashSet ptypes = new LinkedHashSet();
        if (!ptypes.contains(Type1)){
            System.out.println("Invalid Pokemon type");
            return;
        }
        for(String pok : pokemons){
            String ptype = pok.split(",")[1];
            if(ptype.equals(Type1)){
                System.out.println(pok);
            }
        }
    }
}
