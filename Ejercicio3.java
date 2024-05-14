public class Ejercicio3 {

        public static void main(String[] args) {
            double[] xValues = {1, 3, 5, 7};
            double[] yValues = {2, 6, 12, 20};
            double x = 4;

            double interpolatedValue = Ejercicio1.lagrangeInterpolation(x, xValues, yValues);
            System.out.println("Interpolación para x = " + x + ": " + interpolatedValue);
        }

}
