public class Taylor {
    public double factorial(double y) {
        int a = 1;
        for (int i = 2; i <= y; i++) {
            a *= i;
        }
        return a;
    }
  
    public double sine(double x) {
        double degree = 17;
        double sum = 0;
        for (int c = 0; c < degree; c++) {
            double alt = Math.pow(-1, c);
            double xpart = Math.pow(x, 2*c+1);
            double denom = factorial(2*c+1);
            sum += (alt*xpart)/denom;
        }
        return sum;
    }
}

