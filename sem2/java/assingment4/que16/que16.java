/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author mca_2
 */
import java.util.*;

class Student{
    String name;
    int roll;
    float ca1, ca2, ca3, ca4, pca1, pca2;
    void cin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your detalis:");
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Roll: ");
        roll = sc.nextInt();
        System.out.println("Marks: ");
        System.out.print("CA1: ");
        ca1 = sc.nextInt();
        System.out.print("CA2: ");
        ca2 = sc.nextInt();
        System.out.print("CA3: ");
        ca3 = sc.nextInt();
        System.out.print("CA4: ");
        ca4 = sc.nextInt();
        System.out.print("PCA1: ");
        pca1 = sc.nextInt();
        System.out.print("PCA1: ");
        pca2 = sc.nextInt();
    }
    void cout(){
        System.out.println("Student detalis:");
        System.out.print("Name: "+name);
        System.out.print("Roll: "+roll);
        System.out.println("Marks: ");
        System.out.print("CA1: "+ca1);
        System.out.print("CA2: "+ca2);
        System.out.print("CA3: "+ca3);
        System.out.print("CA4: "+ca4);
        System.out.print("PCA1: "+pca1);
        System.out.print("PCA1: "+pca2);
    }
    float CA(){
        return ca1+ca2+ca3+ca4;
    }
    float PCA(){
        return pca1+pca2;
    }
    double totalMarks(){
        return ((ca1+ca2+ca3+ca4+pca1+pca2)/7.0)*100;
    }
       
}

public class que16 {
    public static void main(String[] args){
        Student[] s = new Student[5];
        for(int i = 0 ; i < 5 ; i++){
            s[i] = new Student();
            s[i].cin();
        }
        for(int i = 0 ; i < 5 ; i++){
            s[i].cout();
            System.out.println("Total CA marks: "+s[i].CA());
            System.out.println("Total PCA marks: "+s[i].PCA());
            System.out.println("Overall Percentage: "+s[i].totalMarks());
        }
    }
}
