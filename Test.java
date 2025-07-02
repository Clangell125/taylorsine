
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        System.out.println("How many degrees to calculate the sine of?: ");
        Scanner d = new Scanner(System.in);
        double degrees = d.nextInt();
        degrees = Math.toRadians(degrees);
        Taylor obj = new Taylor();
        System.out.println(obj.sine(degrees));
        d.close();
    }
}
