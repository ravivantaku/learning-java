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
public class Shuffle1 {

    public static void main(String[] args) {
        int x = 3;

        while (x > 0) {
            if (x > 2) {
                System.out.print("a");
            }
            System.out.print("-");
            x = x - 1;
            if (x == 2) {
                System.out.print("b c");
            }
            if (x == 1) {
                System.out.println("d");
                x = x - 1;
            }
        }
    }
}
