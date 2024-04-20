/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1_20_4_2024;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Q2 {

    private int n1;
    private int n2;
    private int n3;

    public Q2() {
    }

    public Q2(int n1, int n2, int n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public int findMin(int n1,int n2,int n3) {
        int min;
        if (n1 <= n2 && n1 <= n3) {
            min = n1;
        } else if (n2 <= n1 && n2 <= n3) {
            min = n2;
        } else {
            min = n3;
        }
        return min;
    }
    public void inputQ2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n1");
        n1 = sc.nextInt();
        System.out.println("Enter n2");
        n2 = sc.nextInt();
        System.out.println("Enter n3");
        n3 = sc.nextInt();
    }
    public void outputQ2(){
        int min = findMin(n1,n2,n3);
        System.out.println("Min: " + min);
    }
}
