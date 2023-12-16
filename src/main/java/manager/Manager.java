/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manager;

import java.util.Scanner;
import validate.Validation;

/**
 *
 * @author vuatr
 */
import java.util.Scanner;

/**
 *
 * @author THAYCACAC
 */
public class Manager {

    private static final Scanner in = new Scanner(System.in);

   public static void normalCalculator() {
    double memory = 0;
    int number = Validation.getInt("Enter Number1: ", 0, Integer.MAX_VALUE);
    String operator;

    while (true) {
        operator = Validation.checkOperator("Enter Operator: ");

               switch (operator) {
            case "+":
                int number2 = Validation.inputInt();
                memory = number + number2;
                number = (int) memory; // Cập nhật number với kết quả mới
                break;
            case "-":
                int number3 = Validation.inputInt();
                memory -= number-number3;
                number = (int) memory; // Cập nhật number với kết quả mới
                break;
            case "/":
                int number4 = Validation.inputInt();
                memory /= number/ number4;
                number = (int) memory; // Cập nhật number với kết quả mới
                break;
            case "*":
                int number5 = Validation.inputInt();
                memory *= number*number5;
                number = (int) memory; // Cập nhật number với kết quả mới
                break;
            case "^":
                int number6 = Validation.inputInt();
                memory = Math.pow(number, number6);
                number = (int) memory; // Cập nhật number với kết quả mới
                break;
            case "=":
                System.out.println("Result: " + memory);
                return;
        }

        System.out.println("Memory: " + memory);
    }
}

    //allow user BMI calculator
    public static void BMICalculator() {
        double weight = Validation.getDouble("Enter Weight(kg): ", 0, Double.MAX_VALUE);
        double height = Validation.getDouble("Enter Height(cm):", 0, Double.MAX_VALUE);
        double bmi = weight * 10000 / (height * height);
        System.out.printf("BMI number: %.2f\n", bmi);
        System.out.println("BMI Status: " + Validation.BMIStatus(bmi));
    }
}
