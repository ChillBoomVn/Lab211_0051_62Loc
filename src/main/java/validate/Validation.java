/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author vuatr
 */
public class Validation {

    private static Scanner sc = new Scanner(System.in);
    private static List<Integer> list = new ArrayList<>();

    public static int getInt(String msg, int min, int max) {
        int n;
        while (true) {
            try {
                System.out.println(msg);
                n = Integer.parseInt(sc.nextLine());
                if (n >= min && n <= max) {
                    break;
                }
                throw new NumberFormatException();
            } catch (NumberFormatException ex) {
                System.err.println("Enter again ");
            }

        }
        return n;
    }

    public static double getDouble(String msg, double min, double max) {
        double n;
        while (true) {
            try {
                System.out.println(msg);
                n = Double.parseDouble(sc.nextLine());
                if (n >= min && n <= max) {
                    break;
                }
                throw new NumberFormatException();
            } catch (NumberFormatException ex) {
                System.err.println("Enter again ");
            }

        }
        return n;
    }
    public static int inputInt(){
      int n = getInt("Enter Number; ",0, Integer.MAX_VALUE);
      return n;
    }
    //-----------------------------------------------------------//
    public static String checkOperator(String msg){
    String ope;
        while(true){
            System.out.println(msg);
         ope = sc.nextLine();
        if(ope.isEmpty()){
            System.err.println("Not empty");
        }
      if(ope.equalsIgnoreCase("+")||ope.equalsIgnoreCase("-")||ope.equalsIgnoreCase("*")
              ||ope.equalsIgnoreCase("/")||ope.equalsIgnoreCase("^")||ope.equalsIgnoreCase("=")){
         break;
      }
      else{
          System.out.println("Please Enter (+, -, * ,/, ^): ");
      }
    }
        return ope;
    }
    public static String BMIStatus(double bmi) {
        if (bmi < 19) {
            return "Under-standard.";
        } else if (bmi >= 19 && bmi < 25) {
            return "Standard.";
        } else if (bmi >= 25 && bmi < 30) {
            return "Overweight.";
        } else if (bmi >= 30 && bmi < 40) {
            return "Fat-should lose weight";
        } else {
            return "Very fat - should lose weight immediately";
        }
    }

}
