/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package headfirstjava;

/**
 *
 * @author vantakr
 */
public class Loopy {
    public static void main(String[] args){
        int x = 1;
        System.out.println("Before loop");
        while(x < 4){
        System.out.println("In the loop");
        System.out.println("Value of x is " + x);
        x = x + 1;
        }
        System.out.println("This is after the loop");
    }
    
}
