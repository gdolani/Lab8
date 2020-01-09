
package edu.cscc;

import java.util.Scanner;

// TODO  Name: Girma Duresso, date: 11/02/2019.
//  Purpose: This program calculates users' body mass index (BMI) after they enter their weight and height then validates.

public class Main {

        private static Scanner input = new Scanner(System.in);
        private static final String INPUT_ERROR = "Input is not valid, try again";

        public static void main(String[] args) {
            double lbs, inches, meters, kgs, bmi;
            String classification;
            System.out.println("Calculate BMI");
            do {
                lbs = inputWeight();
            } while (lbs <= 0.0);
            do {
                inches = inputHeight();
            } while (inches <= 0.0);
            kgs = convertToKilograms(lbs);
            meters = convertToMeters(inches);
            bmi = calcBMI(kgs, meters);
            System.out.println("Your BMI is " + bmi);
            System.out.println(bmiClassification(bmi));
        }
        private static double inputWeight() {
            System.out.print("Enter weight (lbs): ");
            String pounds = input.nextLine();
            try {
                double value = Double.parseDouble(pounds);
                if (value <= 0.0) {
                    value = 0.0;
                    System.out.println(INPUT_ERROR);
                }
                return value;
            } catch (NullPointerException ex) {
                System.out.println(INPUT_ERROR);
                return 0.0;
            } catch (NumberFormatException e) {
                System.out.println(INPUT_ERROR);
                return 0.0;
            } catch (Exception e) {
                System.out.println(INPUT_ERROR);
                return 0.0;
            }
        }
        private static double inputHeight() {
            System.out.print("Enter height (inches):");
            String height = input.nextLine();
            try {
                double value = Double.parseDouble(height);
                if (value <= 0.0) {
                    value = 0.0;
                    System.out.println(INPUT_ERROR);
                }
                return value;
            } catch (NullPointerException ex) {
                System.out.println(INPUT_ERROR);
                return 0.0;
            } catch (NumberFormatException e) {
                System.out.println(INPUT_ERROR);
                return 0.0;
            } catch (Exception e) {
                System.out.println(INPUT_ERROR);
                return 0.0;
            }
        }
        private static double convertToKilograms(double lbs) {
            return (lbs / 2.2046);
        }
        private static double convertToMeters(double inches) {
            return (inches / 39.37);
        }
        private static double calcBMI(double weight, double height) {
            return (weight / (height * height));
        }
        private static String bmiClassification(double bmi) {
            if (bmi < 18.5) {
                return "Your BMI classification is Underweight";
            } else if (bmi >= 18.5 && bmi < 25) {
                return "Your BMI classification is Normal";
            } else if (bmi >= 25 && bmi < 30) {
                return "Your BMI classification is Overweight";
            } else if (bmi > 30) {
                return "Your BMI classification is Obese";
            } else {
                return "";
            }
        }
    }










