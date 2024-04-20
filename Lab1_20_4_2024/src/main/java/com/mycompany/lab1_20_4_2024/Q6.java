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
public class Q6 {
    private String n;
    private String n1;

    public Q6() {
        n ="";
        n1="";
    }

    public void setN(String n) {
        this.n = n;
    }

    public void setN1(String n1) {
        this.n1 = n1;
    }
    
    
    public int findLength(){
        return n.length();
       
    }
    public int countWord(){
        String[] words = n.split("\\s");
        return words.length;
    }
    public void concatenateStrings() {
        n += n1;
    }

    public boolean isPalindrome() {
        String reversedString = "";
        for (int i = n.length() - 1; i >= 0; i--) {
            reversedString += n.charAt(i);
        }
        return n.equalsIgnoreCase(reversedString);
    }
    
    public void inputQ6(){
        Scanner sc= new Scanner(System.in);
        Q6 q6 = new Q6();
        n = sc.nextLine();
        q6.setN(n);
        n1 = sc.nextLine();
        q6.setN1(n1);       
        System.out.println("Length of String: " + q6.findLength());
        System.out.println("Number of words in the string: " + q6.countWord());
        System.out.println("Concatenating second string to first string...");
        q6.concatenateStrings();
        System.out.println("After concatenate: "+ q6.n);
         if (q6.isPalindrome()) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
