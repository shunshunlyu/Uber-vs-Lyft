// Shunshun Lyu
// CS 141
// HW Core Topics: if/else statements; interactive programs; methods that return
// values
// This program will ask the user for information about two weeks worth 
// of driving for Uber and Lyft, compute the  earnings for each week,
// and then determine which week had higher earnings. 

import java.util.*;


public class UberVsLyftnew {

   public static int UorL = 0;
   public static double baseEarnings = 0;
   public static double weekOneBase = 0;
   public static double weekOneExtra = 0;
   public static double weekOneEarnings = 0;
   public static double weekTwoBase = 0;
   public static double weekTwoExtra = 0;
   public static double weekTwoEarnings = 0;
   
   public static void main (String args[]) {
      introduceProgram();
      collectInfoForWeek(1);
      calculateExtraForWeek(1);
      collectInfoForWeek(2);
      calculateExtraForWeek(2);
      //conclusionForEarning();
      
   }
   
   public static void introduceProgram() {
      System.out.println("This program compares the earnings of two");
      System.out.println("weeks worth of driving for the ride share");
      System.out.println("services Uber and Lyft. ");
      System.out.println();
    }

   public static void collectInfoForWeek(int week) { 
      System.out.println("Information for Week #" + week + ":");
      Scanner console = new Scanner(System.in);
      System.out.print("\tDid you drive for 1) Uber or 2) Lyft? ");
      UorL = console.nextInt();
      System.out.print("\tHow many miles did you drive this week? ");
      int miles = console.nextInt();
      System.out.print("\tHow many hours did you drive this week? ");
      double hours = console.nextDouble();
      baseEarnings = 1.35 * miles + 0.24 * hours * 60;
      if (week == 1) {
         weekOneBase = baseEarnings;
      } else if (week == 2) {
         weekTwoBase = baseEarnings;
      }
      System.out.printf("\t-- Base earnings = $%.2f  --\n\n", baseEarnings);
   }
   
   public static void calculateExtra(week) {
      Scanner console = new Scanner(System.in);
      if (UorL == 1) {
         System.out.print("\tWhat was your drive acceptance rate? ");
         int acceptRate = console.nextInt();
         double extraEarnings = 0.0;
         if (acceptRate >= 95){
            extraEarnings = 0.2 * baseEarnings;
         }
         if (week == 1) {
            weekOneExtra == extraEarnings;
         } else if (week == 2) {
            weekTwoExtra == extraEarnings;
         }
         System.out.printf("\t-- Extra earnings = $%.2f --\n", extraEarnings);
      } else if (UorL == 2) {
         System.out.print("\tHow much did you earn in tips? ");
         double tips = console.nextDouble();
         System.out.printf("\t-- Extra earnings = $%.2f  --\n", tips);
      } 
   }
   
   public static void conclusionForEarning() {
      
   }
}