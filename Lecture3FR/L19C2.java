/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.cweek1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Harish
 */
public class L19C2 {
    public static void main(String[] args)throws IOException{
        FileReader fr = new FileReader("D:\\documents_copy\\CSE 4TH YEAR 2ND SEM\\WINTER PEP - JAVA FULLSTACK\\pokemon.csv");
        BufferedReader br = new BufferedReader(fr);
        
        String line;
        ArrayList<String> pokemons = new ArrayList<String>();
        br.readLine();
        while((line=br.readLine())!=null){
            System.out.println(line);
            pokemons.add(line);
        }
        System.out.println("Total pokemons"+ pokemons.size());
        ArrayList<String> pokemonTitles = new ArrayList<String>();
        for(String pok : pokemons){
            String title = pok.split(",")[0];
            pokemonTitles.add(title);
        }
        System.out.println(pokemonTitles);
        br.close();
        fr.close();
    }
}
