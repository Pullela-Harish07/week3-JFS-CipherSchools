/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.cweek1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Harish
 */
public class L17C3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList myll = new ArrayList();
        for (int i=1;i<=3;i++){
            String item = sc.next();
            
            if (myll.contains(item)){
                continue;
            }
            myll.add(item);
        }
        System.out.println(myll);
    }
}
