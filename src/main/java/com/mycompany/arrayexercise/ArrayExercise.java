/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.arrayexercise;

/**
 *
 * @author Cha
 */
import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercise {

    public static void main(String[] args) {
        // Write a Java program that sums the array's values with the following elements: 25, 4, 16, 9, 10.
        int Array1[] = {25, 4, 16, 9, 10};
        
        int sum = 0;
        for(int i:Array1){
            sum +=i;
        }
        System.out.println("Sum of Array1: "+sum);
        
        //Exercise 2: Write a Java program to test if an array contains a specific value. Create an array with five elements.
        int testVal = 4;
        Arrays.sort(Array1);
        System.out.println("Sorted Array: "+Arrays.toString(Array1));
        
        System.out.println("Value 4 is in index "+Arrays.binarySearch(Array1, testVal));
        
        boolean containsvalue=false;
        int checkValue= 11;
        for(int i =0;i<Array1.length;i++){
            if(Array1[i]==checkValue){
                containsvalue=true;
                break;              
            }                     
        }
        if(containsvalue){
            System.out.println("Array1 has the value "+testVal);
        }
        else{
            System.out.println("Array 1 has no value of "+testVal);
        }
        
        //Exercise 3: Write a Java program that creates an array of 5 integers and prompts the user to enter 5 integer values to fill the array. 
        //The program should then find the sum of all the elements in the array and print the result.
        
        Scanner inputscan = new Scanner(System.in);
        int Array2[]=new int[5] ;
        
        int sum1=0;
        for(int i=0;i<5;i++){
           System.out.println("Enter integer "+(i+1)+": ");
           Array2[i] = inputscan.nextInt();
           sum1 +=Array2[i];
        }
        System.out.println("The sum of all input integer: "+sum1);
        
        inputscan.close();
    }
}
