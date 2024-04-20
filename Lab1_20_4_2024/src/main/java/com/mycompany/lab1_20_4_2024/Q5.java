/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1_20_4_2024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q5 {
    private ArrayList<Integer> arrayList;

    public Q5() {
        this.arrayList = new ArrayList<>();
    }

    public boolean removeFirstSpecificElement(int element) {
        return arrayList.remove((Integer) element);
    }

    public void insertElement(int position, int element) {
        if (position >= 0 && position <= arrayList.size()) {
            arrayList.add(position, element);
            arrayList.set(arrayList.size() - 1, arrayList.get(arrayList.size() - 2));
        } else {
            System.out.println("Invalid position.");
        }
    }

    public ArrayList<Integer> findDuplicates() {
        ArrayList<Integer> duplicates = new ArrayList<>();
        ArrayList<Integer> uniqueElements = new ArrayList<>();
        for (int num : arrayList) {
            if (!uniqueElements.contains(num)) {
                uniqueElements.add(num);
            } else if (!duplicates.contains(num)) {
                duplicates.add(num);
            }
        }
        return duplicates;
    }

    public void removeDuplicates() {
        arrayList.removeAll(findDuplicates());
    }

    public void displayArray() {
        System.out.println("Array: " + arrayList);
    }

    public void inputQ6() {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> arr = new ArrayList<>(); 
        Q5 arrayOps = new Q5();
        arr.add(sc.nextInt());
       
        int elementToRemove = sc.nextInt();
        boolean removed = arrayOps.removeFirstSpecificElement(elementToRemove);
        System.out.println("After removing " + elementToRemove + ": " + removed);
        arrayOps.displayArray();

        // Insert an element at a specific position
        int positionToInsert = sc.nextInt();
        int elementToInsert = sc.nextInt();
        arrayOps.insertElement(positionToInsert, elementToInsert);
        arrayOps.displayArray();

        // Find and display duplicate values
        ArrayList<Integer> duplicates = arrayOps.findDuplicates();
        System.out.println("Duplicate values: " + duplicates);
        arrayOps.removeDuplicates();
        arrayOps.displayArray();
    }
}
