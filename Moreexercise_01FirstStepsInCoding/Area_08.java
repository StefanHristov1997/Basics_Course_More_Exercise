package Moreexercise_01FirstStepsInCoding;

import java.util.Scanner;

public class Area_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());

        double calculatedArea = Math.PI * r * r;
        double calculatedParameter = 2 * Math.PI * r;


        System.out.printf("%.2f\n", calculatedArea);
        System.out.printf("%.2f", calculatedParameter);
    }
}
