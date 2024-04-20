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
public class Q1 {
    private int number;

    public Q1() {
    }

    public Q1(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    public int sumFirstLastDigit(int number){
        int lastdigit = number % 10;
        int firstDigit = number;
        while(firstDigit >= 10)
            firstDigit /= 10;
            return lastdigit + firstDigit;
        }
    public void inputQ1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        number = sc.nextInt();
    }
    public void ouputQ1(){
        int sum = sumFirstLastDigit(number);
        System.out.println("Sum of first and last digit: "+ sum);
    }
    }

