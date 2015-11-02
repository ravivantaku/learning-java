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
public class BeerSong {
    public static void main(String[] args) {
      int beerNum = 99;
      String word = "bottles";
      
      while(beerNum > 0) {
        if(beerNum == 1){
          word = "bottle";
        }
       // System.out.println(beerNum + " " + word + " of beer in the wall");
        //System.out.println(beerNum + " " + word + " of beer. ");
        System.out.println("Take one down.");
        System.out.println("Pass it around");
        beerNum = beerNum -  1;
        if(beerNum > 0){
        System.out.println(beerNum + " " + word + " of beer in the wall");
        } else {
         System.out.println(beerNum + " " + word + " of beer. ");
        }
      }
    }
}
