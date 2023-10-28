/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson1;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Lesson1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Scanner input = new Scanner(System.in);
      
      Account vall = new Account("simo vall");
      
      Account vall = new Account();
      
      System.out.printf("Initial name is: %s%n%n", vall.getName());
      System.out.println();
      
      System.out.println("Please enter the name:");
      
      String vallAccountName = input.nextLine();
      
      vall.setName(vallAccountName);
      
      System.out.println();
      
      System.out.println ("Account Name is:" + vall.getName());
      
      
      
      Date monday = new Date(23,10,2023);
      System.out.println();
      System.out.println("Month of today:" + monday.monthchar());
      System.out.println("Day:_" +monday.getDay() + "Month:_" +monday.monthchar()+"Year:_"+monday.getYear());
      
      
      System.out.print("\"Welcome to Java Programming\"");
      
      
    }

    public Lesson1() {
    }
    
}




