/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.cweek1;

/**
 *
 * @author Harish
 */
class worker extends Thread {

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread 1 running: " + new java.util.Date());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // Handle the exception (e.g., log it or recover gracefully)
                System.err.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

public class L23C1 {

    public static void main(String[] args) throws Exception {
        worker w1 = new worker();
        w1.start();
    }
}

