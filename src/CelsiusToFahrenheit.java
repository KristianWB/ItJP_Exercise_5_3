public class CelsiusToFahrenheit {
    public static void main(String[] args)   {

        /*
        We must built a loop that counts 1 to 100 celsius, converts it to fahrenheit and print it to screen
         */
            // Declaring essential variables
        double fahrenheit = 1;  // Declaring the fahrenheit as a double because we want the decimals for precision

            // The loop
        for (double celsius = 0; celsius <= 100; ++celsius) {  // Building the counter, making the generic i into celsius for ease
            fahrenheit = ((celsius * 9.0) / 5) + 32;    // The conversion formula
            System.out.print(
                    celsius + "\u2103" );   // Spicing up the display of celsius value with a sexy celsius sign after the value
            System.out.printf(
                    ".........." + String.format("%.2f", fahrenheit));     // Making the fahrenheit display more sexy with digit format
            System.out.print("\u2109" + "\n");  // Sexing up the print with a fahrenheit sign
        }
    }
}
