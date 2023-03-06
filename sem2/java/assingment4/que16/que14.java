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


class term{
    int numerator = 1;
    int dinominator;
    term(){
        
    }
    term(int d){
        dinominator = d;
       
    }
    display(){
        System.out.println(numerator+"/"+dinominator);
    }
    
    double div(){
        return numerator/(float)dinominator;
    }
    
}

public class que14 {
    static public double sumOfSeries(term t[], int n){
        double sum = 0;
        for(int i = 0 ; i < n ; i++){
            sum += t[i].div();
        }
        return sum;
    }
    public static void main(String[] args){
        int n = 5;
        double sum = 0;
        term[] t = new term[n] ;
        for(int i = 0 ; i < n ; i++){
            t[i] = new term(i+1);
//            t[i].display();
                    System.out.println(t[i].div());

        }
        sum = sumOfSeries(t, n);
        System.out.println("Sum = "+sum);

    }
}
