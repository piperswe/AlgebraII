package io.github.zebMcCorkle.AlgebraII;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoSyntheticDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> coefficients = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            coefficients.add(Double.parseDouble(line));
        }
        double[] coefficientsArray = new double[coefficients.size() - 1];
        double root = 0;
        for (int i = 0; i < coefficients.size(); i++) {
            double coefficient = coefficients.get(i);
            if (i == coefficients.size() - 1) {
                root = coefficient;
            } else {
                coefficientsArray[i] = coefficient;
            }
        }
        SyntheticDivision.Result result = SyntheticDivision.divide(coefficientsArray, root);
        for (int i = 0; i < result.getCoefficientAmount(); i++) {
            System.out.printf("coefficient %f%n", result.getCoefficient(i));
        }
        System.out.printf("remainder %f%n", result.getRemainder());
    }
}
