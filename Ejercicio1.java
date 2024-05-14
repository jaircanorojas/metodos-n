public class Ejercicio1 {

    public static double lagrangeInterpolation(double x, double[] xValues, double[] yValues) {
        double result = 0;
        for (int i = 0; i < xValues.length; i++) {
            double term = yValues[i];
            for (int j = 0; j < xValues.length; j++) {
                if (j != i) {
                    term *= (x - xValues[j]) / (xValues[i] - xValues[j]);
                }
            }
            result += term;
        }
        return result;
    }

    public static void main(String[] args) {
        double[] xValues = {1, 3};
        double[] yValues = {2, 4};
        double x = 2;

        double interpolatedValue = lagrangeInterpolation(x, xValues, yValues);
        System.out.println("Interpolación para x = " + x + ": " + interpolatedValue);
    }
}
