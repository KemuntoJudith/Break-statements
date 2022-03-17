/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakstatements;  //unlabelled break statement

/**
 *
 * @author JUDITH
 */
public class BreakStatements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int fruit = 5;
switch (fruit) {
  case 1:
    System.out.println("Orange");
    break;
  case 2:
    System.out.println("Apple");
    break;
  case 3:
    System.out.println("Papaya");
    break;
  case 4:
    System.out.println("Grape");
    break;
  case 5:
    System.out.println("Mango");
    break;
  case 6:
    System.out.println("Pomegranate");
    break;
  case 7:
    System.out.println("Guava");
    break;
}
// Outputs "Mango" (fruit 5)
    }
   
    
}
