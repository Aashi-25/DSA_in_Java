import java.util.Scanner;
public class TempConverter {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Please enter temperature in Celsius: ");
        float tempC = obj.nextFloat();

        float tempF = (tempC * 9/5) + 32;

        System.out.println(tempC + " in fahrenheit = " + tempF);

    }
}
