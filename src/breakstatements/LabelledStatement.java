/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakstatements;  //labelled break statement

/**
 *
 * @author JUDITH
 */
public class LabelledStatement {
    
    public static void main(String[] args) {
      int counter = 0;
      start: {
         for (int i = 0; i <= 30; i++) {
            for (int j = 0; j <= 30; j++) {
               if (i == 10)
                  break start;
            }
            counter++;
         }
      }
      System.out.println(counter);
   }
    
}
