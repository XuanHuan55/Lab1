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
public class Q4 {

    private int n;
    private int a[];

    public Q4() {
    }

    public Q4(int n) {
        this.n = n;
    }

    public int sumArray(int n, int a[]) {
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            temp += a[i];
        }
        return temp;
    }

    public void inputQ4() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
    }
        public void outputQ4(){
            int sum = sumArray(n, a);
            System.out.println(sum);
        }
    }

