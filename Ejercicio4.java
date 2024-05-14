public class Ejercicio4 {



        public static void main(String[] args) {
            double[] xValues = {1, 2.5, 4, 5};
            double[] yValues = {2, 4, 7, 9};
            double x = 3;

            double interpolatedValue = Ejercicio1.lagrangeInterpolation(x, xValues, yValues);
            System.out.println("Interpolación para x = " + x + ": " + interpolatedValue);
        }



}
