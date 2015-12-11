package io.github.zebMcCorkle.AlgebraII;

public class SyntheticDivision {
    public static Result divide(double[] coefficients, double root) {
        Result result = new Result(coefficients.length - 1);
        result.setCoefficient(0, coefficients[0]);
        for (int i = 1; i < coefficients.length; i++) {
            double coefficient = coefficients[i];
            if (i == coefficients.length - 1) {
                result.setRemainder(coefficient + (result.getCoefficient(i - 1) * root));
            } else {
                result.setCoefficient(i, coefficient + (result.getCoefficient(i - 1) * root));
            }
        }
        return result;
    }

    public static class Result {
        private double[] coefficients;
        private double remainder;
        private int amount;

        protected Result(int length) {
            coefficients = new double[length];
            amount = length;
        }

        public void setCoefficient(int index, double value) {
            coefficients[index] = value;
        }
        public double getCoefficient(int index) {
            return coefficients[index];
        }

        public void setRemainder(double value) {
            remainder = value;
        }
        public double getRemainder() {
            return remainder;
        }

        public double[] getCoefficientArray() {
            double[] ret = new double[coefficients.length];
            System.arraycopy(coefficients, 0, ret, 0, coefficients.length);
            return ret;
        }
        public int getCoefficientAmount() {
            return amount;
        }
    }
}
