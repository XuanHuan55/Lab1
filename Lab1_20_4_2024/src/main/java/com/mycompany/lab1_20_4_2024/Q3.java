/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1_20_4_2024;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Q3 {

    private int n;

    public Q3() {
    }

    public Q3(int n) {
        this.n = n;
    }

    public int Hailstone(int n) {
        while (n != 1)
        if (n % 2 == 0) {
            n = n / 2;
        } else if (n % 2 == 1) {
            n = n * 3 + 1;
        }
        return n;
    }
    public void inputQ3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        n = sc.nextInt();
    }
    public void outputQ3(){
        int res = Hailstone(n);
        System.out.println(res);
    }
}
