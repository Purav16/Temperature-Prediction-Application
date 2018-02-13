/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temprature_application;

/**
 *
 * @author purav
 */
import java.util.Scanner;
public class Temprature_Application {

    /**
     * @param args the command line arguments
     */
    public static long average_temp(long[] array){
        long average = 0;
        long sum = 0;
        for ( int i = 0 ; i < array.length ; i++ ){
            sum = sum + array[i];
        }
        
        return average = sum/array.length;
    }
    public static long minimum(long[] array){
        long min = array[0];
        for ( int i = 0 ; i < array.length ; i++ ){
            if (array[i] < min){
                min = array[i];
            }
            
        }
        return min;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter number of days:  ");
        int days = sc.nextInt();
        System.out.println("Please Enter the tempratures:  ");
        long[] tempratures  = new long[days];
        for ( int i = 0 ; i < days ; i++ ){
            tempratures[i] = sc.nextLong();
        }
        
        System.out.println("Average temprature for " + days + " number of days is:" + average_temp(tempratures));
        System.out.println("Minimum Temprature for " + days + "is: " + minimum(tempratures));
    }
    
}
